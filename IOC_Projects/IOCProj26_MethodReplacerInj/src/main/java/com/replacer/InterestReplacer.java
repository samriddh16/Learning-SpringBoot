package com.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class InterestReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("InterestReplacer- Compound Interest");
		double p = (double) args[0];
		double r = (double) args[1];
		double t = (double) args[2];
		
		return (p*Math.pow(1+r/100, t))-p;
	}

}
