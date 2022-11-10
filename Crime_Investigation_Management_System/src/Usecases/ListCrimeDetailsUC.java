package Usecases;

import java.sql.SQLException;
import java.util.List;

import Dao.CrimeDao;
import Dao.CrimeDaoImpl;
import Exception.CrimeException;
import Model.CrimeDetails;

public class ListCrimeDetailsUC {
	
	public static void main(String[] args) throws CrimeException, SQLException {
		
		
		CrimeDao dao= new CrimeDaoImpl();
		
		
		try {
			List<CrimeDetails> crimeDetails= dao.getAllCrimeDetails();
			crimeDetails.forEach(s->System.out.println(s));
		} catch (CrimeException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
		}
			
	}

}
