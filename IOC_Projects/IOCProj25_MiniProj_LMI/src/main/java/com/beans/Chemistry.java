package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("chem")
public class Chemistry {

	@Value("${chem.name}")
	private String name;
	@Value("${chem.instructor}")
	private String instructor;
	@Value("${chem.length}")
	private String length;
	@Value("${chem.credit}")
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
