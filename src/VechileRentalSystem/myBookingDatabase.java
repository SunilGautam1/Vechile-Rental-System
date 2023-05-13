package VechileRentalSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class myBookingDatabase {
	static String ID;
	static String textarea;
	static String vechilename;
	static String vechile_ID;
	static String Time;

	public static void notification() {
		String url= "jdbc:mysql://localhost:3306/Oursystem";
	    String username = "root";
	    String password = "sunil123";
	    
	    try {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	Connection Connect = DriverManager.getConnection(url,username,password);
	        
	        PreparedStatement stmt = Connect.prepareStatement("SELECT ID, textarea, vechilename, vechile_ID, Time from notification WHERE ID = ?");
	        stmt.setString(1, ProfileDatabase.Secondname);
	        ResultSet rs = stmt.executeQuery();
                        if( rs.next()) {
	            	   ID= rs.getString("ID");
	            	   textarea= rs.getString("textarea");
	            	   vechilename= rs.getString("vechilename");
	            	   vechile_ID= rs.getString("vechile_ID");
	            	   Time= rs.getString("Time");	   
	               }
	               System.out.println(textarea);
	               rs.close();
	               stmt.close();
	               Connect.close();
	               }catch (ClassNotFoundException e) {

System.out.println(e);
}catch (SQLException e) {
// TODO Auto-generated catch block
System.out.println(e);
}
	}
}


