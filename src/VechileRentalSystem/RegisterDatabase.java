package VechileRentalSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDatabase {
	public static void RegisterDatabaseConnection(String PhoneNumber, String FullName, String Email, String Password) {

		String url= "jdbc:mysql://localhost:3306/Oursystem";
		String username = "root";
		String password = "sunil123";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connect = DriverManager.getConnection(url,username,password);

			
			String queryString2 ="INSERT INTO Userdetails(Phone_Number, Full_name,Email,Password)VALUES(?,?,?,?)";
	           
	           
            //Statement statement = connect.createStatement();
            PreparedStatement statement1 = Connect.prepareStatement(queryString2);
            
            statement1.setString(1, PhoneNumber);
			statement1.setString(2, FullName );
			statement1.setString(3, Email);
			statement1.setString(4, Password);
			
			
			  statement1.executeUpdate();
	          System.out.println("Inserted!!!!");
	          statement1.close();
	          Connect.close();
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} 
	}

}
