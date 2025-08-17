package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("java")
public class Java {

	@Value("${java.name}")
	private String name;
	@Value("${java.instructor}")
	private String instructor;
	@Value("${java.length}")
	private String length;
	@Value("${java.credit}")
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
