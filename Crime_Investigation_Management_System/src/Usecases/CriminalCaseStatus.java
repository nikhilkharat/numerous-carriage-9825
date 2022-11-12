package Usecases;

import java.util.List;
import java.util.Scanner;

import Colors.ConsoleColors;
import Dao.CriminalDao;
import Dao.CriminalDaoImpl;
import Exception.CrimeException;
import Model.CriminalDet;

public class CriminalCaseStatus {

	public static void main() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println(ConsoleColors.DARK_BLUE+"Enter Case Status Type");
		String cStatus=sc.next();

		CriminalDao cdao1= new CriminalDaoImpl();
		
		System.out.println(ConsoleColors.RED_BOLD+ConsoleColors.BANANA_YELLOW_BACKGROUND+"==========Criminal Case Status (Solved/Unsolved)=========="+ConsoleColors.RESET);
		try {
			List<CriminalDet> dtosss= cdao1.getAllCaseStatus(cStatus);
			dtosss.forEach(s->System.out.println(ConsoleColors.DARK_BLUE+s));
		} catch (CrimeException e) {
			
			System.out.println(e.getMessage());
		}
	}
}
