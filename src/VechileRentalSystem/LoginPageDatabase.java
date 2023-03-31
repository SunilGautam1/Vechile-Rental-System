package VechileRentalSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginPageDatabase {
	
	public static boolean LoginPageDatabasecheck(String Phonenumber, String Password) {

		String url= "jdbc:mysql://localhost:3306/Oursystem";
		String username = "root";
		String password = "sunil123";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connect = DriverManager.getConnection(url,username,password);
			
			Statement statement = Connect.createStatement();
			String sql = "Select * from Userdetails where Phone_Number='"+Phonenumber+"'and password='"+Password+"'";
			ResultSet rs = statement.executeQuery(sql);
			if(rs.next()) {
				return true;
			
			}		
			 statement.close();
	          Connect.close();
	}catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
		return false; 
	}
	

	public static boolean LoginPageDatabaseAdmincheck(String Phonenumber, String Password) {

		String url= "jdbc:mysql://localhost:3306/Oursystem";
		String username = "root";
		String password = "sunil123";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connect = DriverManager.getConnection(url,username,password);
			
			Statement statement = Connect.createStatement();
			String sql = "Select * from Admindetails where Phone_Number='"+Phonenumber+"'and password='"+Password+"'";
			ResultSet rs = statement.executeQuery(sql);
			if(rs.next()) {
				return true;
			
			}		
			 statement.close();
	          Connect.close();
	}catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
		return false; 
	}
	
	
	

}
