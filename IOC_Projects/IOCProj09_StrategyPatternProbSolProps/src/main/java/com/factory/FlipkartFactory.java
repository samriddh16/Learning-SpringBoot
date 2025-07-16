package com.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import com.comps.Courier;
import com.comps.Flipkart;


public class FlipkartFactory {
	private static Properties props;
	static {
		try {
			InputStream is= new FileInputStream("src/main/java/com/commons/CourierInfo.properties");
			props= new Properties();
			props.load(is);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

         
	public static Flipkart getInstance() {
		Courier cour=null;
		try {
			String courClass= props.getProperty("courier.className");
			Class c= Class.forName(courClass);
			Constructor<Courier> cons[]=c.getDeclaredConstructors();
			cour = cons[0].newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		Flipkart fp=new Flipkart();
		fp.setCr(cour);
		return fp;
			
	}
}
