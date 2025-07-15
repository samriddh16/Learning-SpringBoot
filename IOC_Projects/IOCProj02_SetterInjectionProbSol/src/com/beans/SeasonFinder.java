package com.beans;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
      private LocalDate ld;

    @Autowired
	public void setLdt(LocalDate ld) {
		System.out.println("SeasonFinderGenerator.setLdt()");       //systrace+ ctrl+space
		this.ld = ld;
	}
      
    public String generateMessage() {
    	System.out.println("SeasonFinderGenerator.generateMessage()");
    	if (ld.getMonthValue()==3 || ld.getMonthValue()==4)
    		return "Vasant(Spring)";
    	else if (ld.getMonthValue()==5 || ld.getMonthValue()==6)
    		return "Grishma(Summer)";
    	else if (ld.getMonthValue()==7 || ld.getMonthValue()==8)
    		return "Varsha(Monsoon)";
    	else if (ld.getMonthValue()==9 || ld.getMonthValue()==10)
    		return "Sharad(Atumn)";
    	else if (ld.getMonthValue()==11 || ld.getMonthValue()==12)
    		return "Hemant(Pre-Winter)";
    	else
    		return "Shishir(Winter)";
    }
}
