package com.beans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
      private LocalDateTime ldt;
      private Date dt;
      
		/* @Autowired
		public WishMessageGenerator(LocalDateTime ldt, Date dt) {       // ctrl+shift+O
			System.out.println("2 Param Constructor");
			this.ldt = ldt;
			this.dt=dt;
		}
		                                                                                   // We cannot place overloaded constructors with @Autowired annotation.
		@Autowired
		public WishMessageGenerator(LocalDateTime ldt) {       // ctrl+shift+O
		    System.out.println("1 Param Constructor");
			this.ldt = ldt;
		}*/

    @Autowired
	public void setLdt(LocalDateTime ldt) {
		this.ldt = ldt;
	}


    @Autowired
	public void setDt(Date dt) {
		this.dt = dt;
	}



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
