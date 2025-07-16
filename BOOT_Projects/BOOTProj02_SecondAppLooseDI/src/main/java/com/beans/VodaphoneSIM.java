package com.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("voda")
@Lazy
public class VodaphoneSIM implements ISIMCard {

	public VodaphoneSIM() {
		System.out.println("VodaphoneSIM: 0 param constructor");
	}

	@Override
	public String FiveG() {
		return "Vodaphone's fast 5g network";
	}

	@Override
	public String SMS() {
		return "Vodaphone's super SMS service";
	}

}
