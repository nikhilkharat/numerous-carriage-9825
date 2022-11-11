package MainClass;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import Colors.ConsoleColors;
import Dao.CrimeDao;
import Dao.CrimeDaoImpl;
import Exception.CrimeException;
import Model.CrimeDetails;
import Usecases.CrimeDetailsUC;
import Usecases.CriminalDetailsUC;
import Usecases.ListCrimeDetailsUC;
import Usecases.LoginUC;

public class Main {
	
	public static void main(String[] args) {
			
		adminLogin();
	}
	
	static void adminLogin() {
		
		if(LoginUC.AdminLogin()) {
			adminMethods();
		}
		
	}
	
	

	static void adminMethods() {
		System.out.println(ConsoleColors.PURPLE + "+---------------------------------------+"+ "\n"
						 + "| Welcome Admin                 	|" + "\n"
						 + "| 1. Add Crime Details          	|" + "\n"
						 + "| 2. List of All Crimes	Details		|" + "\n"
						 + "| 3. Add Criminal Details		|" + "\n"
						 + "| 4. List of All Criminal Details   	|" + "\n"
						 + "| 5. List of All Criminal Details      	|" + "\n"
						 + "+---------------------------------------+" + ConsoleColors.RESET);
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		try {
			choice = sc.nextInt();
			if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5) {
				System.out.println(ConsoleColors.RED_BACKGROUND + "Please choose a number from below options" + ConsoleColors.RESET);
				adminMethods();
			}
			else adminChoice(choice);
		}
		catch (InputMismatchException e) {
			
			System.out.println(ConsoleColors.RED_BACKGROUND + "Input type should be number" + ConsoleColors.RESET);
			adminMethods();
		}
	}
//	
	static void adminChoice(int choice) {

		if (choice == 1) {
			try {
				CrimeDetailsUC.main();;
			} catch (CrimeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(ConsoleColors.RED_BACKGROUND + "Enter 10 to go to main Menu" + ConsoleColors.RESET);
			Scanner sc = new Scanner(System.in);
			int mChoice = sc.nextInt();
			if(mChoice ==10 ) mainMenu();
			else {
				System.out.println(ConsoleColors.RED_BACKGROUND + "Wrong number please Enter 10" + ConsoleColors.RESET);
				while(true) {
					if(mChoice != 10) {
						int m = sc.nextInt();
						if(m==10 ) mainMenu();
					}
				}
			}
		}
		
		else if (choice == 2) {
			try {
				ListCrimeDetailsUC.main();
			} catch (CrimeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Enter 10 to go to main Menu");
			Scanner sc = new Scanner(System.in);
			while(true) {
				
				int mChoice = sc.nextInt();
				if(mChoice !=10 ) 
					System.out.println("Wrong number please Enter 10");
				
				else {
					mainMenu();
				}
				
			}

			
		}
		
		else if (choice == 3) {
			System.out.println(ConsoleColors.ROSY_PINK + "Thank you ! Visit again" + ConsoleColors.RESET);
			
		}
		else {
			System.out.println(ConsoleColors.RED_BACKGROUND + "Please choose a number from below options" + ConsoleColors.RESET);
			
		}
	}

	public static void mainMenu() {
		adminMethods();
	}


}
	

