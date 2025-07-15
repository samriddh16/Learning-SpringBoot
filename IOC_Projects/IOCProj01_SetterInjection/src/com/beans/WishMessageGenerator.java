package com.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
      private LocalDateTime ldt;

    @Autowired
	public void setLdt(LocalDateTime ldt) {
		System.out.println("WishMessageGenerator.setLdt()");       //systrace+ ctrl+space
		this.ldt = ldt;
	}
      
    public String generateMessage(String user) {
    	System.out.println("WishMessageGenerator.generateMessage()");
    	if(ldt.getHour()<12)
    		return "Good Morning "+user;
    	else if(ldt.getHour()<16)
    		return "Good Afternoon "+user;
    	else if(ldt.getHour()<20)
    		return "Good Evening "+user;
    	else
    		return "Good Night "+user;
    }
}
