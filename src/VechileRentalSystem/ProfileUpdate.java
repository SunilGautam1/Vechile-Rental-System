package VechileRentalSystem;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.Color;

public class ProfileUpdate {

	private static String Secondname;
	private static String Email;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileUpdate window = new ProfileUpdate();
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
	public ProfileUpdate() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		frame.setBounds(100, 00, 1358, 778);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		
		
		JLabel lblNewLabel = new JLabel("View Profile");
		lblNewLabel.setFont(new Font("Nirmala UI", Font.PLAIN, 30));
		lblNewLabel.setBounds(566, 84, 229, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				
			}
		});
		Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();
		lblNewLabel_11.setIcon(new ImageIcon(img2));
		lblNewLabel_11.setBounds(10, 10, 49, 32);
		frame.getContentPane().add(lblNewLabel_11);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 0, 1540, 69);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("Vehicle Rental");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 25));
		lblNewLabel_2.setBounds(89, 5, 171, 61);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_8 = new JLabel("logout");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_8.setBounds(1421, 19, 109, 32);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(1330, 5, 64, 61);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Category");
		lblNewLabel_2_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1.setBounds(312, 21, 109, 29);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("My Bookings");
		lblNewLabel_2_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1.setBounds(569, 21, 150, 29);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Vehicle");
		lblNewLabel_2_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1.setBounds(450, 21, 109, 29);
		panel.add(lblNewLabel_2_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(256, 199, 772, 463);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(10, 10, 96, 55);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		
		JLabel lblNewLabel_1_1 = new JLabel("Username");
		lblNewLabel_1_1.setBounds(10, 95, 156, 55);
		panel_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		
		JLabel lblNewLabel_1_2 = new JLabel("Email");
		lblNewLabel_1_2.setBounds(10, 203, 96, 43);
		panel_1.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		
		JLabel lblNewLabel_1_3 = new JLabel("PhoneNumber");
		lblNewLabel_1_3.setBounds(10, 309, 229, 55);
		panel_1.add(lblNewLabel_1_3);
		lblNewLabel_1_3.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		
		textField = new JTextField();
		textField.setBounds(240, 25, 276, 43);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(240, 110, 276, 43);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(240, 212, 276, 43);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(240, 321, 276, 43);
		panel_1.add(textField_3);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(584, 670, 129, 43);
		frame.getContentPane().add(btnNewButton);
		
		
//		// retrieve data based on phone number
//		String url= "jdbc:mysql://localhost:3306/Oursystem";  // connect to database
//		String username1 = "root";
//		String password = "sunil123";
//		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");  
//		Connection Connect = DriverManager.getConnection(url,username1,password);
//		String query = "SELECT * FROM UserDetails WHERE Phone_Number = ?";
//		PreparedStatement statement = Connect.prepareStatement(query);
//		statement.setString(1, ProfileDatabase.Phonenumber);
//		ResultSet resultSet = statement.executeQuery();
//
//		// set retrieved data as text field values
//		if(resultSet.next()) {
//		    String name = resultSet.getString("Full_name");
//		    String username = resultSet.getString("Username");
//		    String email = resultSet.getString("Email");
//		    String phoneNumber = resultSet.getString("Phone_Number");
//		    textField.setText(name);
//		    textField_1.setText(username);
//		    textField_2.setText(email);
//		    textField_3.setText(phoneNumber);
//		}
//		 } catch (SQLException f) {
//	            f.printStackTrace();
//	        } catch (ClassNotFoundException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}

		

		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Fullname = textField.getText();
				String Username = textField_1.getText();
				String Email = textField_2.getText();
				String Phone = textField_3.getText();
				

				String url= "jdbc:mysql://localhost:3306/Oursystem";  // connecting to database
				String username = "root";
				String password = "sunil123";
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");  
					Connection Connect = DriverManager.getConnection(url,username,password); //connection to Drivermanager
			 
				 
					 String query = "UPDATE UserDetails SET Full_Name = ?, Username = ?, Email = ?, Phone_Number = ? WHERE Phone_Number = ?";
			            PreparedStatement statement = Connect.prepareStatement(query);
			            statement.setString(1, Fullname);
			            statement.setString(2, Username);
			            statement.setString(3, Email);
			            statement.setString(4, Phone);
			            
			            statement.setString(5, ProfileDatabase.Phonenumber);
			            
			            int rowsUpdated = statement.executeUpdate();
			            System.out.println(rowsUpdated + " rows updated.");
			            JOptionPane.showMessageDialog(null, "Updated", "Sucess", JOptionPane.INFORMATION_MESSAGE);
			            
			            Connect.close();
			        } catch (SQLException f) {
			            f.printStackTrace();
			        } catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			         

			    
			}
		});
		
	}
	

	
	
	
}
