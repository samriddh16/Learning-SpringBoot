package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.IService;

@Controller("anotherController")
@RequestMapping("/testController")
public class AnotherSeasonWelcomeHandler {

	@Autowired
	IService service;

	
	/*@GetMapping("/display")
	public String getSeason(Map<String, Object> map) {
		String name = service.getSeasonName();
		map.put("seasonName", name);
		return "displaySeasonName2";
	
	}*/
	@PostMapping("/display")
	public String getSeason(Map<String, Object> map) {
		String name = service.getSeasonName();
		map.put("seasonName", name);
		return "displaySeasonName2";
		
	}
}
