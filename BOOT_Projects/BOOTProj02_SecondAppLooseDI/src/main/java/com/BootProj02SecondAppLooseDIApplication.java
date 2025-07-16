package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.beans.AndriodMobile;

@SpringBootApplication
@ImportResource(locations = "com/cnfgs/applicationContext.xml")
public class BootProj02SecondAppLooseDIApplication {

	public static void main(String[] args) {
		try(
			ConfigurableApplicationContext cax = SpringApplication.run(BootProj02SecondAppLooseDIApplication.class, args);
			){
			
			AndriodMobile android = cax.getBean(AndriodMobile.class);
			android.mobileSystem();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
