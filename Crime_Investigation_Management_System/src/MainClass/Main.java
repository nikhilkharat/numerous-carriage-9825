package MainClass;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import Colors.ConsoleColors;
import Dao.CrimeDao;
import Dao.CrimeDaoImpl;
import Dao.CriminalDao;
import Dao.CriminalDaoImpl;
import Exception.CrimeException;
import Model.CrimeDetails;
import Usecases.CrimeDetailsUC;
import Usecases.CriminalByCrime;
import Usecases.CriminalByCrimeMonth;
import Usecases.CriminalByCrimeType;
import Usecases.CriminalByPlace;
import Usecases.CriminalCaseStatus;
import Usecases.CriminalDetailsUC;
import Usecases.EnrollCriminal;
import Usecases.ListCrimeDetailsUC;
import Usecases.ListCriminalDetailsUC;
import Usecases.ListOfFullDetails;
import Usecases.LoginUC;
import Usecases.UpdateCaseStatus;

public class Main {
	
	public static void main(String[] args) throws SQLException, CrimeException {
			
		
		adminLogin();
	}
	
	static void adminLogin() throws SQLException, CrimeException {
		
		if(LoginUC.AdminLogin()) {
			adminMethods();
		}
		
	}
	
	

	static void adminMethods() throws SQLException, CrimeException {
		System.out.println(ConsoleColors.PURPLE + "+---------------------------------------+"+ "\n"
						 + "| Welcome Officer in CIMS          	|" + "\n"
						 + "| 1. Add Crime Details          	|" + "\n"
						 + "| 2. List of All Crimes	Details		|" + "\n"
						 + "| 3. Add Criminal Details		|" + "\n"
						 + "| 4. List of All Criminal Details   	|" + "\n"
						 + "| 5. Enroll Criminal Details      	|" + "\n"
						 + "| 6. List of Criminal By Crime Details  |" + "\n"
						 + "| 7. Criminal By Place Details      	|" + "\n"
						 + "| 8. Criminal By Crime Details      	|" + "\n"
						 + "| 9. Criminal By Month Details      	|" + "\n"
						 + "|10. Criminal Case Status Details      	|" + "\n"
						 + "|11. All Case Details Status      	|" + "\n"
						 + "|12. Update Case Status      	      	|" + "\n"
						 + "+---------------------------------------+" + ConsoleColors.RESET);
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		try {
			choice = sc.nextInt();
			if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6 && choice !=7 && choice !=8 && choice !=9 && choice !=10 && choice !=11 && choice !=12) {
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
	
	//Fill Crime Details===================>
	static void adminChoice(int choice) throws SQLException, CrimeException {

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

			System.out.println(ConsoleColors.RED_ITALIC + "Enter 100 to go to main Menu" + ConsoleColors.RESET);
			Scanner sc = new Scanner(System.in);
			int mChoice = sc.nextInt();
			if(mChoice ==100 ) mainMenu();
			else {
				System.out.println(ConsoleColors.BLACK_BRIGHT + "Wrong number please Enter 100" + ConsoleColors.RESET);
				while(true) {
					if(mChoice != 100) {
						int m = sc.nextInt();
						if(m==100 ) mainMenu();
					}
				}
			}
		}
		
		
		//List of Crime Details===================>
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

			System.out.println(ConsoleColors.RED_ITALIC + "Enter 100 to go to main Menu" + ConsoleColors.RESET);
			Scanner sc = new Scanner(System.in);
			int mChoice = sc.nextInt();
			if(mChoice ==100 ) mainMenu();
			else {
				System.out.println(ConsoleColors.BLACK_BRIGHT + "Wrong number please Enter 100" + ConsoleColors.RESET);
				while(true) {
					if(mChoice != 100) {
						int m = sc.nextInt();
						if(m==100 ) mainMenu();
					}
				}
			}

			
		}
		
		
		//Fill Criminal Details===================>
		else if (choice == 3) {

			try {
				CriminalDetailsUC.main();
			} catch (CrimeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(ConsoleColors.RED_ITALIC + "Enter 100 to go to main Menu" + ConsoleColors.RESET);
			Scanner sc = new Scanner(System.in);
			int mChoice = sc.nextInt();
			if(mChoice ==100 ) mainMenu();
			else {
				System.out.println(ConsoleColors.BLACK_BRIGHT + "Wrong number please Enter 100" + ConsoleColors.RESET);
				while(true) {
					if(mChoice != 100) {
						int m = sc.nextInt();
						if(m==100 ) mainMenu();
					}
				}
			}
			
		}
		
		
		//List of Criminal Details===================>
		else if (choice == 4) {

			try {
				ListCriminalDetailsUC.main();
			} catch (CrimeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(ConsoleColors.RED_ITALIC + "Enter 100 to go to main Menu" + ConsoleColors.RESET);
			Scanner sc = new Scanner(System.in);
			int mChoice = sc.nextInt();
			if(mChoice ==100 ) mainMenu();
			else {
				System.out.println(ConsoleColors.BLACK_BRIGHT + "Wrong number please Enter 100" + ConsoleColors.RESET);
				while(true) {
					if(mChoice != 100) {
						int m = sc.nextInt();
						if(m==100 ) mainMenu();
					}
				}
			}
			
		}
		
		
		//Enrolling Criminal by its Crime================>
		else if (choice == 5) {

			try {
				EnrollCriminal.main();
			} catch (CrimeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(ConsoleColors.RED_ITALIC + "Enter 100 to go to main Menu" + ConsoleColors.RESET);
			Scanner sc = new Scanner(System.in);
			int mChoice = sc.nextInt();
			if(mChoice ==100 ) mainMenu();
			else {
				System.out.println(ConsoleColors.BLACK_BRIGHT + "Wrong number please Enter 100" + ConsoleColors.RESET);
				while(true) {
					if(mChoice != 100) {
						int m = sc.nextInt();
						if(m==100 ) mainMenu();
					}
				}
			}
			
		}
		//List of Criminal By Crime Details===================>
		else if (choice == 6) {

			CriminalByCrime.main();

			System.out.println(ConsoleColors.RED_ITALIC + "Enter 100 to go to main Menu" + ConsoleColors.RESET);
			Scanner sc = new Scanner(System.in);
			int mChoice = sc.nextInt();
			if(mChoice ==100 ) mainMenu();
			else {
				System.out.println(ConsoleColors.BLACK_BRIGHT + "Wrong number please Enter 100" + ConsoleColors.RESET);
				while(true) {
					if(mChoice != 100) {
						int m = sc.nextInt();
						if(m==100 ) mainMenu();
					}
				}
			}
			
		}
		
		//List of Criminal By Crime Place or Police Station Place Details===================>
		else if (choice == 7) {

			CriminalByPlace.main();

			System.out.println(ConsoleColors.RED_ITALIC + "Enter 100 to go to main Menu" + ConsoleColors.RESET);
			Scanner sc = new Scanner(System.in);
			int mChoice = sc.nextInt();
			if(mChoice ==100 ) mainMenu();
			else {
				System.out.println(ConsoleColors.BLACK_BRIGHT + "Wrong number please Enter 100" + ConsoleColors.RESET);
				while(true) {
					if(mChoice != 100) {
						int m = sc.nextInt();
						if(m==100 ) mainMenu();
					}
				}
			}
			
		}
		
		
		//List of Criminal By Crime Type Details===================>
		
		else if (choice == 8) {

			CriminalByCrimeType.main();

			System.out.println(ConsoleColors.RED_ITALIC + "Enter 100 to go to main Menu" + ConsoleColors.RESET);
			Scanner sc = new Scanner(System.in);
			int mChoice = sc.nextInt();
			if(mChoice ==100 ) mainMenu();
			else {
				System.out.println(ConsoleColors.BLACK_BRIGHT + "Wrong number please Enter 100" + ConsoleColors.RESET);
				while(true) {
					if(mChoice != 100) {
						int m = sc.nextInt();
						if(m==100 ) mainMenu();
					}
				}
			}
			
		}
		
		//List of Criminal By Crime Month Details===================>
		
		else if (choice == 9) {

			CriminalByCrimeMonth.main();

			System.out.println(ConsoleColors.RED_ITALIC + "Enter 100 to go to main Menu" + ConsoleColors.RESET);
			Scanner sc = new Scanner(System.in);
			int mChoice = sc.nextInt();
			if(mChoice ==100 ) mainMenu();
			else {
				System.out.println(ConsoleColors.BLACK_BRIGHT + "Wrong number please Enter 100" + ConsoleColors.RESET);
				while(true) {
					if(mChoice != 100) {
						int m = sc.nextInt();
						if(m==100 ) mainMenu();
					}
				}
			}
			
		}
		
		//List of Criminal By Case Status Details===================>
		else if (choice == 10) {

			CriminalCaseStatus.main();

			System.out.println(ConsoleColors.RED_ITALIC + "Enter 100 to go to main Menu" + ConsoleColors.RESET);
			Scanner sc = new Scanner(System.in);
			int mChoice = sc.nextInt();
			if(mChoice ==100 ) mainMenu();
			else {
				System.out.println(ConsoleColors.BLACK_BRIGHT + "Wrong number please Enter 100" + ConsoleColors.RESET);
				while(true) {
					if(mChoice != 100) {
						int m = sc.nextInt();
						if(m==100 ) mainMenu();
					}
				}
			}
			
		}
		
		//List of All Details (Crime with Criminal)===================>
		else if (choice == 11) {

			ListOfFullDetails.main();

			System.out.println(ConsoleColors.RED_ITALIC + "Enter 100 to go to main Menu" + ConsoleColors.RESET);
			Scanner sc = new Scanner(System.in);
			int mChoice = sc.nextInt();
			if(mChoice ==100 ) mainMenu();
			else {
				System.out.println(ConsoleColors.BLACK_BRIGHT + "Wrong number please Enter 100" + ConsoleColors.RESET);
				while(true) {
					if(mChoice != 100) {
						int m = sc.nextInt();
						if(m==100 ) mainMenu();
					}
				}
			}
			
		}
		
		//Update Case status By Criminal Name===============================>
		else if (choice == 12) {

			UpdateCaseStatus.main();

			System.out.println(ConsoleColors.RED_ITALIC + "Enter 100 to go to main Menu" + ConsoleColors.RESET);
			Scanner sc = new Scanner(System.in);
			int mChoice = sc.nextInt();
			if(mChoice ==100 ) mainMenu();
			else {
				System.out.println(ConsoleColors.BLACK_BRIGHT + "Wrong number please Enter 100" + ConsoleColors.RESET);
				while(true) {
					if(mChoice != 100) {
						int m = sc.nextInt();
						if(m==100 ) mainMenu();
					}
				}
			}
			
		}
	}

	public static void mainMenu() throws SQLException, CrimeException {
		adminMethods();
	}


}
	

