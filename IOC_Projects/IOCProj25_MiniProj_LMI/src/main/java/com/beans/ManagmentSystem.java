package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("proj1")
public class ManagmentSystem {

	@Value("${proj1.name}")
	private String name;
	@Value("${proj1.tech}")
	private String tech;
	@Value("${proj1.type}")
	private String type;
	@Value("${proj1.days}")
	private int days;
	
	public String getName() {
		return name;
	}
	public String getTech() {
		return tech;
	}
	public String getType() {
		return type;
	}
	public int getDays() {
		return days;
	}
}
