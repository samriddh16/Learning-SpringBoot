package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.model.Student;

@Controller("binding")
public class DataBindHandler {

	@GetMapping("/")
	public String getHomePage() {
		return "welcome";
	}
	
	// Form Launching
	@GetMapping("/register")
	public String getRegisterPage( @ModelAttribute("stud") Student st) {
		return "register";
	}
	
	// Form Submission
	@PostMapping("/register")
	public String bindData(Map<String,Object> map , @ModelAttribute("stud1") Student st) {
		System.out.println("model class obj data ::"+st);
		//keep  Model class obj data as the model attribute
		map.put("studInfo", st);
		//return LVN
		return "show_result";
	}
}
