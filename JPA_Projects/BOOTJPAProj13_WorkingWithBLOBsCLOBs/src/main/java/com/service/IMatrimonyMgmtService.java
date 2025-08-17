package com.service;

import com.entity.MarriageSeeker;

public interface IMatrimonyMgmtService {
     public  String  registerMarriageSeeker(MarriageSeeker seeker);
     public    MarriageSeeker getMarriageSeekerById(long id);
}
