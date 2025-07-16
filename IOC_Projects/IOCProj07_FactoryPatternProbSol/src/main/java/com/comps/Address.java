package com.comps;

public class Address {
	    private int laneno;
        private String city;
        private String country;
        
		public Address(int laneno, String city, String country) {
			this.laneno = laneno;
			this.city = city;
			this.country = country;
		}

		@Override
		public String toString() {
			return "Address [laneno=" + laneno + ", city=" + city + ", country=" + country + "]";
		}
		      
}
