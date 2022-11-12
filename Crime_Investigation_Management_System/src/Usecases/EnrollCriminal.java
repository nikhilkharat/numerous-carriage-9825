package Usecases;

import java.sql.SQLException;
import java.util.Scanner;

import Colors.ConsoleColors;
import Dao.CrimeDao;
import Dao.CrimeDaoImpl;
import Exception.CrimeException;

public class EnrollCriminal {

	public static void main() throws CrimeException {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter CrimeID");
		int crimeID= sc.nextInt();
		
		System.out.println("Enter Criminal Name");
		String criminalName= sc.next();
		
		CrimeDao dao= new CrimeDaoImpl();
		
		try {
			String result= dao.enrollCriminalCrime(crimeID, criminalName);
			System.out.println(ConsoleColors.BROWN+result);
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
