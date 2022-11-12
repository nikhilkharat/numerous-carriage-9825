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

	@Override
	public List<CriminalDet> getAllCriminalByPlace(String CrimePlace) throws CrimeException {
		// TODO Auto-generated method stub
		List<CriminalDet> det= new ArrayList<>();
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			 
		PreparedStatement ps=conn.prepareStatement("select c.crimeID,c.CriminalName,cd.DateOfCrime,cd.CrimePlace,cd.CrimeType from CriminalByPoliceStation c INNER JOIN CrimeDetails cd ON c.crimeID=cd.CrimeId where CrimePlace=?");
			
		ps.setString(1, CrimePlace);
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
			throw new CrimeException("No Place Found");
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CrimeException(e.getMessage()); 
		}

		return det;
	}

	@Override
	public List<CriminalDet> getAllCriminalByType(String CrimeType) throws CrimeException {
		// TODO Auto-generated method stub
		List<CriminalDet> det1= new ArrayList<>();
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			 
		PreparedStatement ps1=conn.prepareStatement("select c.crimeID,c.CriminalName,cd.DateOfCrime,cd.CrimePlace,cd.CrimeType from CriminalByPoliceStation c INNER JOIN CrimeDetails cd ON c.crimeID=cd.CrimeId where CrimeType=?");
			
		ps1.setString(1, CrimeType);
		ResultSet rs1= ps1.executeQuery();
		
		while(rs1.next()) {
			
			CriminalDet dto1 =new CriminalDet();
			
			dto1.setCrimeID(rs1.getInt("crimeID"));
			dto1.setCriminalName(rs1.getString("CriminalName"));
			dto1.setDateofCrime(rs1.getString("DateOfCrime"));
			dto1.setCrimePlace(rs1.getString("CrimePlace"));
			dto1.setCrimeType(rs1.getString("CrimeType"));
			
			
			det1.add(dto1);

		}
		if(det1.size()==0)
			throw new CrimeException("No Crime Type Found");
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CrimeException(e.getMessage()); 
		}

		return det1;
	}

	@Override
	public List<CriminalDet> getAllCriminalByMonth() throws CrimeException {
		// TODO Auto-generated method stub
		List<CriminalDet> det1= new ArrayList<>();
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			 
		PreparedStatement ps1=conn.prepareStatement("select c.crimeID,c.CriminalName,cd.DateOfCrime,cd.CrimePlace,cd.CrimeType from CriminalByPoliceStation c INNER JOIN CrimeDetails cd ON c.crimeID=cd.CrimeId group by MONTH(DateOfCrime) order by DateOfCrime asc");
			
		
		ResultSet rs1= ps1.executeQuery();
		
		while(rs1.next()) {
			
			CriminalDet dto1 =new CriminalDet();
			
			dto1.setCrimeID(rs1.getInt("crimeID"));
			dto1.setCriminalName(rs1.getString("CriminalName"));
			dto1.setDateofCrime(rs1.getString("DateOfCrime"));
			dto1.setCrimePlace(rs1.getString("CrimePlace"));
			dto1.setCrimeType(rs1.getString("CrimeType"));
		
			
			det1.add(dto1);

		}
		if(det1.size()==0)
			throw new CrimeException("No Crime BY Month Found");
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CrimeException(e.getMessage()); 
		}

		return det1;
	}

	@Override
	public List<CriminalDet> getAllCaseStatus(String CaseStatus) throws CrimeException {
		// TODO Auto-generated method stub
List<CriminalDet> det1= new ArrayList<>();
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			 
		PreparedStatement ps1=conn.prepareStatement("select c.crimeID,c.CriminalName,cd.DateOfCrime,cd.CrimePlace,cd.CrimeType, cr.CaseStatus from CriminalByPoliceStation c INNER JOIN CrimeDetails cd INNER JOIN criminalDetails cr ON c.crimeID=cd.CrimeId AND c.CriminalName=cr.CriminalName where CaseStatus=?");
			
		ps1.setString(1, CaseStatus);
		ResultSet rs1= ps1.executeQuery();
		
		while(rs1.next()) {
			
			CriminalDet dto1 =new CriminalDet();
			
			dto1.setCrimeID(rs1.getInt("crimeID"));
			dto1.setCriminalName(rs1.getString("CriminalName"));
			dto1.setDateofCrime(rs1.getString("DateOfCrime"));
			dto1.setCrimePlace(rs1.getString("CrimePlace"));
			dto1.setCrimeType(rs1.getString("CrimeType"));
			dto1.setCaseStatus(rs1.getString("CaseStatus"));
			
			
			det1.add(dto1);

		}
		if(det1.size()==0)
			throw new CrimeException("No Case Status Found");
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CrimeException(e.getMessage()); 
		}

		return det1;
	}



}
