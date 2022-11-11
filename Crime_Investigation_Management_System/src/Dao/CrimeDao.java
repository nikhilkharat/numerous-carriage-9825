package Dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.*;

import Exception.CrimeException;
import Model.CrimeDetails;
import Model.CriminalDetails;


public interface CrimeDao {
	
	public final String username = "Admin";
	
	public final String password = "1234";

	public String adminLogin(String username, String password);

	
	public String insertCrimeDetailsRegiter(CrimeDetails crimedetails) throws CrimeException, SQLException;

	public List<CrimeDetails> getAllCrimeDetails() throws CrimeException, SQLException;
	
	public String insertCriminals(CriminalDetails criminalDetails) throws CrimeException, SQLException;
	
	public List<CriminalDetails> getAllCriminalDetails() throws CrimeException, SQLException;
	
	public String enrollCriminalCrime(int crimeID, String criminalName) throws CrimeException, SQLException;
	
//	public String insertPoliceStationDetails(PoliceStationDetails policeStation) throws CrimeException, SQLException;
//	
//	public List<PoliceStationDetails> getAllPoliceStationDetails() throws CrimeException, SQLException;
//	
//	public List<PoliceStationWiseCrime> getPoliceStationWiseCrimeDetails(String policeStationLocation) throws CrimeException, SQLException;
	
	
}

