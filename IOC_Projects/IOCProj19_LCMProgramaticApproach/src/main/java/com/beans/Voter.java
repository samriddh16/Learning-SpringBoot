package com.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Voter implements InitializingBean, DisposableBean {

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
	
	@Override
	public void destroy() throws Exception {
		name=null;
		age=null;
		dov=null;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		if(dov==null)
			dov= new Date();
		if(age<0 || age==null || name==null)
			throw new IllegalArgumentException("Invalid inputs are given for name or age or both");
	}
	
	@Override
	public String toString() {
		return "Voter [name=" + name + ", age=" + age + ", dov=" + dov + "]";
	}

}
