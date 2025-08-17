package com.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cric")
@PropertySource("com/commons/cricInfo.properties")
public class Cricketer /*implements ApplicationContextAware*/ {
   
	@Value("${cric.name}")
	private String name;
	@Value("${cric.team}")
	private String team;
	/*@Autowired
	private ApplicationContext apx;*/
	
	/*@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	     this.apx=applicationContext;	
	}*/

	public Cricketer() {
		System.out.println("Cricketer: 0 param cons");
	}

	public void fielding() {
		System.out.println("Cricketer " +name+" fields like a legend");
	}
	
	public void balling(ApplicationContext apx) {
			CricketBall ball = apx.getBean(CricketBall.class);
			System.out.println("Cricketer " +name+" balls like a legend and has taken "+ball.getWickets()+" wickets");
	}
	
	public void batting(ApplicationContext apx) {
		CricketBat bat = apx.getBean(CricketBat.class);
		System.out.println("Cricketer " +name+" bats like a legend and has made "+bat.getRuns()+" runs");
	}

}
