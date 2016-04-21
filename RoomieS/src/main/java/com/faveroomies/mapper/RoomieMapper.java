/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.mapper<br>
 * File name is Roomie.java<br>
 *
 * @author YeonGyu Yang
 * @since Mar 15, 2016
 */
package com.faveroomies.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.faveroomies.DTO.Member;

/**
 * 
 * @author YeonGyu Yang
 * @Since Mar 15, 2016
 *
 */
public interface RoomieMapper {

	@Insert("insert into roomie(mUser, mEmail, mPassword) values(#{user}, #{email}, #{password})")
	int insertRoomie(@Param("user") String user, @Param("email") String email, @Param("password") String password);

	@Select("select * from member")
	ArrayList<Member> selectAll();

	@Select("select * from member where mNum = #{num}")
	ArrayList<Member> selectNum(@Param("num") int num);

	@Select("select * from member where mName = #{name}")
	ArrayList<Member> selectName(@Param("name") String name);

	@Select("select * from member where mEmail = #{email}")
	ArrayList<Member> selectEmail(@Param("email") String email);

}
