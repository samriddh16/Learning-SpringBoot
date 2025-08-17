package com.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("acrunner")
@Order(1)
public class ARunnerTest1 implements CommandLineRunner {
	
	public ARunnerTest1() {
		System.out.println("Command Line Runner(ARunner Test 1): 0 param constructor");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ARunnerTest1.run(CR)");
		System.out.println("All Arguments- " +Arrays.toString(args));
		
		System.out.println("\n-------------------------------------------------------\n");
	}

}
