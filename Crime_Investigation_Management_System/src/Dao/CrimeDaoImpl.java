package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import Exception.CrimeException;
import Model.CrimeDetails;
import Model.CriminalDetails;

import Utility.DBUtil;

public class CrimeDaoImpl implements CrimeDao {
	
	@Override
	public String adminLogin(String username, String password) {
			String message = "Invalid username or password";
		
		if (username.equals(CrimeDao.username) && password.equals(CrimeDao.password)) {
			 message = "Login Successfull";
		}
		
		return message;
	}

	@Override
	public String insertCrimeDetailsRegiter(CrimeDetails crimedetails) throws CrimeException, SQLException  {
		// TODO Auto-generated method stub
		
		String message="Not Inserted Crime Details";
		
		try (Connection conn =DBUtil.provideConnection()) {
			
		PreparedStatement ps=conn.prepareStatement("insert into crimedetails values (?,?,?,?,?,?)");
		
		ps.setInt(1, crimedetails.getCrimeId());
		ps.setString(2, crimedetails.getDateOfCrime());
		ps.setString(3, crimedetails.getCrimePlace());
		ps.setString(4, crimedetails.getCrimeType());
		ps.setString(5, crimedetails.getCrimeDescription());
		ps.setString(6, crimedetails.getVictims());
		
		
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

	@Override
	public List<CrimeDetails> getAllCrimeDetails() throws CrimeException,SQLException {
		// TODO Auto-generated method stub
		
		List<CrimeDetails> crimeDetails= new ArrayList<>();
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from crimedetails");
			
			ResultSet rs =ps.executeQuery();
			
			while(rs.next()) {
				
				int id= rs.getInt("crimeID");
				String date= rs.getString("dateOfCrime");
				String crimePlace=rs.getString("crimePlace");
				String crimeType=rs.getString("crimeType");
				String crimeDes=rs.getString("crimeDescription");
				String victims=rs.getString("Victims");
		
				
				
				CrimeDetails cd =new CrimeDetails(id, crimeDes, crimePlace, crimeType, crimeDes, victims);
				crimeDetails.add(cd);
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new CrimeException(e.getMessage());
		}
		
		
		return crimeDetails;
		
	}
	
	@Override
	public String insertCriminals(CriminalDetails criminalDetails) throws CrimeException, SQLException {
		// TODO Auto-generated method stub

		String message="Not Inserted Crime Details";
		
		try (Connection conn =DBUtil.provideConnection()) {
			
		PreparedStatement ps=conn.prepareStatement("insert into criminalDetails values (?,?,?,?)");
		
		ps.setString(1, criminalDetails.getCriminalName());
		ps.setInt(2, criminalDetails.getAge());
		ps.setString(3, criminalDetails.getGender());
		ps.setString(4, criminalDetails.getIdentity());
		
		
		
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
	
	@Override
	public List<CriminalDetails> getAllCriminalDetails() throws CrimeException, SQLException {
		// TODO Auto-generated method stub
		List<CriminalDetails> criminalDetails= new ArrayList<>();
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from criminaldetails");
			
			ResultSet rs =ps.executeQuery();
			
			while(rs.next()) {
				
				
				String criminalname= rs.getString("CriminalName");
				int age=rs.getInt("Age");
				String gender=rs.getString("Gender");
				String identity=rs.getString("Identity");
			
		
				
				
				CriminalDetails cd =new CriminalDetails(criminalname, age, gender, identity);
				criminalDetails.add(cd);
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new CrimeException(e.getMessage());
		}
		
		
		return criminalDetails;
	}
	
	@Override
	public String enrollCriminalCrime(int crimeID, String criminalName) throws CrimeException, SQLException {
		// TODO Auto-generated method stub
		String message="Not Enrolled Crime...";
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps1=conn.prepareStatement("select * from crimedetails where CrimeId=?");
			
			ps1.setInt(1, crimeID);
			
			ResultSet rs= ps1.executeQuery();
			
			if(rs.next()) {
				PreparedStatement ps2=conn.prepareStatement("select * from criminalDetails where CriminalName=?");
				
				ps2.setString(1, criminalName);
				
				ResultSet rs1= ps2.executeQuery();
				if (rs1.next()) {
					
					PreparedStatement ps3=conn.prepareStatement("insert into criminalByPoliceStation values (?,?)");
					ps3.setInt(1, crimeID);
					ps3.setString(2, criminalName);
					
					int x= ps3.executeUpdate();
					if (x>0)
						message="Criminal Enrolled Successfully";
					
				}else
					throw new CrimeException("Criminal Not Found");
			}else
				throw new CrimeException("CrimeID Not Found");
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new CrimeException(e.getMessage());
		}
		
		
		
		return message;
	}
//
//	@Override
//	public String insertPoliceStationDetails(PoliceStationDetails policeStation) throws CrimeException, SQLException {
//		// TODO Auto-generated method stub
//		String message="Police Station Not Inserted ";
//		
//		try (Connection conn =DBUtil.provideConnection()) {
//			
//		PreparedStatement ps=conn.prepareStatement("insert into policeStationDetails values (?,?)");
//		
//	
//		ps.setString(1, policeStation.getPoliceStationName());
//		ps.setString(2, policeStation.getPoliceStationLocation());
//	
//		
//		int x= ps.executeUpdate();
//		
//		if(x>0)
//			message="Police Station Inserted Successfully";
//			
//		} catch (SQLException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//		
//		return message;
//	}
//
//	@Override
//	public List<PoliceStationDetails> getAllPoliceStationDetails() throws CrimeException, SQLException {
//		// TODO Auto-generated method stub
//		List<PoliceStationDetails> policeStationDetails= new ArrayList<>();
//		
//		try(Connection conn= DBUtil.provideConnection()) {
//			
//			PreparedStatement ps= conn.prepareStatement("select * from policeStationDetails");
//			
//			ResultSet rs =ps.executeQuery();
//			
//			while(rs.next()) {
//				
//				String name= rs.getString("policeStationName");
//				String location= rs.getString("policeStationLocation");
//			
//				
//				PoliceStationDetails cd =new PoliceStationDetails(name, location);
//				policeStationDetails.add(cd);
//				
//			}
//		} catch (SQLException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			throw new CrimeException(e.getMessage());
//		}
//		
//		
//		return policeStationDetails;
//	}
//
//	@Override
//	public List<PoliceStationWiseCrime> getPoliceStationWiseCrimeDetails(String policeStationLocation)
//			throws CrimeException, SQLException {
//		// TODO Auto-generated method stub
//List<PoliceStationWiseCrime> policeStationWiseCrime= new ArrayList<>();
//		
//		try(Connection conn= DBUtil.provideConnection()) {
//			
//			PreparedStatement ps= conn.prepareStatement("select  * from policeStationwiseCrime INNER JOIN ON c.CrimePlace=p.policeStationLocation AND p.policeStationLocation=?;");
//			ps.setString(1, policeStationLocation);
//			
//			ResultSet rs =ps.executeQuery();
//			
//			while(rs.next()) {
//				int id= rs.getInt("CrimeId");
//				String date=rs.getString("DateOfCrime");
//				String place=rs.getString("CrimePlace");
//				String type=rs.getString("CrimeType");
//				String name= rs.getString("policeStationName");
//				String location= rs.getString("policeStationLocation");
//			
//				
//				PoliceStationWiseCrime cd1 =new PoliceStationWiseCrime(id, date, place, type, name, location);
//				policeStationWiseCrime.add(cd1);
//				
//			}
//		} catch (SQLException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			throw new CrimeException(e.getMessage());
//		}
//		
//		
//		return policeStationWiseCrime;
//	}

	

	

	

	




}
