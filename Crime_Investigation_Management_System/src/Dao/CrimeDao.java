package Dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.*;

import Exception.CrimeException;
import Model.CrimeDetails;
import Model.CriminalDetails;


public interface CrimeDao {
	
	public String insertCrimeDetailsRegiter(CrimeDetails crimedetails) throws CrimeException, SQLException;

	public List<CrimeDetails> getAllCrimeDetails() throws CrimeException, SQLException;
	
	public String insertCriminals(CriminalDetails criminalDetails) throws CrimeException, SQLException;
	
//	public String insertPoliceStationDetails(PoliceStationDetails policeStation) throws CrimeException, SQLException;
//	
//	public List<PoliceStationDetails> getAllPoliceStationDetails() throws CrimeException, SQLException;
//	
//	public List<PoliceStationWiseCrime> getPoliceStationWiseCrimeDetails(String policeStationLocation) throws CrimeException, SQLException;
	
	
}

