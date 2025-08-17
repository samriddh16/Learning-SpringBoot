package com.entity;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "JPA_MTM_DOCTOR")
public class Doctor {
	@Id
	@SequenceGenerator(name = "sq", sequenceName = "DOC_SEQ", initialValue = 1001, allocationSize = 1)
	@GeneratedValue(generator = "sq", strategy = GenerationType.SEQUENCE)
	private Integer docID;
	
	@Column(length = 20)
	@NonNull
	private String docName;
	
	@Column(length = 20)
	@NonNull
	private String docSpecialization;
	
	// By default fetch type is LAZY
	// If we specify @many to many annot only one side it becomes a unidirectional relationship
	// Only the side where you define @ManyToMany knows about the relationship.
    // You can access the related entities from that side only.
	// The other entity class is unaware of the mapping.
	@ManyToMany(targetEntity = Patient.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "JPA_MTM_DOCTOR_PATIENTS", joinColumns = @JoinColumn(name = "DOCTOR_ID", referencedColumnName = "docID"),
	            inverseJoinColumns = @JoinColumn(name = "PATIENT_ID", referencedColumnName = "patID"))
	private List<Patient> patients;

	public Doctor() {
       System.out.println("Doctor Class: 0 param constructor");
	}

	@Override
	public String toString() {
		return "Doctor [docID=" + docID + ", docName=" + docName + ", docSpecialization=" + docSpecialization + "]";
	}

}
