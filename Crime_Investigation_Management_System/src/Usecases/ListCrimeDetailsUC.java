package Usecases;

import java.sql.SQLException;
import java.util.List;

import Colors.ConsoleColors;
import Dao.CrimeDao;
import Dao.CrimeDaoImpl;
import Exception.CrimeException;
import Model.CrimeDetails;

public class ListCrimeDetailsUC {
	
	public static void main() throws CrimeException, SQLException {
		
		
		CrimeDao dao= new CrimeDaoImpl();
		
		System.out.println(ConsoleColors.RED_BOLD+ConsoleColors.BANANA_YELLOW_BACKGROUND+"==========Crime Details=========="+ConsoleColors.RESET);
		try {
			List<CrimeDetails> crimeDetails= dao.getAllCrimeDetails();
			crimeDetails.forEach(s->System.out.println(ConsoleColors.RED +s));
		} catch (CrimeException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
		}
			
	}

}
