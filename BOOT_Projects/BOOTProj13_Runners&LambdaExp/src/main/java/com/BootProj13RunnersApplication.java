package com;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootProj13RunnersApplication {
	
    @Bean("lambdarunnerC")
    CommandLineRunner getCR() {
    	CommandLineRunner cr = (String args[])->{
    		System.out.println("Lambda CommandLineRunner");
    		System.out.println("Lambda Arguments- "+Arrays.toString(args));
    	};
    	System.out.println("Class Name- "+cr.getClass());
    	return cr;
    }
    
    @Bean("lambdarunnerA")
    ApplicationRunner getAR() {
    	ApplicationRunner ar = (ApplicationArguments arg)->{
    		System.out.println("Lambda ApplicationRunner");
    		System.out.println("Non Option Arguments- "+arg.getNonOptionArgs());
    		System.out.println("Option Arguments- "+arg.getOptionNames());
    	};
    	System.out.println("Class Name- "+ar.getClass());
    	return ar;
    }

	public static void main(String[] args) {
		SpringApplication.run(BootProj13RunnersApplication.class, args);
	}

}
