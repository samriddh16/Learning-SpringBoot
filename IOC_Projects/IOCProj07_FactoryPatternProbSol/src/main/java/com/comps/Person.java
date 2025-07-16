package com.comps;

public abstract class Person {
        private String name;
        private Address addr;
        
		public Person(String name, Address addr) {
			super();
			this.name = name;
			this.addr = addr;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", addr=" + addr + "]";			
		}		
		
}
