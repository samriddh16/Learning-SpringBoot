package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.CustModel;

@Component("custdao")
public class CustDaoImpl implements ICustDao {
	 private static final String INSQ="INSERT INTO REALTIME_CUSTOMER_SERVICE VALUES(s1.nextval,?,?,?,?,?,?)";
      
	@Autowired
	private DataSource ds;

	@Override
    public int dbInsert(CustModel mod) throws Exception{
    	int result;
    	try( Connection con=ds.getConnection(); 
   	    	 PreparedStatement ps = con.prepareStatement(INSQ)
   	    			){
    		ps.setString(1,mod.getCustname());
    		ps.setString(2,mod.getCustaddr());
    		ps.setFloat(3,mod.getPayment());
    		ps.setFloat(4, mod.getTime());
    		ps.setFloat(5,mod.getRate());
    		ps.setFloat(6,mod.getInterestamt());
   	        result=ps.executeUpdate();
   	    	 }catch(SQLException se) {
   	    		 throw se;
   	    	 }catch(Exception e) {
   	    		 throw e;
   	    	 } 
    	   return result;
    	}  
}
