package VechileRentalSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




public class ProfileDatabase {
  static String Phonenumber;
static String Secondname;
 static String Username;
 static String Email;

public static void profiledata(String phonenumber,String Password){
<<<<<<< HEAD
// profile database connection 
	 String url= "jdbc:mysql://localhost:3306/Oursystem";
=======
	 String url= "jdbc:mysql://localhost:3306/Oursystem"; // connect to the databse
>>>>>>> origin/main
		String username = "root";
		String password = "sunil123";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connect = DriverManager.getConnection(url,username,password); // connected to Drivermanager
	 
		 
	      PreparedStatement stmt = Connect.prepareStatement("SELECT Phone_Number, Full_Name,Username, email, password FROM UserDetails WHERE Phone_Number = ?");
	      stmt.setString(1, phonenumber);
	      ResultSet rs = stmt.executeQuery();

	      // Compare the password provided by the user with the one retrieved from the database
	      if (rs.next()) {
	        String passwordFromDb = rs.getString("password");
	        if (Password.equals(passwordFromDb)) {
	          // If the passwords match, return the other data
	          Phonenumber = rs.getString("Phone_Number");
	           Secondname = rs.getString("Full_Name");
	           Username = rs.getString("Username");
	           Email = rs.getString("Email");
	           
	           System.out.println(Phonenumber);
	          
	          
	          
			    
			    
			
				
			    } 
	    
	      
	      }
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
}

}