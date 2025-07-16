package com.model;

public class CustModel {
       private Integer custid;
       private String custname;
       private String custaddr;
       private Float payment;
       private Float time;
       private Float rate;
       private Float interestamt;
	public Integer getCustid() {
		return custid;
	}
	public void setCustid(Integer custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustaddr() {
		return custaddr;
	}
	public void setCustaddr(String custaddr) {
		this.custaddr = custaddr;
	}
	public Float getPayment() {
		return payment;
	}
	public void setPayment(Float payment) {
		this.payment = payment;
	}
	public Float getTime() {
		return time;
	}
	public void setTime(Float time) {
		this.time = time;
	}
	public Float getRate() {
		return rate;
	}
	public void setRate(Float rate) {
		this.rate = rate;
	}
	public Float getInterestamt() {
		return interestamt;
	}
	public void setInterestamt(Float interestamt) {
		this.interestamt = interestamt;
	}
       
       
}
