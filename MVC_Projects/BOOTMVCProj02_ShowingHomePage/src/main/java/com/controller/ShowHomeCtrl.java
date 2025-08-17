package com.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// Data Rendering is passing values from the controller to view componenet via a shared memory
@Controller
public class ShowHomeCtrl {

	/*@RequestMapping("/home")
	public String showHome() {
		// Returning Logical View Name(LVN)
		return "welcome";
	}*/

	// By deafult without specifying any path info by the user the home page will be
	// displayed
	/*@RequestMapping("/")
	public String showHome() {
		// Returnign Logical View Name(LVN)
		return "welcome";
	}*/

	/*@RequestMapping("/")
	public String showHome(Map<String, Object> map) {
		// Model Class Name- BindingAwareModelMap
		System.out.println("Model Class Name- " + map.getClass());
		// Setting model attributes
		map.put("attr1", "Hello");
		map.put("attr2", LocalDate.now());
		return "model";
	}*/
	
	// Doing same thing with model class (Remember Map Interface is best for data rendering)
	/*@RequestMapping("/")
	public String showHome(Model model) {
		// Model Class Name- BindingAwareModelMap
		System.out.println("Model Class Name- " + model.getClass());
		// Setting model attributes
		model.addAttribute("attr1","Hello");
		model.addAttribute("attr2",LocalDate.now());
		return "model";
	}*/
	
	/*@RequestMapping("/model")
	public  Model  passData() {
	
		// add the model attributes
		   Model model=new BindingAwareModelMap();
		   model.addAttribute("attr1","Hello");
		   model.addAttribute("attr2", new Date());
		//return LVN (Logical view Name)
		return model;
	}*/
	
	// In this type where we return a model object or any other type, actually the shared memory is not 
	// created like where we specify model or map in the parameter
	@RequestMapping("/welcome")
	public  ModelAndView  passData() {
	
	     //create  ModelAndView object
		  ModelAndView mav=new ModelAndView();
		  mav.addObject("attr1", "Hello");
		  mav.addObject("attr2", new Date());
		  mav.setViewName("model");  // LVN
		//return LVN (Logical view Name)
		return mav;
	}
	
}
