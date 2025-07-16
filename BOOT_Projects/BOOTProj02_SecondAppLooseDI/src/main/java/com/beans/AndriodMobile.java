package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mobile")
public class AndriodMobile {

	public AndriodMobile() {
		System.out.println("AndriodMobile: 0 param constructor");
	}

	@Autowired
    @Qualifier("card")
	private ISIMCard sim;
	
	public void mobileSystem() {
		System.out.println("This Android mobile uses "+sim.FiveG());
		System.out.println("And also uses "+sim.SMS());
	}
}
