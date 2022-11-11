package Usecases;

import java.sql.SQLException;
import java.util.Scanner;

import Colors.ConsoleColors;
import Dao.CrimeDao;
import Dao.CrimeDaoImpl;
import Exception.CrimeException;
import Model.CrimeDetails;

public class CrimeDetailsUC {

	public static void main() throws CrimeException, SQLException {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println(ConsoleColors.BLUE_BOLD+"Enter CrimeID");
		int crimeID= sc.nextInt();
		
		System.out.println(ConsoleColors.BLUE_BOLD+"Enter Crime Date");
		String crimeDate= sc.next();
		
		System.out.println(ConsoleColors.BLUE_BOLD+"Enter Crime Place");
		String crimePlace= sc.next();
		
		System.out.println(ConsoleColors.BLUE_BOLD+"Enter Crime Type");
		String crimeType= sc.next();
		
		System.out.println(ConsoleColors.BLUE_BOLD+"Enter Crime Description");
		String crimeDesc= sc.next();
		
		System.out.println(ConsoleColors.BLUE_BOLD+"Enter Victims");
		String victim= sc.next();

		CrimeDao dao= new CrimeDaoImpl();
		
		CrimeDetails crimeDetails= new CrimeDetails(crimeID, crimeDate, crimePlace, crimeType, crimeDesc, victim);
		
		String result= dao.insertCrimeDetailsRegiter(crimeDetails);
		
		System.out.println(result);

	}

}

















