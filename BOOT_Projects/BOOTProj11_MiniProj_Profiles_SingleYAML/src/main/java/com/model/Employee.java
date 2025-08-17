package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private Integer pid;
	private String pname;
	private Integer page;
	private String pgender;
	private String pstate;
	private String pcity;
	private String pdate;
	private String pstatus;
}
