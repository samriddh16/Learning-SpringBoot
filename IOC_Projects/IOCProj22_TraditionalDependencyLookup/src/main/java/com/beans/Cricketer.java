package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cric")
@PropertySource("com/commons/cricInfo.properties")
public class Cricketer {
   
	@Value("${cric.name}")
	private String name;
	@Value("${cric.team}")
	private String team;
	
	public Cricketer() {
		System.out.println("Cricketer: 0 param cons");
	}

	public void fielding() {
		System.out.println("Cricketer " +name+" fields like a legend");
	}
	
	public void balling() {
		try(ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("com/cnfgs/applicationContext.xml");)
		{
			CricketBall ball = cpx.getBean(CricketBall.class);
			System.out.println("Cricketer " +name+" balls like a legend and has taken "+ball.getWickets()+" wickets");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void batting() {
		try(ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("com/cnfgs/applicationContext.xml");)
		{
			CricketBat bat = cpx.getBean(CricketBat.class);
			System.out.println("Cricketer " +name+" bats like a legend and has made "+bat.getRuns()+" runs");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
