package Usecases;

import java.sql.SQLException;
import java.util.Scanner;

import Dao.CrimeDao;
import Dao.CrimeDaoImpl;
import Exception.CrimeException;
import Model.CrimeDetails;

public class CrimeDetailsUC {

	public static void main(String[] args) throws CrimeException, SQLException {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter CrimeID");
		int crimeID= sc.nextInt();
		
		System.out.println("Enter Crime Date");
		String crimeDate= sc.next();
		
		System.out.println("Enter Crime Place");
		String crimePlace= sc.next();
		
		System.out.println("Enter Crime Type");
		String crimeType= sc.next();
		
		System.out.println("Enter Crime Description");
		String crimeDesc= sc.next();
		
		System.out.println("Enter Victims");
		String victim= sc.next();
				
		System.out.println("Enter Criminal Name");
		String criminalname= sc.next();
		
		
		CrimeDao dao= new CrimeDaoImpl();
		
		CrimeDetails crimeDetails= new CrimeDetails(crimeID, crimeDate, crimePlace, crimeType, crimeDesc, victim, criminalname);
		
		String result= dao.insertCriminalRegiter(crimeDetails);
		
		System.out.println(result);

	}

}
