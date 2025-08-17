package com.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("stud")
@PropertySource("com/commons/StudInfo.properties")
public abstract class Student {
      
	@Value("${stu.sid}")
	private int sid;
	@Value("${stu.name}")
	private String name;
	@Value("${stu.college}")
	private String college;
	@Value("${stu.degree}")
	private String degree;

	public void StudDetails() {
		System.out.println("Sid- "+sid+"\nName- "+name+"\nCollege- "+college+"\nDegree- "+degree);
	}

	@Lookup
	public abstract Physics getPhy();
	
	public void FirstSem() {
		Physics p= getPhy();
		System.out.println("FirstSem Subjects-");
		System.out.println(p.getName()+"  "+p.getInstructor()+"  "+p.getLength()+"  "+p.getCredit());
	}
	
	@Lookup
	public abstract Chemistry getChem();
	
	public void SecondSem() {
		Chemistry c= getChem();
		System.out.println("SecondSem Subjects-");
		System.out.println(c.getName()+"  "+c.getInstructor()+"  "+c.getLength()+"  "+c.getCredit());
	}
	
	@Lookup
	public abstract Java getJava();
	
	public void ThirdSem() {
		Java j= getJava();
		System.out.println("ThirdSem Subjects-");
		System.out.println(j.getName()+"  "+j.getInstructor()+"  "+j.getLength()+"  "+j.getCredit());
	}
	
	@Lookup
	public abstract OS getOs();
	
	public void FourthSem() {
		OS o=getOs();
		System.out.println("FourthSem Subjects-");
		System.out.println(o.getName()+"  "+o.getInstructor()+"  "+o.getLength()+"  "+o.getCredit());
	}
	
	@Lookup
	public abstract Algorithms getAlgo();
	
	public void FifthSem() {
		Algorithms a=getAlgo();
		System.out.println("FifthSem Subjects-");
		System.out.println(a.getName()+"  "+a.getInstructor()+"  "+a.getLength()+"  "+a.getCredit());
	}
	
	@Lookup
	public abstract DataScience getData();
	
	public void SixthSem() {
		DataScience d= getData();
		System.out.println("SixthSem Subjects-");
		System.out.println(d.getName()+"  "+d.getInstructor()+"  "+d.getLength()+"  "+d.getCredit());
	}
	
	@Lookup
	public abstract ManagmentSystem getMS();
	
	public void SeventhSem() {
		ManagmentSystem m= getMS();
		System.out.println("SeventhSem Subjects-");
		System.out.println(m.getName()+"  "+m.getTech()+"  "+m.getType()+"  "+m.getDays());
	}
	
	@Lookup
	public abstract SpotifyClone getSC();
	
	public void EightSem() {
		SpotifyClone s= getSC();
		System.out.println("EigthSem Subjects-");
		System.out.println(s.getName()+"  "+s.getTech()+"  "+s.getType()+"  "+s.getDays());
	}
}
