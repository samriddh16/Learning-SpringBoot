package com.beans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	  
	  @Autowired
      private LocalDateTime ldt;
	  @Autowired
      private Date dt;


	public String generateMessage(String user) {
    	System.out.println("WishMessageGenerator.generateMessage()");
    	if(ldt.getHour()<12)
    		return "Good Morning "+user+" ,Date- "+dt;
    	else if(ldt.getHour()<16)
    		return "Good Afternoon "+user+" ,Date- "+dt;
    	else if(ldt.getHour()<20)
    		return "Good Evening "+user+" ,Date- "+dt;
    	else
    		return "Good Night "+user+" ,Date- "+dt;
    }
}
