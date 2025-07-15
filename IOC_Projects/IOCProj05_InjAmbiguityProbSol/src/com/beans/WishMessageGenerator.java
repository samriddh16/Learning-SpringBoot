package com.beans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	  
	  @Autowired
	  @Qualifier("date3")
      private LocalDateTime date2;      


	public String generateMessage(String user) {
    	System.out.println("WishMessageGenerator.generateMessage()");
    	String st=date2.toString();
    	return st;
    }
}
