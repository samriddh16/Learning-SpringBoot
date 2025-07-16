package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cla")
public class ClassA {

    @Autowired
	private ClassB objb;

	public ClassA() {
		System.out.println("ClassA.ClassA()");
	}	
	
	/*    @Autowired
		public ClassA(ClassB objb) {              Beacuse of this constructor injection deadlock will happen
			super();
			this.objb = objb;
		}*/

	@Override
	public String toString() {
		return "ClassA contains Object of ClassB";
	}

	/*@Override
	public String toString() {
		return "ClassA [objb=" + objb + "]";       Because of this type of statement if someone want to print objA then it becomes an infinite loop.
	}*/
		
}
