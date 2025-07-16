package com.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("airtel")
@Lazy
public class AirtelSIM implements ISIMCard {

	public AirtelSIM() {
		System.out.println("AirtelSIM: 0 param constructor");
	}

	@Override
	public String FiveG() {
		return "Airtel's fast 5g network";
	}

	@Override
	public String SMS() {
		return "Airtel's super SMS service";
	}

}
