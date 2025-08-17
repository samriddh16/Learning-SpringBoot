package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("proj2")
public class SpotifyClone {

	@Value("${proj2.name}")
	private String name;
	@Value("${proj2.tech}")
	private String tech;
	@Value("${proj2.type}")
	private String type;
	@Value("${proj2.days}")
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
