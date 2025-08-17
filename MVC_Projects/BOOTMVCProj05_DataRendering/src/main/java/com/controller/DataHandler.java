package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.model.Employee;

// Data Rendering is passing data from controller to view componenet throught shared memmory              
@Controller("dataController")
public class DataHandler {

	/*// Passing Simple Values
	@GetMapping("/disp1")
	public String displayMsg(Map<String, Object>map) {
		System.out.println("DataHandler.displayMsg()");
		map.put("name", "Samriddh");
		map.put("desig", "Java Developer");
		return "display1";
	}*/

	/*// Passing Arrays and Collections
	@GetMapping("/disp1")
	public String displayMsg(Map<String, Object> map) {
		System.out.println("DataHandler.displayMsg()");
		map.put("names", new String[] { "Samriddh", "Neelay", "Ayush", "Divyansh" });
		map.put("desigs", List.of("Java Developer", "Data Scientist", "ML Enginner", "Data Analyst"));
		map.put("ids", Map.of("Adhaar", 2378499, "Voter", 43284493, "Driving", 83493438, "Pan", 3728482));
		return "display1";
	}*/
	
	// Passing Model Class
	/*@GetMapping("/disp1")
	 public  String  showData(Map<String,Object> map) {
		 //keep the data in model attributes  (Model class object)
		       Employee emp=new Employee(101,"raja","hyd",900000.0);
		       map.put("empData", emp);
		   //return LVN
		   return "display1";
	}
	
	*/
	
	@GetMapping("/disp1")
	 public  String   showData(Map<String,Object> map) {
		 //keep the data in model attributes  (List of Model class objects)
		       Employee emp1=new Employee(101,"raja","hyd",900000.0);
		       Employee emp2=new Employee(102,"rajesh","vizag",900000.0);
		       Employee emp3=new Employee(103,"tarun","delhi",910000.0);
		       List<Employee> empsList=List.of(emp1,emp2,emp3);
		       
		       //add model attribute 
		       map.put("empsList", empsList);
		   
		   //return LVN
		   return "display1";
	}
}
