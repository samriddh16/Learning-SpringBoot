package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//The side that holds the foreign key in the database table is the owning side.
@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "PHONENO_TAB_OTM")
public class PhoneNumber {

	@Id
	@SequenceGenerator(name = "gen1",sequenceName = "REGNO_SEQ",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer regId;
	
	@NonNull
	@Column(nullable = false,unique = true)
	private Long phNo;
	
	@NonNull
	@Column(length = 20)
	private String numberType;
	
	@NonNull
	@Column(length = 20)
	private String phProvider;
	
	// If we specify @Many to one or vice-versa on any one entity with other things such as join column 
	// then the tables will be created just fine and it will be a unidirectional mapping
	@ManyToOne(targetEntity = Customer.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="CUST_ID",referencedColumnName = "custId")
	private Customer cust;

	// 0 param constructor is necessary here
	public PhoneNumber() {
		System.out.println("PhoneNumber Class: 0 param constructor");
	}

	@Override
	public String toString() {
		return "PhoneNumber [regId=" + regId + ", phNo=" + phNo + ", numberType=" + numberType + ", phProvider="
				+ phProvider ;
	}
	
}
