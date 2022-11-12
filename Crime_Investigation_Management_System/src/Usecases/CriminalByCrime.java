package Usecases;

import java.util.List;

import Colors.ConsoleColors;
import Dao.CriminalDao;
import Dao.CriminalDaoImpl;
import Exception.CrimeException;
import Model.CriminalDet;
import Model.CriminalDetails;

public class CriminalByCrime {

	public static void main() {
		// TODO Auto-generated method stub

		
		CriminalDao cdao= new CriminalDaoImpl();
		
		System.out.println(ConsoleColors.RED_BOLD+ConsoleColors.BANANA_YELLOW_BACKGROUND+"==========Criminal Details By Crime=========="+ConsoleColors.RESET);
		try {
			List<CriminalDet> dtoss= cdao.getAllCriminalByCrime();
			dtoss.forEach(s->System.out.println(ConsoleColors.PURPLE_BOLD+s));
		} catch (CrimeException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
		}
	}

}
