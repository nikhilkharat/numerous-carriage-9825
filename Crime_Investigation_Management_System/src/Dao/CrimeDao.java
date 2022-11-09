package Dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import Exception.CrimeException;
import Model.CrimeDetails;

public interface CrimeDao {
	
	public String insertCriminalRegiter(CrimeDetails crimedetails) throws CrimeException, SQLException;

	

}

