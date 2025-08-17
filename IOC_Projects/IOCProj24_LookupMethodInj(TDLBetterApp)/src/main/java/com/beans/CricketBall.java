package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ball")
public class CricketBall {

	public CricketBall() {
		System.out.println("CricketBall: 0 param cons");
	}

	@Value("${cric.wickets}")
	private int wickets;

	public int getWickets() {
		return wickets;
	}

}
