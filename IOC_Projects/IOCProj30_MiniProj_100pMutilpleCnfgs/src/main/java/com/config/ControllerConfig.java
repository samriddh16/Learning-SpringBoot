package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration("control")
@ComponentScan(basePackages = "com.controller")
public class ControllerConfig {

}
