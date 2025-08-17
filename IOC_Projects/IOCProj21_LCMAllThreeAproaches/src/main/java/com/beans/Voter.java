package com.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("voter")
@PropertySource("com/commons/voterInfo.properties")
public class Voter implements InitializingBean, DisposableBean {

	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
	private Integer age;
	private Date dov;

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
		
	public void myInitDeclare() {
		System.out.println("Init Declaration(XML) Check");
		if(dov==null)
			dov= new Date();
		if(age<0 || age==null || name==null)
			throw new IllegalArgumentException("Invalid inputs are given for name or age or both");
	}
	
	public void myDestroyDeclare() {
		System.out.println("Destroy Declaration(XML) Check");
		name=null;
		age=null;
		dov=null;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init Programatic Check");
		if(dov==null)
			dov= new Date();
		if(age<0 || age==null || name==null)
			throw new IllegalArgumentException("Invalid inputs are given for name or age or both");		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy Programatic Check");
		name=null;
		age=null;
		dov=null;
	}
	
	@jakarta.annotation.PostConstruct
	public void myInitAnnot(){
		System.out.println("Init Annotation Check");
		if(dov==null)
			dov= new Date();
		if(age<0 || age==null || name==null)
			throw new IllegalArgumentException("Invalid inputs are given for name or age or both");
	}

	@jakarta.annotation.PreDestroy
	public void myDestroyAnnot(){
		System.out.println("Destroy Annotation Check");
		name=null;
		age=null;
		dov=null;
	}
		
	@Override
	public String toString() {
		return "Voter [name=" + name + ", age=" + age + ", dov=" + dov + "]";
	}	
}
