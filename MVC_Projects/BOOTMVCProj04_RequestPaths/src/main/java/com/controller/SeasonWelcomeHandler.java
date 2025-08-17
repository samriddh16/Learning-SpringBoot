package com.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.service.IService;

@Controller("controller")
@RequestMapping("/homeController")
public class SeasonWelcomeHandler {

	@Autowired
	IService service;
	
	// By default it is "/"
	/*@RequestMapping
	public String getMessage(Map<String, Object> map) {
		String msg = service.getWelcomeMessage();
		map.put("welcomeMsg",msg);
		return "displayWelcomeMsg";
	}
	
	@RequestMapping({"/season1","/season2","/season3"})
	public String getSeason(Map<String, Object> map) {
		String name = service.getSeasonName();
		map.put("seasonName", name);
		return "displaySeasonName";
	
	}*/
	
	@GetMapping("/")
	public String getHome() {
		return "home";
	}

	// Remember if we give two handler methods same request path with same request method type whether
	// they are in same controller class or different controller class it will cause ambiguity problem
	@GetMapping("/display")
	public String getMessage(Map<String, Object> map) {
		String msg = service.getWelcomeMessage();
		map.put("welcomeMsg",msg);
		return "displayWelcomeMsg";
	}
	
	@PostMapping("/display")
	public String getSeason(Map<String, Object> map) {
		String name = service.getSeasonName();
		map.put("seasonName", name);
		return "forward:/testController/display";
	
	}
}
