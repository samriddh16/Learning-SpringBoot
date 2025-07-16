package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.StdModel;

@Component("stddao")
public class StdDaoImpl implements IStdDao {
	 private static final String INSQ="INSERT INTO REALTIME_STUDENT_REGISTER VALUES(s2.nextval,?,?,?,?,?,?,?)";
      
	@Autowired
	private DataSource ds;

	@Override
    public int dbInsert(StdModel mod) throws Exception{
    	int result;
    	try( Connection con=ds.getConnection(); 
   	    	 PreparedStatement ps = con.prepareStatement(INSQ)
   	    			){
    		ps.setString(1,mod.getStdname());
    		ps.setString(2,mod.getStdcourse());
    		ps.setFloat(3,mod.getMarks1());
    		ps.setFloat(4, mod.getMarks2());
    		ps.setFloat(5,mod.getMarks3());
    		ps.setFloat(6,mod.getTotal());
    		ps.setFloat(7, mod.getAvg());
   	        result=ps.executeUpdate();
   	    	 }catch(SQLException se) {
   	    		 throw se;
   	    	 }catch(Exception e) {
   	    		 throw e;
   	    	 } 
    	   return result;
    	}  
}
