package com.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("dept")
@Setter
@ConfigurationProperties(prefix = "dept.details")
@ToString
public class Department {
	
	private Integer no;
	private String name;
	private String location;
	private Integer size;
}
