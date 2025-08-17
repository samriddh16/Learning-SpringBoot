package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("phy")
public class Physics {

	@Value("${phy.name}")
	private String name;
	@Value("${phy.instructor}")
	private String instructor;
	@Value("${phy.length}")
	private String length;
	@Value("${phy.credit}")
	private int credit;
	
	public String getName() {
		return name;
	}
	public String getInstructor() {
		return instructor;
	}
	public String getLength() {
		return length;
	}
	public int getCredit() {
		return credit;
	}	
}
