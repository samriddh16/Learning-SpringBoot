package com.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("voter")
@PropertySource("com/commons/voterInfo.properties")
public class Voter {

	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
	private Integer age;
	private Date dov;
	
	@jakarta.annotation.PreDestroy
	public void myDestroy(){
		System.out.println("Voter.myDestroy()");
		name=null;
		age=null;
		dov=null;
	}
	
	@jakarta.annotation.PostConstruct
	public void myInit(){
		System.out.println("Voter.myInit()");
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
