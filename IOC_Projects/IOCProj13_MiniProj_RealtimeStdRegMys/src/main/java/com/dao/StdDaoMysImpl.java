package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.StdModel;

@Component("stdmydao")
public class StdDaoMysImpl implements IStdDao {
    private static final String INSQ="INSERT INTO REALTIME_STUDENT_REGISTER(sname,scourse,m1,m2,m3,total,avg) VALUES(?,?,?,?,?,?,?)";
    
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
