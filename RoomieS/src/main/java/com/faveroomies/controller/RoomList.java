/**
 * <p>Project name is RoomieS<br>
 * Package name is com.faveroomies.controller<br>
 * File name is RoomList.java<br>
 *
 * @author YeonGyu Yang
 * @since May 10, 2016
 */
package com.faveroomies.controller;

import java.util.ArrayList;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.faveroomies.DTO.EmptyRoomImpl;
import com.faveroomies.mapper.RoomMapper;

/**
 * 
 * @author YeonGyu Yang
 * @Since May 10, 2016
 *
 */
@Controller
@MapperScan("com.faveroomies.mapper")
public class RoomList {

	@Autowired
	private RoomMapper roomMapper;
	
	@RequestMapping("/emptyroom")
	public String emptyRoomList (ModelMap modelMap) {

		ArrayList<EmptyRoomImpl> emptyRooms = new ArrayList<>();
		
		emptyRooms = roomMapper.emptyRoomeList();
		
		modelMap.addAttribute("emptyRooms", emptyRooms);
		
		return "emptyroom";
		
	}
	
	
}