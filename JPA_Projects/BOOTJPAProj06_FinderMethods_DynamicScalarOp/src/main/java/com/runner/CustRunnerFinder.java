package com.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.repository.ICustRepoFinder;
import com.view.IRepoView2;
import com.view.IRepoView3;

@Component("runner")
public class CustRunnerFinder implements CommandLineRunner {

	@Autowired
	ICustRepoFinder repo;
	

	@Override
	public void run(String... args) throws Exception {
		try {
				repo.findByCnameEqualsOrCbillamtGreaterThan("Ayush",40000.0,IRepoView2.class).forEach(view2->{
				System.out.println(view2.getCid()+"    "+view2.getCname()+"    "+view2.getCaddrs());});
				System.out.println("-------------------------------------------------");
			    repo.findByCnameStartingWithOrCbillamtBetween("R", 50000.0, 65000.0,IRepoView3.class).forEach(view3->{
				System.out.println(view3.getCname()+"    "+view3.getCaddrs()+"    "+view3.getCbillamt());});
                System.out.println("-------------------------------------------------");
	  
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
