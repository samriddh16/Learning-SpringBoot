package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.beans.Student;

public class StudentCollegeRecord {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("com/cnfgs/applicationContext.xml");
		Student stu = cpx.getBean(Student.class);
		/*System.out.println(stu.getClass());
		System.out.println(stu.getClass().getSuperclass());*/
		stu.StudDetails();
		stu.FirstSem();
		stu.SecondSem();
		stu.ThirdSem();
		stu.FourthSem();
		stu.FifthSem();
		stu.SixthSem();
		stu.SeventhSem();
		stu.EightSem();
		cpx.close();
	}
}
