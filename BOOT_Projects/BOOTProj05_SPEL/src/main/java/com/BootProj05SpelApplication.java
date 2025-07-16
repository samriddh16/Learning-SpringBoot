package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.beans.HotelInfo;

@SpringBootApplication
public class BootProj05SpelApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj05SpelApplication.class, args);
		//get  Main spring bean class obj
		HotelInfo info=ctx.getBean("hotel",HotelInfo.class);
		System.out.println(info);
		System.out.println("final bill amount ::"+info.calculateDiscount(200.0f));
	}

}
