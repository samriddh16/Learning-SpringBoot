package com.document;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document(collection = "MDB_OTM_PLAYER")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Player {
	@Id
	@NonNull
	private Integer pId;
	
	@NonNull
	private String pName;
	
	@NonNull
	private String pAddr;
	
	@NonNull
	private Integer pAge;
	
	private List<Sport> sports;
	private Map<String, Medal> medals;
	
	@Override
	public String toString() {
		return "Player [pId=" + pId + ", pName=" + pName + ", pAddr=" + pAddr + ", pAge=" + pAge + "]";
	}
	
}
