package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Exception.CrimeException;

public class DBUtil {


		public static Connection provideConnection(){
			
			Connection conn= null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String url="jdbc:mysql://localhost:3306/crime_investigation_management_system";
			
			
			try {
				conn=DriverManager.getConnection(url, "root", "root");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
				new CrimeException("DATABASE NOT FOUND");
			}
						
			return conn;
			
		}
	

}
