package com.comps;

public class Student extends Person {
          private String course;
          private int roll;
          
		public Student(String name, Address addr, String course, int roll) {
			super(name, addr);
			this.course = course;
			this.roll = roll;
		}

		@Override
		public String toString() {
			return "Student [course=" + course + ", roll=" + roll + "] and "+super.toString();
		}
      
}
