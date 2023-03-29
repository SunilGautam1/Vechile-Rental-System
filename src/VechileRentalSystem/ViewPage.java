package VechileRentalSystem;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPage window = new ViewPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				
			}
		});
		 Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img2));
		lblNewLabel.setBounds(0, 0, 45, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Vechile Details");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(86, 27, 254, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(54, 125, 62, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Status:" +    status());
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(54, 169, 174, 34);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Vechile Description");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(56, 239, 153, 22);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   frame.setVisible(false);
			   new ConfirmBookingPage();
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(199, 531, 158, 22);
		frame.getContentPane().add(btnNewButton);
		
		
		
	
		
	}
	

	public static String status(){
	 String url= "jdbc:mysql://localhost:3306/Oursystem";
		String username = "root";
		String password = "sunil123";
		String status = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connect = DriverManager.getConnection(url,username,password);
			java.sql.Statement stmt = Connect.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT status FROM Vechile WHERE VechileNumber = 1234");
            String statusQuery = "SELECT status FROM Vechile WHERE VechileNumber = 1234";
            ResultSet resultSet = stmt.executeQuery(statusQuery);
            while (resultSet.next()) {
				  status = resultSet.getString("status");
				
			}

	    } catch (Exception e) {
	      e.printStackTrace();
	    }
		return status;
}
//	public static int getNumberOfCourse() {
//		int courseCount = 0;
//		try {
//			
//			String courseCountQuery = "SELECT count(*) as courseCount FROM course";
//			ResultSet resultSet = courseStatement.executeQuery(courseCountQuery);
//			while (resultSet.next()) {
//				 courseCount = resultSet.getInt("courseCount");
//				
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return courseCount;
//	}
	}