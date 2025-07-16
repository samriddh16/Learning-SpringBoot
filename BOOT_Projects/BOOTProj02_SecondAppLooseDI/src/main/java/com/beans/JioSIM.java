package com.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("jio")
@Lazy
public class JioSIM implements ISIMCard {

	public JioSIM() {
		System.out.println("JioSIM: 0 param constructor");
	}

	@Override
	public String FiveG() {
		return "Jio's fast 5g network";
	}

	@Override
	public String SMS() {
		return "Jio's super SMS service";
	}

}
