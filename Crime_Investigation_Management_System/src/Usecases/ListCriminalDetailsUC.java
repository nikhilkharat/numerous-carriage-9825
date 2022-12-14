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

	public static void main() throws CrimeException, SQLException  {
		// TODO Auto-generated method stub

		CrimeDao dao= new CrimeDaoImpl();
		
		System.out.println(ConsoleColors.RED_BOLD+ConsoleColors.BANANA_YELLOW_BACKGROUND+"==========Criminal Details=========="+ConsoleColors.RESET);
		try {
			List<CriminalDetails> criminaldetails= dao.getAllCriminalDetails();
			criminaldetails.forEach(s->System.out.println(ConsoleColors.ORANGE+s));
		} catch (CrimeException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
		}
	}

}
