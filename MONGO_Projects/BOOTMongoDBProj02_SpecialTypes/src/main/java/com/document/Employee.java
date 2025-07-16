package com.document;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

// Same properties name will be given in the JSON document and not like in SQL databases
//Finder methods work just like they did in spring data JPA so no proj for that in mongodb
@Document(collection = "Employee_Doc")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Employee {
	
	@Id
	private String id;
	
	@NonNull
	private Integer empNo;
	
	@NonNull
	private String empName;
	
	@NonNull
	private String empAddr;
	
	@NonNull
	private Double empSalary;
	
	@NonNull
	private String[] empFavcolours;
	
	@NonNull
	private List<String> empFriends;
	
	@NonNull
	private Set<Long> empPhno;
	
	@NonNull
	private  Properties idDetails;
	
	@NonNull
	private Map<Integer,String> empInsurancePl;

}
