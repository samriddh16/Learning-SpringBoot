package com.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.BootjpaProj04FinderMethodsApplication;
import com.repository.ICustRepoFinder;

@Component("runner")
public class CustRunnerFinder implements CommandLineRunner {
	
	@Autowired
	ICustRepoFinder repo;

	@Override
	public void run(String... args) throws Exception {
		try {
			/*repo.findByCnameEquals("Sam").forEach(System.out::println);
			System.out.println("--------------------------------------------------------");
			repo.findByCnameIn(Arrays.asList("Sam","Ayush","Ram")).forEach(System.out::println);
			System.out.println("-----------------------------------------------------------");
			repo.findByCnameEqualsAndCaddrs("Sam","Mumbai").forEach(System.out::println);*/
			/*System.out.println("-----------------------------------------------------------");
			repo.findByCnameEqualsOrCaddrs("Sam","Delhi").forEach(System.out::println);
			System.out.println("-----------------------------------------------------------");
			repo.findByCbillamtBetween(50000.0,80000.0).forEach(System.out::println);*/
			/*System.out.println("-----------------------------------------------------------");
			repo.findByCnameStartingWith("R").forEach(System.out::println);
			System.out.println("-----------------------------------------------------------");
			repo.findByCnameEndingWith("m").forEach(System.out::println);
			System.out.println("-----------------------------------------------------------");
			repo.findByCnameContaining("am").forEach(System.out::println);*/
			System.out.println("-----------------------------------------------------------");
			repo.findByCnameStartingWithIgnoreCaseAndCbillamtGreaterThanEqual("S",60000.0).forEach(System.out::println);
			System.out.println("-----------------------------------------------------------");
			repo.findByCaddrsInIgnoreCaseAndCbillamtLessThanEqual(Arrays.asList("Hyd","Delhi","Patna"),55000.0).forEach(System.out::println);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
