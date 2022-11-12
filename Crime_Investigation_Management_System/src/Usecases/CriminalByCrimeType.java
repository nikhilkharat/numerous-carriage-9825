package Usecases;

import java.util.List;
import java.util.Scanner;

import Colors.ConsoleColors;
import Dao.CriminalDao;
import Dao.CriminalDaoImpl;
import Exception.CrimeException;
import Model.CriminalDet;

public class CriminalByCrimeType {

	public static void main() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println(ConsoleColors.DARK_BLUE+"Enter Area of Crime Type");
		String ctype=sc.next();

		CriminalDao cdao1= new CriminalDaoImpl();
		
		System.out.println(ConsoleColors.RED_BOLD+ConsoleColors.BANANA_YELLOW_BACKGROUND+"==========Crimininal By Crime Type=========="+ConsoleColors.RESET);
		try {
			List<CriminalDet> dtosss= cdao1. getAllCriminalByType(ctype);
			dtosss.forEach(s->System.out.println(ConsoleColors.DARK_BLUE+s));
		} catch (CrimeException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
