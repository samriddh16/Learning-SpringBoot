package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration("config")
@ComponentScan(basePackages = {"com.beans","com.replacer"})
@ImportResource(locations = "com/cnfgs/applicationContext.xml")
public class ReplacerConfig {

}
