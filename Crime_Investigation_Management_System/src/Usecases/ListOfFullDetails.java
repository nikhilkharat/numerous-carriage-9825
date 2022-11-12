package Usecases;

import java.util.List;

import Colors.ConsoleColors;
import Dao.CriminalDao;
import Dao.CriminalDaoImpl;
import Exception.CrimeException;
import Model.CriminalDet;
import Model.FullDetail;

public class ListOfFullDetails {

	public static void main() {
		// TODO Auto-generated method stub

		CriminalDao cdao1= new CriminalDaoImpl();
		
		System.out.println(ConsoleColors.RED_BOLD+ConsoleColors.BANANA_YELLOW_BACKGROUND+"==========Full Details of Ciminal by Crime=========="+ConsoleColors.RESET);
		try {
			List<FullDetail> dtosss= cdao1.getAllDetails();
			dtosss.forEach(s->System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT+s));
		} catch (CrimeException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
