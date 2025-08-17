package com.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.service.IService;

// Remember- If we do not return anything(void return type) or return null then in that case the
// the requestMappingPath will be taken as the jsp filename.
@Controller("controller")
public class SeasonWelcomeHandler {

	@Autowired
	IService service;

	/*@RequestMapping("/")
	public String getMessage(Map<String, Object> map) {
		String msg = service.getWelcomeMessage();
		map.put("welcomeMsg", msg);
		return "displayWelcomeMsg";
	}
	
	@RequestMapping("/season")
	public String getSeason(Map<String, Object> map) {
		String name = service.getSeasonName();
		map.put("seasonName", name);
		return "displaySeasonName";
	
	}*/
	
	// =========================
	// FORWARD (Request Forwarding)
	// =========================

	// Forwarding happens SERVER-SIDE
	// Browser URL does NOT change
	// Request attributes (like Model) are SHARED between handlers
	// Scope: Same web application only
	// Use case: Internal handler chaining, passing data between controllers/views

	// =========================
	// REDIRECT (HTTP Redirection)
	// =========================

	// Redirect happens CLIENT-SIDE
	// Browser URL CHANGES to the target URL
	// Request attributes are NOT shared (new request is made)
	// Scope: Can be within same app or to external apps
	// Use case: Navigate to a new page, after form submission (Post/Redirect/Get pattern)
	@RequestMapping("/")
	public String getMessage(Map<String, Object> map) {
		System.out.println("SeasonWelcomeHandler.getMessage()");
		return "redirect:season";
	}
	
	@RequestMapping("/season")
	public String getSeason(Map<String, Object> map) {
		System.out.println("SeasonWelcomeHandler.getSeason()");
		String name = service.getSeasonName();
		map.put("seasonName", name);
		return "displaySeasonName";
	
	}
}
