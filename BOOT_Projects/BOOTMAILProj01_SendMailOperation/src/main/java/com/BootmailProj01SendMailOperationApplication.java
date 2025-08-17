package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.service.IMailService;

@SpringBootApplication
public class BootmailProj01SendMailOperationApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(BootmailProj01SendMailOperationApplication.class, args);
		IMailService service = ac.getBean("mailservice",IMailService.class);
		try {
			String msg = service.shoppingCart(new String[] {"shirt","trouser","watch"}, new float[] {2000.0f,3000.0f,5000.0f},
					new String[] {".com"});
			System.out.println(msg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ac).close();
	}
}
