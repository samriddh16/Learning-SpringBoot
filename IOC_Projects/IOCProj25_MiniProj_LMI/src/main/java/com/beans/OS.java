package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("os")
public class OS {

	@Value("${oss.name}")
	private String name;
	@Value("${oss.instructor}")
	private String instructor;
	@Value("${oss.length}")
	private String length;
	@Value("${oss.credit}")
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
