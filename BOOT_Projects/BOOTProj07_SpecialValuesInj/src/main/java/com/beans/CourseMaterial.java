package com.beans;

import lombok.Data;

@Data
public class CourseMaterial {

	private Integer cid;
	private String cname;
	private Integer cduration;
	private String[] faculty;
}
