package com.beans;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component("sf")
public class SeasonFinder {
	
	  @Autowired
      private LocalDate ld;
   
    public SeasonFinder() {
		System.out.println("SeasonFinder: 0 param constructor");
	}
    
   public String findSeasonName(String user) {
    	System.out.println("SeasonFinderGenerator.findSeasonName()");
    	if (ld.getMonthValue()==3 || ld.getMonthValue()==4)
    		return "Happy Vasant(Spring) to "+user;
    	else if (ld.getMonthValue()==5 || ld.getMonthValue()==6)
    		return "Happy Grishma(Summer) to "+user;
    	else if (ld.getMonthValue()==7 || ld.getMonthValue()==8)
    		return "Happy Varsha(Monsoon) to "+user;
    	else if (ld.getMonthValue()==9 || ld.getMonthValue()==10)
    		return "Happy Sharad(Atumn) to "+user;
    	else if (ld.getMonthValue()==11 || ld.getMonthValue()==12)
    		return "Happy Hemant(Pre-Winter) to "+user;
    	else
    		return "Happy Shishir(Winter) to "+user;
    }
}
