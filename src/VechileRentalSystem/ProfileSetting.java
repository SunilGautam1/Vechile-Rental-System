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
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.Color;

public class ProfileSetting {

	private JFrame frame;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileSetting window = new ProfileSetting();
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
	public ProfileSetting() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(173, 216, 230));
		frame.setBounds(100, 00, 1358, 778);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("View Profile");
		lblNewLabel.setFont(new Font("Nirmala UI", Font.PLAIN, 30));
		lblNewLabel.setBounds(566, 84, 229, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Nirmala UI", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(290, 225, 96, 55);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Username");
		lblNewLabel_1_1.setFont(new Font("Nirmala UI", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(290, 305, 156, 55);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email");
		lblNewLabel_1_2.setFont(new Font("Nirmala UI", Font.PLAIN, 30));
		lblNewLabel_1_2.setBounds(290, 396, 96, 43);
		frame.getContentPane().add(lblNewLabel_1_2);
		
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
		
		JLabel lblNewLabel_1_3 = new JLabel("PhoneNumber");
		lblNewLabel_1_3.setFont(new Font("Nirmala UI", Font.PLAIN, 30));
		lblNewLabel_1_3.setBounds(290, 464, 229, 55);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(554, 305, 216, 46);
		frame.getContentPane().add(textField_1);
		textField_1.setText(ProfileDatabase.Username);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Fullname = textField_1.getText();
				String url= "jdbc:mysql://localhost:3306/Oursystem";  // connect to database
				String username = "root";
				String password = "sunil123";
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");  
					Connection Connect = DriverManager.getConnection(url,username,password); //connection to Drivermanager
			 
				 
					 String query = "UPDATE UserDetails SET Username = ? WHERE Phone_Number = ?";
			            PreparedStatement statement = Connect.prepareStatement(query);
			            statement.setString(1, Fullname);
			            statement.setString(2, ProfileDatabase.Phonenumber);
			            
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
		btnNewButton.setBounds(689, 361, 65, 33);
		frame.getContentPane().add(btnNewButton);
		
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
		
		JLabel lblNewLabel_1_4 = new JLabel(ProfileDatabase.Secondname);
		lblNewLabel_1_4.setFont(new Font("Nirmala UI", Font.PLAIN, 30));
		lblNewLabel_1_4.setBounds(554, 225, 241, 55);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel(ProfileDatabase.Email );
		lblNewLabel_1_5.setFont(new Font("Nirmala UI", Font.PLAIN, 30));
		lblNewLabel_1_5.setBounds(554, 396, 420, 55);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_3_1 = new JLabel(ProfileDatabase.Phonenumber);
		lblNewLabel_1_3_1.setFont(new Font("Nirmala UI", Font.PLAIN, 30));
		lblNewLabel_1_3_1.setBounds(554, 464, 367, 55);
		frame.getContentPane().add(lblNewLabel_1_3_1);
	}
}