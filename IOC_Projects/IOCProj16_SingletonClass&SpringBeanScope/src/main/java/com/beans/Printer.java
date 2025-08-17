package com.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*@Component("Printer")*/
/*@Scope("prototype") */    /*p1==p2-> false else true*/
public class Printer {
	
	private static Printer INSTANCE;
	
	private Printer() {
		System.out.println("Printer.Printer()");
	}

	public static Printer getInstance() {
		if(INSTANCE==null)	
		{	INSTANCE= new Printer();
		    return INSTANCE;
		}
		else
			return INSTANCE;
	}

}

