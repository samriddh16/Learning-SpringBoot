package com.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("darunner")
@Order(5)
public class DRunnerTest2 implements ApplicationRunner {

	public DRunnerTest2() {
		System.out.println("Application Runner(DRunner Test 2): 0 param constructor");
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("DRunnerTest2.run(AR)");
		System.out.println("Named Arguments- "+args.getOptionNames());
		
		System.out.println("Unnamed Arguments- "+args.getNonOptionArgs());
		
		System.out.println("Named Arguments Values- ");
		for(String name: args.getOptionNames())
			System.out.println(name+"- "+(args.getOptionValues(name)));

		System.out.println("\n-------------------------------------------------------\n");
	}

}
