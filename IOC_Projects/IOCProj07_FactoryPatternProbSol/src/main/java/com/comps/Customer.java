package com.comps;

public class Customer extends Person {
           private int custid;
           private float billamt;
           
		public Customer(String name, Address addr, int custid, float billamt) {
			super(name, addr);
			this.custid = custid;
			this.billamt = billamt;
		}
		@Override
		public String toString() {
			return "Customer [custid=" + custid + ", billamt=" + billamt + "] and "+super.toString();
		}
         
}
