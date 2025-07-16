package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotel")
public class HotelInfo {
	@Value("${hotel.name}")
	private String  name;
	@Value("${hotel.id}")
	private Integer id;
	@Value("${hotel.location}")
	private String location;
	@Value("#{(menu.dosaPrice>1000)||(menu.idlyPrice>1000)?'Expensive':'Regular'}")
	private String category;
	@Value("${customer.name}")
	private String customerName;
	@Value("#{menu.dosaPrice+ menu.idlyPrice+menu.pohaPrice+menu.vadapavPrice}")  //SPEL
	private  Float billAmount;
	@Value("${customer.discount}")
	private  Float discount;
	private  Float finalBillAmount; 
	
	//gets system property  value
	@Value("${os.name}")
	private  String osName;
	//get env.. variable value 
	@Value("${Path}")
	private  String pathData;
	
	
	public   Float  calculateDiscount(float minAmount) {
		if(billAmount>=minAmount)
			finalBillAmount=billAmount-(billAmount*discount/100.0f);
		else
			finalBillAmount=billAmount;
		return finalBillAmount;
		
	}


	@Override
	public String toString() {
		return "HotelInfo [name=" + name + ", id=" + id + ", location=" + location + ", category=" + category
				+ ", customerName=" + customerName + ", billAmount=" + billAmount + ", discount=" + discount
				+ ", finalBillAmount=" + finalBillAmount + ", osName=" + osName + ", pathData=" + pathData + "]";
	}
	

}
