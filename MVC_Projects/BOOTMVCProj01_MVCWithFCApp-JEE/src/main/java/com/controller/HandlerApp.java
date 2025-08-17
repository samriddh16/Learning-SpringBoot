package com.controller;

import java.util.Set;

import com.service.ServiceApp;
import com.service.ServiceAppImpl;

import jakarta.servlet.http.HttpServletRequest;

public class HandlerApp {

	private ServiceApp service;
	
	public HandlerApp() {
		service = new ServiceAppImpl();
	}
	
	public String wishMsg(HttpServletRequest request) {
		String wishMsg = service.getWishMessage();
		request.setAttribute("msg", wishMsg);
		return "WM";
	}
	
	public String locInfo(HttpServletRequest request) {
		Set<String> locInf = service.getLocaleInfo();
		request.setAttribute("loc", locInf);
		return "LI";
	}
	
}
