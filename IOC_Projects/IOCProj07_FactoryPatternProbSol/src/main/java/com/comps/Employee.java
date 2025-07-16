package com.comps;

public class Employee extends Person {
         private float sal;
         private String jobrole;
         
		public Employee( String name, Address addr, float sal, String jobrole) {
			super(name,addr);
			this.sal = sal;
			this.jobrole = jobrole;
		}

		@Override
		public String toString() {
			return "Employee [sal=" + sal + ", jobrole=" + jobrole + "] and "+super.toString();
		}
              
}
