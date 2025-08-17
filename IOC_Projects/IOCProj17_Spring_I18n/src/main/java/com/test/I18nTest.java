package com.test;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18nTest {

	public static void main(String[] args) {
		try (   Scanner sc = new Scanner(System.in);
				ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("com/cnfgs/applicationContext.xml")) {
			System.out.println("Enter country code- ");
			String code = sc.next();
			System.out.println("Enter language code- ");
			String lang = sc.next();
			Locale loc = Locale.of(lang,code);
			String wmsg = cpx.getMessage("wish.msg", new Object[] {"Sam","Sunday","Barista","Hyderabad","Love"}, loc);
			String bmsg = cpx.getMessage("bye.msg", new Object[] {"Sam","Dominos"}, loc);
			System.out.println("Wish Message- "+wmsg+"\nBye Message- "+bmsg);
			
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}
}
