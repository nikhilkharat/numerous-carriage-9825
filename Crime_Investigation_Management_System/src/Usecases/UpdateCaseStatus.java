package Usecases;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import Colors.ConsoleColors;
import Dao.CrimeDao;
import Dao.CrimeDaoImpl;
import Dao.CriminalDao;
import Dao.CriminalDaoImpl;
import Exception.CrimeException;
import Model.CriminalDet;
import Model.CriminalDetails;

public class UpdateCaseStatus {

	public static void main() throws SQLException {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println(ConsoleColors.BLACK_BOLD+"Enter Criminal Name to Update Case Status");
		String cStatus=sc.next();

		CrimeDao cdao1= new CrimeDaoImpl();
		
		System.out.println(ConsoleColors.RED_BOLD+ConsoleColors.BLACK_ITALIC+"==========Criminal Case Status (Solved/Unsolved)=========="+ConsoleColors.RESET);
		try {
			String rs = cdao1.updateStatus(cStatus);
			System.out.println(ConsoleColors.DARK_BLUE+rs);
		} catch (CrimeException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
