package com.entity;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="JPA_CUSTOMER_DATE_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Customer {

	@Id
	/*@GeneratedValue(strategy = GenerationType.AUTO )*/
	@SequenceGenerator(name="seq1", sequenceName = "CUST_SEQ", initialValue = 1001, allocationSize = 1)
	@GeneratedValue(generator = "seq1", strategy = GenerationType.SEQUENCE )
	@Column(name="CUST_ID")
	private Integer cid;
	
	@NonNull
	@Column(name="CUST_NAME",length = 20)
	private String cname;
	
	/*@Transient*/
	@NonNull
	@Column(name="CUST_ADDR",length = 20)
	private String caddrs;
	
	@NonNull
	@Column(name="CUST_BILLAMT")
	private Double cbillamt;
	
	@NonNull
	@Column(name="CUST_DOB")
	private LocalDateTime cdob;
	
	@NonNull
	@Column(name="CUST_DOP")
	private LocalDate cdop;
	
	@NonNull
	@Column(name="CUST_TOP")
	private LocalTime ctop;
}
