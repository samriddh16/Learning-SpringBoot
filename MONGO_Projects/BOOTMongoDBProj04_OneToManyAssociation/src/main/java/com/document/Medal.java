package com.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document(collection = "MDB_OTM_MEDAL")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Medal {
	
	@Id
	@NonNull
	private Integer mId;
	
	@NonNull
	private String mType;
	
	@NonNull
	private String mSport;

	@Override
	public String toString() {
		return "Medal [mId=" + mId + ", mName=" + mType + ", mSport=" + mSport + "]";
	}

}
