/**
 * <p>Project name is RoomieS<br>
 * Package name is com.faveroomies.mapper<br>
 * File name is RoomMapper.java<br>
 *
 * @author YeonGyu Yang
 * @since May 10, 2016
 */
package com.faveroomies.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Select;

import com.faveroomies.DTO.EmptyRoomImpl;

/**
 * 
 * @author YeonGyu Yang
 * @Since May 10, 2016
 *
 */
public interface RoomMapper {

	@Select("select * from emptyRoom")
	ArrayList<EmptyRoomImpl> emptyRoomeList();

}
