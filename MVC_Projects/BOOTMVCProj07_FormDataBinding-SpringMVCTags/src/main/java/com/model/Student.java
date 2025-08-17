package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {

	private String sroll;
	private String sname;
	private Integer sage=22;
	private String saddr="Patna";
}
