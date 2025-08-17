package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("bat")
public class CricketBat {

	public CricketBat() {
		System.out.println("CricketBat: 0 param cons");
	}

	@Value("${cric.runs}")
	private int runs;

	public int getRuns() {
		return runs;
	}
	
}
