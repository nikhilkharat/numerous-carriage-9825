package Usecases;

import java.util.List;
import java.util.Scanner;

import Colors.ConsoleColors;
import Dao.CriminalDao;
import Dao.CriminalDaoImpl;
import Exception.CrimeException;
import Model.CriminalDet;

public class CriminalByCrimeMonth {

	public static void main() {
		// TODO Auto-generated method stub
		

		CriminalDao cdao1= new CriminalDaoImpl();
		
		System.out.println(ConsoleColors.RED_BOLD+ConsoleColors.BANANA_YELLOW_BACKGROUND+"==========Criminal Details By Month=========="+ConsoleColors.RESET);
		try {
			List<CriminalDet> dtosss= cdao1. getAllCriminalByMonth();
			dtosss.forEach(s->System.out.println(ConsoleColors.GREEN_BOLD+s));
		} catch (CrimeException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
