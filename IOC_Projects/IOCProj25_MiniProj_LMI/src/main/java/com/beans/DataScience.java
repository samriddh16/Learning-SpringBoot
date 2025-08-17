package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("data")
public class DataScience {

	@Value("${data.name}")
	private String name;
	@Value("${data.instructor}")
	private String instructor;
	@Value("${data.length}")
	private String length;
	@Value("${data.credit}")
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
