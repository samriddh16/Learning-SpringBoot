package com.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository("porcdao")
@Profile({"prod","test"})
public class PatientOrcDao implements IDAO {

	private static final String PATIENT_INSQ= "SELECT * FROM CORONA_PATIENTS WHERE CITY IN (?,?,?) ORDER BY CITY DESC";
	
	@Autowired
	private DataSource data;
	
	@Override
	public List<Employee> getPatients(String c1, String c2, String c3) throws Exception {
		System.out.println("PatientOrcDao.getPatients()");
		System.out.println(data.getClass());
		List <Employee> list = null;
		try (Connection con = data.getConnection();
				PreparedStatement ps = con.prepareStatement(PATIENT_INSQ)) {
			ps.setString(1, c1);
			ps.setString(2, c2);
			ps.setString(3, c3);
			try (ResultSet rs = ps.executeQuery()) {
				list = new ArrayList<Employee>();
				while(rs.next()) {
					Employee emp = new Employee();
					emp.setPid(rs.getInt(1));
					emp.setPname(rs.getString(2));
					emp.setPage(rs.getInt(3));
					emp.setPgender(rs.getString(4));
					emp.setPstate(rs.getString(5));
					emp.setPcity(rs.getString(6));
					emp.setPdate(rs.getString(7));
					emp.setPstatus(rs.getString(8));
					list.add(emp);
				}
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
