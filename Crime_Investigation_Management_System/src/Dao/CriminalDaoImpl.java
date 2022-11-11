package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Exception.CrimeException;
import Model.CriminalDet;
import Utility.DBUtil;

public class CriminalDaoImpl implements CriminalDao{

	@Override
	public List<CriminalDet> getAllCriminalByCrime() throws CrimeException {
		// TODO Auto-generated method stub
		List<CriminalDet> det= new ArrayList<>();
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			 
		PreparedStatement ps=conn.prepareStatement("select c.crimeID,c.CriminalName,cd.DateOfCrime,cd.CrimePlace,cd.CrimeType from CriminalByPoliceStation c INNER JOIN CrimeDetails cd ON c.crimeID=cd.CrimeId order by c.CriminalName");
			
		ResultSet rs= ps.executeQuery();
		
		while(rs.next()) {
			
			CriminalDet dto =new CriminalDet();
			
			dto.setCrimeID(rs.getInt("crimeID"));
			dto.setCriminalName(rs.getString("CriminalName"));
			dto.setDateofCrime(rs.getString("DateOfCrime"));
			dto.setCrimePlace(rs.getString("CrimePlace"));
			dto.setCrimeType(rs.getString("CrimeType"));
			
			
			det.add(dto);

		}
		if(det.size()==0)
			throw new CrimeException("No Criminal Enrolled");
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CrimeException(e.getMessage()); 
		}

		return det;
	}

}
