package com.comps;

public class DHL implements Courier {

	public DHL() {
		System.out.println("DHL.DHL()");
	}

	@Override
	public String toString() {
		return "DHL delivery service";
	}
             
}
