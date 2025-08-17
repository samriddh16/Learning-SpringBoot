package com.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class Voter {

	private String name;
	private Integer age;
	private Date dov;
	
	public void setName(String name) {
		System.out.println("Voter.setName()");
		this.name = name;
	}
	public void setAge(Integer age) {
		System.out.println("Voter.setAge()");
		this.age = age;
	}
	
	public void myinit() {
		if(dov==null)
			dov= new Date();
		if(age<0 || age==null || name==null)
			throw new IllegalArgumentException("Invalid inputs are given for name or age or both");
	}
	
	public void mydestroy() {
		name=null;
		age=null;
		dov=null;
	}
	
	
	@Override
	public String toString() {
		return "Voter [name=" + name + ", age=" + age + ", dov=" + dov + "]";
	}
	
}
