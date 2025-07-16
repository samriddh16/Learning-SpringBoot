package com.service;

import java.util.List;
import com.document.DrivingLicense;
import com.document.Person;

public interface IOneToOneAssociationMgmtService {
     public String  saveDataUsingPerson(Person person);
     public  String  saveDataUsingDrivingLicense(DrivingLicense license);
     
     public  List<Person>  showDataUsingPerson();
     public  List<DrivingLicense>  showDataUsingDrivingLicense();
     
}
