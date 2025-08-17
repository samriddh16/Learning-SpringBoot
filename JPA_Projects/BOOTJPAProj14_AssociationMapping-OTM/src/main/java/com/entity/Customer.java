package com.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//The side that holds the foreign key in the database table is the owning side.
@Entity
// We have to specify getter and setter individually as with @Data some internal problem occurs with mapping
@Getter            
@Setter
//@EqualsAndHashCode  Do not write this here it creates problem
@RequiredArgsConstructor
@Table(name = "CUSTOMER_TAB_OTM")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer custId;
	
	@NonNull
	@Column(length = 20)
	private String custName;
	
	@NonNull
	@Column(length = 20)
	private String custAddr;
	
	@OneToMany(targetEntity = PhoneNumber.class, cascade = CascadeType.ALL, mappedBy = "cust", fetch = FetchType.EAGER)
	private Set<PhoneNumber> phone;
	
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddr=" + custAddr;
	}

	// 0 param constructor is necessary here
	public Customer() {
		System.out.println("Customer Class: 0 param constructor");
	}
	
}
