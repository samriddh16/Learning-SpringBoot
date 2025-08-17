package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("algo")
public class Algorithms {

	@Value("${algo.name}")
	private String name;
	@Value("${algo.instructor}")
	private String instructor;
	@Value("${algo.length}")
	private String length;
	@Value("${algo.credit}")
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
