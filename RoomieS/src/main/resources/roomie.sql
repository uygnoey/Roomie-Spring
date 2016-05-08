-- Drop
-- 집
ALTER TABLE home
	DROP FOREIGN KEY FK_home_mNum; -- 룸메 -> 집

-- 유틸리티 빌
ALTER TABLE utilityBill
	DROP FOREIGN KEY FK_utilityBill_hNum; -- 집 -> 유틸리티 빌

-- 유틸리티 파일
ALTER TABLE utilityFile
	DROP FOREIGN KEY FK_utilityFile_ubNum; -- 유틸리티 빌 -> 유틸리티 파일

-- 방
ALTER TABLE room
	DROP FOREIGN KEY FK_room_hNum; -- 집 -> 방

-- 집평가
ALTER TABLE homeRate
	DROP FOREIGN KEY FK_homeRate_cNum; -- 방계약 -> 집평가

-- 집평가
ALTER TABLE homeRate
	DROP FOREIGN KEY FK_homeRate_hNum; -- 집 -> 집평가

-- 방계약
ALTER TABLE roomContract
	DROP FOREIGN KEY FK_roomContract_rNum; -- 방 -> 방계약

-- 방계약
ALTER TABLE roomContract
	DROP FOREIGN KEY FK_roomContract_mNum; -- 룸메 -> 방계약

-- 룸메평가
ALTER TABLE roomieRate
	DROP FOREIGN KEY FK_roomieRate_cNum; -- 방계약 -> 룸메평가

-- 룸메평가
ALTER TABLE roomieRate
	DROP FOREIGN KEY FK_roomieRate_mNum; -- 룸메 -> 룸메평가

-- 방계약서
ALTER TABLE agreement
	DROP FOREIGN KEY FK_agreement_cNum; -- 방계약 -> 방계약서

-- 룸메
ALTER TABLE roomie
	DROP PRIMARY KEY; -- 룸메 기본키

-- 집
ALTER TABLE home
	DROP PRIMARY KEY; -- 집 기본키

-- 유틸리티 빌
ALTER TABLE utilityBill
	DROP PRIMARY KEY; -- 유틸리티 빌 기본키

-- 유틸리티 파일
ALTER TABLE utilityFile
	DROP PRIMARY KEY; -- 유틸리티 파일 기본키

-- 방
ALTER TABLE room
	DROP PRIMARY KEY; -- 방 기본키

-- 집평가
ALTER TABLE homeRate
	DROP PRIMARY KEY; -- 집평가 기본키

-- 방계약
ALTER TABLE roomContract
	DROP PRIMARY KEY; -- 방계약 기본키

-- 룸메평가
ALTER TABLE roomieRate
	DROP PRIMARY KEY; -- 룸메평가 기본키

-- 방계약서
ALTER TABLE agreement
	DROP PRIMARY KEY; -- 방계약서 기본키

-- 아이디 유니크
DROP INDEX UQ_ropmie_username ON roomie;

-- 이메일 유니크
DROP INDEX UQ_ropmie_email ON roomie;

-- 집이름 유니크
DROP INDEX UQ_home_hName ON home;

-- 룸메
DROP TABLE IF EXISTS roomie RESTRICT;

-- 집
DROP TABLE IF EXISTS home RESTRICT;

-- 유틸리티 빌
DROP TABLE IF EXISTS utilityBill RESTRICT;

-- 유틸리티 파일
DROP TABLE IF EXISTS utilityFile RESTRICT;

-- 방
DROP TABLE IF EXISTS room RESTRICT;

-- 집평가
DROP TABLE IF EXISTS homeRate RESTRICT;

-- 방계약
DROP TABLE IF EXISTS roomContract RESTRICT;

-- 룸메평가
DROP TABLE IF EXISTS roomieRate RESTRICT;

-- 방계약서
DROP TABLE IF EXISTS agreement RESTRICT;

-- 생성

-- 권한

CREATE TABLE authenticated (
	aNum      INT          NOT NULL AUTO_INCREMENT,
    aAuth     VARCHAR(100)  NOT NULL,
    Constraint PK_authenticated_aNum Primary key (aNum)
);

Create Unique Index UQ_authenticated_aAuth
	on authenticated (
		aAuth ASC
	);
    
Alter Table authenticated
	AUTO_INCREMENT = 1;
    
-- 룸메

CREATE TABLE roomie (
	mNum      INT          NOT NULL AUTO_INCREMENT, -- 회원번호
	mUser     VARCHAR(30)  NOT NULL, -- 아이디
	mName     VARCHAR(100) NULL,     -- 이름
	mPhone    VARCHAR(20)  NULL,     -- 전화번호
	mEmail    VARCHAR(200) NOT NULL, -- 이메일
	mPassword VARCHAR(255) NOT NULL, -- 비밀번호
    aNum      INT          NOT NULL DEFAULT 1, -- 인증코드
	mDate     TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP, -- 가입일
    mEnabled   boolean	   NOT NULL DEFAULT 1,
    mConfirmed boolean NOT NULL DEFAULT 2,
    Constraint PK_member_mNum Primary key (mNum)
);

-- 아이디 유니크
CREATE UNIQUE INDEX UQ_ropmie_username
	ON roomie ( -- 룸메
		mUser ASC -- 아이디
	);

-- 이메일 유니크
CREATE UNIQUE INDEX UQ_ropmie_email
	ON roomie ( -- 룸메
		mEmail ASC -- 이메일
	);

ALTER TABLE roomie
	AUTO_INCREMENT = 1;

-- 집
CREATE TABLE home (
	hNum     INT          NOT NULL AUTO_INCREMENT, -- 집번호
	hName    VARCHAR(30)  NOT NULL, -- 집이름
	mNum     INT          NOT NULL, -- 주인
	hRoom    INT          NOT NULL, -- 방 수
	hAddrSt1 VARCHAR(300) NOT NULL, -- 주소1
	hAddrSt2 VARCHAR(300) NULL,     -- 주소2
	hCity    VARCHAR(100) NOT NULL, -- 도시
	hState   VARCHAR(100) NOT NULL, -- 주/도
	hZipcode VARCHAR(10)  NOT NULL, -- 우편번호
	Constraint PK_home_hNum Primary key (hNum)
);

-- 집이름 유니크
CREATE UNIQUE INDEX UQ_home_hName
	ON home ( -- 집
		hName ASC -- 집이름
	);

ALTER TABLE home
	AUTO_INCREMENT = 1;

-- 유틸리티 빌
CREATE TABLE utilityBill (
	ubNum  INT       NOT NULL AUTO_INCREMENT, -- 유틸번호
	hNum   INT       NOT NULL, -- 집번호
	ubBill INT       NOT NULL, -- 유틸비
	ubDate TIMESTAMP NOT NULL, -- 유틸비 월
	CONSTRAINT PK_utilityBill_ubNum PRIMARY KEY (ubNum)
);

ALTER TABLE utilityBill
	AUTO_INCREMENT = 1;

-- 유틸리티 파일
CREATE TABLE utilityFile (
	ufNum  INT          NOT NULL AUTO_INCREMENT, -- 유틸파일번호
	ubNum  INT          NOT NULL, -- 유틸번호
	ufName VARCHAR(100) NOT NULL,  -- 유틸파일이름
    CONSTRAINT PK_utilityFile_ufNum PRIMARY KEY (ufNum)
);

        
ALTER TABLE utilityFile
	AUTO_INCREMENT = 1;

-- 방
CREATE TABLE room (
	rNum     INT          NOT NULL AUTO_INCREMENT, -- 방번호
	hNum     INT          NOT NULL, -- 집번호
	rName    VARCHAR(100) NOT NULL, -- 방이름
	rMaster  BOOLEAN      NOT NULL DEFAULT 0, -- 마스터룸
	rDeposit INT          NOT NULL DEFAULT 0, -- 방계약금
	rRental  INT          NOT NULL DEFAULT 0, -- 방렌트비
    CONSTRAINT PK_room_rNum PRIMARY KEY (rNum)
);

ALTER TABLE room
	AUTO_INCREMENT = 1;

-- 집평가
CREATE TABLE homeRate (
	hrNum    INT          NOT NULL AUTO_INCREMENT, -- 집평가번호
	hNum     INT          NOT NULL, -- 집번호
	cNum     INT          NOT NULL, -- 계약번호
	hrRate   INT          NOT NULL, -- 집 평가
	hrReason VARCHAR(300) NOT NULL, -- 평가 사유
	hrDate   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP, -- 평가일
    CONSTRAINT PK_homeRate_hrNum PRIMARY KEY (hrNum)
);

ALTER TABLE homeRate
	AUTO_INCREMENT = 1;

-- 방계약
CREATE TABLE roomContract (
	cNum       INT       NOT NULL AUTO_INCREMENT, -- 계약번호
	rNum       INT       NOT NULL, -- 방번호
	mNum       INT       NOT NULL, -- 회원번호
	cStartDate TIMESTAMP NOT NULL, -- 계약일
	cEndDate   TIMESTAMP NOT NULL, -- 계약만료일
	cDeposit   INT       NOT NULL DEFAULT 0, -- 방계약금
	cRental    INT       NOT NULL DEFAULT 0, -- 방렌트비
    CONSTRAINT PK_roomContract_cNum PRIMARY KEY (cNum)
);

ALTER TABLE roomContract
	AUTO_INCREMENT = 1;

-- 룸메평가
CREATE TABLE roomieRate (
	rrNum    INT          NOT NULL AUTO_INCREMENT, -- 룸메평가번호
	mNum     INT          NULL,     -- 회원번호
	cNum     INT          NULL,     -- 계약번호
	rrRate   INT          NOT NULL, -- 룸메평가
	rrReason VARCHAR(300) NOT NULL, -- 평가사유
	rrDate   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP, -- 평가일
    CONSTRAINT PK_roomieRate_rrNum PRIMARY KEY (rrNum)
);

ALTER TABLE roomieRate
	AUTO_INCREMENT = 1;

-- 방계약서
CREATE TABLE agreement (
	aNum       INT          NOT NULL AUTO_INCREMENT, -- 계약서번호
	cNum       INT          NOT NULL, -- 계약번호
	aAgreement VARCHAR(100) NOT NULL, -- 계약서
	aDate      TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP, -- 날짜
    CONSTRAINT PK_agreement_aNum PRIMARY KEY (aNum)
);

ALTER TABLE agreement
	AUTO_INCREMENT = 1;

-- 룸메
ALTER TABLE roomie
	ADD CONSTRAINT FK_roomie_aNum
		FOREIGN KEY (
			aNum
		)
        REFERENCES authenticated (
			aNum
		);

-- 집
ALTER TABLE home
	ADD CONSTRAINT FK_home_mNum -- 룸메 -> 집
		FOREIGN KEY (
			mNum -- 주인
		)
		REFERENCES roomie ( -- 룸메
			mNum -- 회원번호
		);

-- 유틸리티 빌
ALTER TABLE utilityBill
	ADD CONSTRAINT FK_utilityBill_hNum -- 집 -> 유틸리티 빌
		FOREIGN KEY (
			hNum -- 집번호
		)
		REFERENCES home ( -- 집
			hNum -- 집번호
		);

-- 유틸리티 파일
ALTER TABLE utilityFile
	ADD CONSTRAINT FK_utilityFile_ubNum -- 유틸리티 빌 -> 유틸리티 파일
		FOREIGN KEY (
			ubNum -- 유틸번호
		)
		REFERENCES utilityBill ( -- 유틸리티 빌
			ubNum -- 유틸번호
		);

-- 방
ALTER TABLE room
	ADD CONSTRAINT FK_room_hNum -- 집 -> 방
		FOREIGN KEY (
			hNum -- 집번호
		)
		REFERENCES home ( -- 집
			hNum -- 집번호
		);

-- 집평가
ALTER TABLE homeRate
	ADD CONSTRAINT FK_homeRate_cNum -- 방계약 -> 집평가
		FOREIGN KEY (
			cNum -- 계약번호
		)
		REFERENCES roomContract ( -- 방계약
			cNum -- 계약번호
		);

-- 집평가
ALTER TABLE homeRate
	ADD CONSTRAINT FK_homeRate_hNum -- 집 -> 집평가
		FOREIGN KEY (
			hNum -- 집번호
		)
		REFERENCES home ( -- 집
			hNum -- 집번호
		);

-- 방계약
ALTER TABLE roomContract
	ADD CONSTRAINT FK_roomContract_rNum -- 방 -> 방계약
		FOREIGN KEY (
			rNum -- 방번호
		)
		REFERENCES room ( -- 방
			rNum -- 방번호
		);

-- 방계약
ALTER TABLE roomContract
	ADD CONSTRAINT FK_roomContract_mNum -- 룸메 -> 방계약
		FOREIGN KEY (
			mNum -- 회원번호
		)
		REFERENCES roomie ( -- 룸메
			mNum -- 회원번호
		);

-- 룸메평가
ALTER TABLE roomieRate
	ADD CONSTRAINT FK_roomieRate_cNum -- 방계약 -> 룸메평가
		FOREIGN KEY (
			cNum -- 계약번호
		)
		REFERENCES roomContract ( -- 방계약
			cNum -- 계약번호
		);

-- 룸메평가
ALTER TABLE roomieRate
	ADD CONSTRAINT FK_roomieRate_mNum -- 룸메 -> 룸메평가
		FOREIGN KEY (
			mNum -- 회원번호
		)
		REFERENCES roomie ( -- 룸메
			mNum -- 회원번호
		);

-- 방계약서
ALTER TABLE agreement
	ADD CONSTRAINT FK_agreement_cNum -- 방계약 -> 방계약서
		FOREIGN KEY (
			cNum -- 계약번호
		)
		REFERENCES roomContract ( -- 방계약
			cNum -- 계약번호
		);
        
CREATE OR replace VIEW auth as
	select r.mUser as username, r.mPassword as password, r.mEnabled as enabled, a.aAuth as role from roomie r
    join authenticated a
    on r.aNum = a.aNum;
    
create or replace view member as 
	select r.mNum, r.mUser, r.mName, r.mPhone, r.mEmail, a.aNum, a.aAuth, r.mDate, 
		case r.mEnabled when 1 then 'Enabled' else 'Disabled' end as mEnabled, 
        case r.mConfirmed when 1 then 'Confirmed' else 'Unconfirmed' end as mConfirmed
    from roomie r
    join authenticated a
    on r.aNum = a.aNum;
    
insert into authenticated(aAuth) values('roomie'), ('manager'), ('admin');