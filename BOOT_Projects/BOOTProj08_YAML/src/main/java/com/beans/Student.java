package com.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("stud")
@Data
@ConfigurationProperties(prefix = "stud.details")
public class Student {
	
	// Simple Properties
	private Integer sid;
	private String sname;
	private String scollege;
	
    // Array,List,Set,Map Properties
	private String[] hobby;	
	private List<String> nickNames;
	private Set<Long> phoneNumbers;
	private Map<String,Long> idDetails;
	
	// Has-A Properties
	private CourseMaterial course;

}
