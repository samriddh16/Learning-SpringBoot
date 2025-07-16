package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("clb")
public class ClassB {
	
    @Autowired
	private ClassA obja;

	public ClassB() {
		System.out.println("ClassB.ClassB()");
	}
	
	/*	@Autowired
		public ClassB(ClassA obja) {
			super();                                  Beacuse of this constructor injection deadlock will happen
			this.obja = obja;
		}
	*/

	@Override
	public String toString() {
		return "ClassB contains object of ClassA";
	}

	/*	@Override
		public String toString() {
			return "ClassB [obja=" + obja + "]";       Because of this type of statement if someone want to print objA then it becomes an infinite loop.
		}
	*/
  
}
