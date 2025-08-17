package com.runner;

import java.io.FileOutputStream;
import java.io.FileWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.entity.MarriageSeeker;
import com.service.IMatrimonyMgmtService;

@Component
public class MatrimonyTestRunner implements CommandLineRunner {
	@Autowired
	private  IMatrimonyMgmtService  service;

	@Override
	public void run(String... args) throws Exception {
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter name::");
		String name=sc.next();
		
		System.out.println("enter address::");
		String addrs=sc.next();
		
		
		System.out.println("enter DOB (yyyy-MM-ddThh:mm:ss)::");
		String dob=sc.next();
		LocalDateTime ldob=LocalDateTime.parse(dob);
		
		System.out.println(" Is Customer Indian?");
		boolean indian=sc.nextBoolean();
		
		sc.nextLine();
		
		System.out.println("enter photo file path::");
		String photoPath=sc.nextLine();
		
		System.out.println("enter resume file path::");
		String resumePath=sc.nextLine();
		
		//create streams represeting  photo file ,resume file
		//create byte[] and char[] having data
		  FileInputStream fis=new FileInputStream(photoPath);
		  byte[] photoContent=fis.readAllBytes();
		  
		   File file=new File(resumePath);
		  FileReader reader=new FileReader(resumePath);
		  char[] resumeContent=new char[(int) file.length()];
		  reader.read(resumeContent);
		
		//create Model/Entity class object
		  MarriageSeeker seeker=
				   new MarriageSeeker(name, addrs, ldob, photoContent, resumeContent, indian);
		  
		  // save the object
		  try {
			  System.out.println(service.registerMarriageSeeker(seeker));
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }*/
		
		 //Load object operation
		MarriageSeeker seeker=service.getMarriageSeekerById(1L);
		System.out.println(seeker.getMid()+"  "+seeker.getName()+" "+seeker.getAddrs()+"  "+seeker.getDob());
		byte[]  photoContent=seeker.getPhoto();
		char[]  resumeContent=seeker.getResume();
		//write the content to destination files
		FileOutputStream fos=new FileOutputStream("retrieve_photo.jfif");
		fos.write(photoContent);
		fos.flush();
		fos.close();
		 FileWriter writer=new FileWriter("retrieve_resume.txt");
		 writer.write(resumeContent);
		 writer.flush();
		 writer.close();
		
	}//main
}//class
