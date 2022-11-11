package Usecases;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import Colors.ConsoleColors;
import Dao.CrimeDao;
import Dao.CrimeDaoImpl;
import Exception.CrimeException;
import Model.CrimeDetails;
import Model.CriminalDetails;

public class ListCriminalDetailsUC {

	public static void main(String[] args) throws CrimeException, SQLException  {
		// TODO Auto-generated method stub

		CrimeDao dao= new CrimeDaoImpl();
		
		
		try {
			List<CriminalDetails> criminaldetails= dao.getAllCriminalDetails();
			criminaldetails.forEach(s->System.out.println(ConsoleColors.FOREST_GREEN_BACKGROUND+s));
		} catch (CrimeException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
		}
	}

}
