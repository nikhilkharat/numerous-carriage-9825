package Usecases;

import java.util.List;

import Colors.ConsoleColors;
import Dao.CriminalDao;
import Dao.CriminalDaoImpl;
import Exception.CrimeException;
import Model.CriminalDet;
import Model.CriminalDetails;

public class CriminalByCrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CriminalDao cdao= new CriminalDaoImpl();
		
		try {
			List<CriminalDet> dtoss= cdao.getAllCriminalByCrime();
			dtoss.forEach(s->System.out.println(ConsoleColors.RED_BOLD+s));
		} catch (CrimeException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
		}
	}

}
