package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration("service")
@ComponentScan(basePackages = "com.service")
@ImportResource(locations = "com/cnfgs/applicationContext.xml")
public class ServiceConfig {

}
