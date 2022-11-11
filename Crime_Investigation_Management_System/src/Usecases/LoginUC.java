package Usecases;

import Colors.ConsoleColors;
import Dao.CrimeDao;
import Dao.CrimeDaoImpl;

import java.util.*;

public class LoginUC {
	
public static boolean AdminLogin() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(ConsoleColors.RED+"Welcome To NK Crimie Investigation Management System");
		
		System.out.println(ConsoleColors.GREEN+"Please Login for Accessing a System");
		
		
		
		System.out.println(ConsoleColors.ORANGE +  "Enter username" + ConsoleColors.RESET);
		String username = sc.next();
		
		System.out.println(ConsoleColors.ORANGE + "Enter password" + ConsoleColors.RESET);
		String password = sc.next();
		
		CrimeDao dao = new CrimeDaoImpl();
		String result =  dao.adminLogin(username, password);
		
		if (result.equals("Login Successfull")){
			System.out.println(ConsoleColors.GREEN_BACKGROUND + result + ConsoleColors.RESET);
			return true;
		}
		else {
			System.out.println(ConsoleColors.RED_BACKGROUND + result + ConsoleColors.RESET);
			return false;
		}

	}

}
