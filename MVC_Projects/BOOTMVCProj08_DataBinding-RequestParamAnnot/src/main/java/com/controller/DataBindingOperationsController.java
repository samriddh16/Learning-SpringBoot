package com.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataBindingOperationsController {

	/*@GetMapping("/data")
	public String bindData(@RequestParam("sno") int no, @RequestParam("sname") String name) {
		System.out.println(no + "  ....." + name);
		// return LVN
		return "show_result";
	}*/

	/*@GetMapping("/data")
	public String bindData(@RequestParam(required = false) String sname, @RequestParam int sno) {
	
		System.out.println(sno + "  ....." + sname);
		// return LVN
		return "show_result";
	}*/
	
	// Remember one thing here we set default value as RRR so when wrong input name is entered in the 
	// URL then it will take that name but this is only in the method scope i.e, in the method if 
	// we print that varible name we will get RRR but not on the browser.
	/*@GetMapping("/data")
	public String bindData(@RequestParam(defaultValue = "RRR") String sname,
			@RequestParam(required = false) Integer sno) {
	
		System.out.println(sno + "  ....." + sname);
		// return LVN
		return "show_result";
	}*/
	
	/*@GetMapping("/data")
	public String bindData(@RequestParam int sno, @RequestParam String sname,
			@RequestParam(name = "sadd") String[] saddArray, @RequestParam(name = "sadd") List saddList,
			@RequestParam(name = "sadd") Set saddSet) {
	
		System.out.println(
				sno + "  ....." + sname + "....." + Arrays.toString(saddArray) + "...." + saddList + "...." + saddSet);
		// return LVN
		return "show_result";
	}*/
	
	// Remember here we if we send multiple values for a single attribute then they will be stored
	// as comma seperated values in the method scope , but in the browser only the first value 
	// will be displayed not all values.
	@GetMapping("/data")
	public String bindData(@RequestParam int sno, @RequestParam String sname,
			@RequestParam(name = "sadd") String sadd) {
		System.out.println(sno + "  ....." + sname + "....." + sadd);
		// return LVN
		return "show_result";
	}
	// Also remember one thing suppse with request param we specify three attributes but in the url
	// through the bowser we are sending four different atributes names then no exception will 
	// be thrown, the attribute which is not mentioned with the request param will be ignored.

}
