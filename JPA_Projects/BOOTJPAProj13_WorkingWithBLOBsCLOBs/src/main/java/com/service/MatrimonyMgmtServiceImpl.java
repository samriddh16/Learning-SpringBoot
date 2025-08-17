package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.MarriageSeeker;
import com.repository.IMarriageSeekerRepository;

@Service("marriageService")
public class MatrimonyMgmtServiceImpl implements IMatrimonyMgmtService {
	@Autowired
	private  IMarriageSeekerRepository  marriageRepo;

	@Override
	public String registerMarriageSeeker(MarriageSeeker seeker) {
		long idVal=marriageRepo.save(seeker).getMid();
		return " Marriage Seeker is registered with the id value::"+idVal;
	
	}

	@Override
	public MarriageSeeker getMarriageSeekerById(long id) {
				return  marriageRepo.findById(id).orElseThrow(()->new IllegalArgumentException("invalid id"));
	}

}
