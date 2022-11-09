package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

import Exception.CrimeException;
import Model.CrimeDetails;
import Utility.DBUtil;

public class CrimeDaoImpl implements CrimeDao {

	@Override
	public String insertCriminalRegiter(CrimeDetails crimedetails) throws CrimeException, SQLException  {
		// TODO Auto-generated method stub
		
		String message="Not Inserted Crime Details";
		
		try (Connection conn =DBUtil.provideConnection()) {
			
		PreparedStatement ps=conn.prepareStatement("insert into crimedetails values (?,?,?,?,?,?,?)");
		
		ps.setInt(1, crimedetails.getCrimeId());
		ps.setString(2, crimedetails.getDateOfCrime());
		ps.setString(3, crimedetails.getCrimePlace());
		ps.setString(4, crimedetails.getCrimeType());
		ps.setString(5, crimedetails.getCrimeDescription());
		ps.setString(6, crimedetails.getVictims());
		ps.setString(7, crimedetails.getCriminalName());
		
		int x= ps.executeUpdate();
		
		if(x>0)
			message="Record Inserted Successfully";
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return message;
	}

	
	

}
