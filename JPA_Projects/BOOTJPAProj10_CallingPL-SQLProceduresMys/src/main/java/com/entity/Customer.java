package com.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="JPA_CUSTOMER_INFO")
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
}
