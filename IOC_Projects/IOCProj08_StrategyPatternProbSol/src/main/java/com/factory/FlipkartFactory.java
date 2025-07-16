package com.factory;

import com.comps.BlueDart;
import com.comps.Courier;
import com.comps.DHL;
import com.comps.DTDC;
import com.comps.Flipkart;

public class FlipkartFactory {
         
	public static Flipkart getInstance(String st) {
		Courier cour=null;
		if (st.equalsIgnoreCase("dtdc"))
			cour=new DTDC();
		else if (st.equalsIgnoreCase("blue"))
				cour=new BlueDart();
		else if (st.equalsIgnoreCase("dhl"))
				cour=new DHL();
		else
			throw new IllegalArgumentException("Illegal argument. Choose from [dtdc,blue,dhl]");
		
		Flipkart fp=new Flipkart();
		fp.setCr(cour);
		return fp;
			
	}
}
