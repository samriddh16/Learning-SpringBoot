//MarriageSeeker.java
package com.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name="JPA_MARRIAGE_SEEKER_TAB")
@NoArgsConstructor
@RequiredArgsConstructor
public class MarriageSeeker  implements  Serializable {
	@Id
	@GeneratedValue
	private Long  mid;
	@NonNull
	@Column(length = 20)
	private   String name;
	@Column(length = 20)
	@NonNull
	private   String  addrs;
	@NonNull
	private  LocalDateTime dob;
	@Lob
	@NonNull
	private  byte[]  photo;
	@Lob
	@NonNull
	private  char[]  resume;
	@NonNull
	private  boolean indian;

}
