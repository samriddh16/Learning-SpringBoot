package com.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document(collection = "MDB_OTM_SPORT")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Sport {

	@Id
	@NonNull
	private Integer sId;
	
	@NonNull
	private String sName;
	
	@NonNull
	private String sType;
	
	@NonNull
	private List<String> sKitItems;
	
	@Override
	public String toString() {
		return "Sport [sId=" + sId + ", sName=" + sName + ", sType=" + sType + ", sKitItems=" + sKitItems + "]";
	}
		
}
