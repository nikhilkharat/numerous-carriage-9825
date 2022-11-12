package Usecases;

import java.sql.SQLException;
import java.util.Scanner;

import Dao.CrimeDao;
import Dao.CrimeDaoImpl;
import Exception.CrimeException;
import Model.CriminalDetails;

public class CriminalDetailsUC {

	public static void main() throws CrimeException, SQLException {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Criminal Name");
		String crimeName= sc.next();
		
		System.out.println("Enter Criminal Age");
		int Age= sc.nextInt();
		
		System.out.println("Enter Criminal Gender");
		String Gender= sc.next();
		
		System.out.println("Enter Criminal Identity");
		String Identity= sc.next();
		
		System.out.println("Enter Case Status");
		String status= sc.next();
		
				
		
		CrimeDao dao= new CrimeDaoImpl();
		
		CriminalDetails criminalDetails= new CriminalDetails(crimeName, Age, Gender, Identity, status);
		
		String result= dao.insertCriminals(criminalDetails);
		
		System.out.println(result);
	}

}
