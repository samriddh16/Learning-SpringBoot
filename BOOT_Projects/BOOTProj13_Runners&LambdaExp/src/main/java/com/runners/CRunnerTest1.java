package com.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("ccrunner")
@Order(9)
public class CRunnerTest1 implements CommandLineRunner {
	
	public CRunnerTest1() {
		System.out.println("Command Line Runner(CRunner Test 1): 0 param constructor");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CRunnerTest1.run(CR)");
		System.out.println("All Arguments- " +Arrays.toString(args));
		
		System.out.println("\n-------------------------------------------------------\n");
	}

}
