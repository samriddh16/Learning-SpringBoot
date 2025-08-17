package com.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("barunner")
@Order(14)
public class BRunnerTest2 implements ApplicationRunner,Ordered{

	public BRunnerTest2() {
		System.out.println("Application Runner(BRunner Test 2): 0 param constructor");
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("BRunnerTest2.run(AR)");
		System.out.println("Named Arguments- "+args.getOptionNames());
		
		System.out.println("Unnamed Arguments- "+args.getNonOptionArgs());
		
		System.out.println("Named Arguments Values- ");
		for(String name: args.getOptionNames())
			System.out.println(name+"- "+(args.getOptionValues(name)));

		System.out.println("\n-------------------------------------------------------\n");
	}
	
	@Override
	public int getOrder() {          // Gets higher priority than @Order annotation
		return 4;
	}

}
