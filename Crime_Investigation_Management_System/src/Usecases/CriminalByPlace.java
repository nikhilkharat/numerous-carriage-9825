package Usecases;

import java.util.List;
import java.util.Scanner;

import Colors.ConsoleColors;
import Dao.CriminalDao;
import Dao.CriminalDaoImpl;
import Exception.CrimeException;
import Model.CriminalDet;

public class CriminalByPlace {

	public static void main() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println(ConsoleColors.CYAN_BOLD+"Enter Area of Police Station where Crime Happened");
		String cplace=sc.next();

		CriminalDao cdao= new CriminalDaoImpl();
		
		System.out.println(ConsoleColors.RED_BOLD+ConsoleColors.BANANA_YELLOW_BACKGROUND+"==========Criminal By Place Details=========="+ConsoleColors.RESET);
		try {
			List<CriminalDet> dtoss= cdao.getAllCriminalByPlace(cplace);
			dtoss.forEach(s->System.out.println(ConsoleColors.CYAN_BOLD+s));
		} catch (CrimeException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
