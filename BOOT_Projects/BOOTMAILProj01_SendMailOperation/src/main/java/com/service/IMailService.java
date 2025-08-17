package com.service;

public interface IMailService {

	
	public String shoppingCart(String[] items, float[] prices, String[] mails) throws Exception;
	
	public String sendMail(String st, String[] mails, String msg) throws Exception;
}
