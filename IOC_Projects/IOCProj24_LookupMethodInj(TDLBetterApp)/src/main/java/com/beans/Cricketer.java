package com.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cric")
@PropertySource("com/commons/cricInfo.properties")
public abstract class Cricketer {
   
	@Value("${cric.name}")
	private String name;
	@Value("${cric.team}")
	private String team;

	public Cricketer() {
		System.out.println("Cricketer: 0 param cons");
	}
	
	@Lookup
	public abstract CricketBall getCricBall();
	@Lookup
	public abstract CricketBat getCricBat();

	public void fielding() {
		System.out.println("Cricketer " +name+" fields like a legend");
	}
	
	public void balling() {
			CricketBall ball = getCricBall();
			System.out.println("Cricketer " +name+" balls like a legend and has taken "+ball.getWickets()+" wickets");
	}
	
	public void batting() {
		CricketBat bat = getCricBat();
		System.out.println("Cricketer " +name+" bats like a legend and has made "+bat.getRuns()+" runs");
	}

}
