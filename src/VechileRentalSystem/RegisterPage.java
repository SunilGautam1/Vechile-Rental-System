package VechileRentalSystem;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;

public class RegisterPage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	static String phonenumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage window = new RegisterPage();
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
	public RegisterPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1610, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 216, 230));
		panel.setBounds(10, 10, 1576, 859);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
			
			JPanel panel_1 = new JPanel();
			panel_1.setForeground(new Color(255, 0, 0));
			panel_1.setBounds(917, 0, 659, 859);
			panel.add(panel_1);
			panel_1.setBackground(new Color(255, 255, 255));
			panel_1.setLayout(null);
		
			
			JLabel lblNewLabel_4 = new JLabel("Please Enter Your details");
			lblNewLabel_4.setBounds(209, 63, 326, 31);
			lblNewLabel_4.setFont(new Font("Nirmala UI", Font.BOLD, 25));
			panel_1.add(lblNewLabel_4);
			
			JLabel lblNewLabel_2 = new JLabel("Full Name");
			lblNewLabel_2.setForeground(new Color(0, 0, 0));
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel_2.setBounds(166, 177, 200, 31);
			panel_1.add(lblNewLabel_2);
			
			textField_1 = new JTextField();
			textField_1.setBounds(166, 206, 243, 31);
			panel_1.add(textField_1);
			textField_1.setColumns(10);
			
			JLabel lblNewLabel_2_1 = new JLabel("Email");
			lblNewLabel_2_1.setForeground(new Color(0, 0, 0));
			lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel_2_1.setBounds(166, 247, 200, 31);
			panel_1.add(lblNewLabel_2_1);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(166, 276, 243, 31);
			panel_1.add(textField_2);
			
			JLabel lblNewLabel_2_1_1 = new JLabel("Password");
			lblNewLabel_2_1_1.setForeground(new Color(0, 0, 0));
			lblNewLabel_2_1_1.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
			lblNewLabel_2_1_1.setBounds(166, 403, 200, 31);
			panel_1.add(lblNewLabel_2_1_1);
			
			JLabel lblNewLabel_2_1_1_1 = new JLabel("Confrim Password");
			lblNewLabel_2_1_1_1.setForeground(new Color(0, 0, 0));
			lblNewLabel_2_1_1_1.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
			lblNewLabel_2_1_1_1.setBounds(166, 488, 200, 31);
			panel_1.add(lblNewLabel_2_1_1_1);
			
			JButton btnRegister = new JButton("Register");
			btnRegister.addActionListener(new ActionListener() {
				

				public void actionPerformed(ActionEvent e) {
					 phonenumber = textField.getText();
					String fullname = textField_1.getText();
					String Email = textField_2.getText();
					char[] password = passwordField.getPassword();
					char[] confrimpassword = passwordField_1.getPassword();
					String passwordString = new String(password);
					String ConfirmPasswordString = new String(confrimpassword);
					 if (!RegistrationValidation.validateName(fullname)) {
					     JOptionPane.showMessageDialog(null, "Invalid  Name!!!!", "Error", JOptionPane.ERROR_MESSAGE);
					  
					  }
					  else if (!RegistrationValidation.validateEmail(Email)) {
					     JOptionPane.showMessageDialog(null, "Invalid Email", "Error", JOptionPane.ERROR_MESSAGE);
					  } else if  (!RegistrationValidation.validatePhoneNumber(phonenumber)) {
						     JOptionPane.showMessageDialog(null, "Invalid Number", "Error", JOptionPane.ERROR_MESSAGE);
					  }
					  else if (!RegistrationValidation.validatePassword(passwordString)) {
					  
					     JOptionPane.showMessageDialog(null, "Invalid Password", "Error", JOptionPane.ERROR_MESSAGE);
					  }
					  else if (!RegistrationValidation.validateConfirmPassword(ConfirmPasswordString, ConfirmPasswordString)) {
					     JOptionPane.showMessageDialog(null, "Password and Confirm Password do not match", "Error", JOptionPane.ERROR_MESSAGE);
					  } else {
						  
					     JOptionPane.showMessageDialog(null, "Form Submitted Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
					     frame.setVisible(false);
						  new RegistrationQuestion();
                         
					  }	
						if(RegistrationValidation.validateName(fullname) && RegistrationValidation.validateEmail(Email) && 
						RegistrationValidation.validatePassword(passwordString) && RegistrationValidation.validateConfirmPassword(ConfirmPasswordString, ConfirmPasswordString)) {
							       
							  RegisterDatabase.RegisterDatabaseConnection(phonenumber, fullname, Email, passwordString);
							
							
							
							    
							
						}
					
					
								
					
					
				
				
				}
			});
			btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnRegister.setForeground(new Color(0, 0, 0));
			btnRegister.setBackground(Color.WHITE);
			btnRegister.setBounds(244, 595, 122, 29);
			panel_1.add(btnRegister);
			
			passwordField = new JPasswordField();
			passwordField.setBounds(166, 432, 243, 31);
			panel_1.add(passwordField);
			
			passwordField_1 = new JPasswordField();
			passwordField_1.setBounds(166, 516, 251, 31);
			panel_1.add(passwordField_1);
			
			textField = new JTextField();
			textField.setBounds(166, 358, 243, 35);
			panel_1.add(textField);
			textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("Phone number");
			lblNewLabel_1.setBounds(166, 327, 168, 29);
			panel_1.add(lblNewLabel_1);
			lblNewLabel_1.setForeground(new Color(64, 0, 0));
			lblNewLabel_1.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
			
			JLabel lblNewLabel_6 = new JLabel("Already Have Account?");
			lblNewLabel_6.setBounds(135, 679, 225, 35);
			panel_1.add(lblNewLabel_6);
			lblNewLabel_6.setForeground(new Color(0, 0, 0));
			lblNewLabel_6.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
			
			JLabel lblNewLabel_7 = new JLabel("Log in");
			lblNewLabel_7.setBounds(374, 680, 100, 32);
			panel_1.add(lblNewLabel_7);
			lblNewLabel_7.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					frame.setVisible(false);
					new LogInPage();
				}
			});
			lblNewLabel_7.setForeground(new Color(0, 0, 0));
			lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
			
			JLabel lblNewLabel_5 = new JLabel("Password Must Contain Upper Case letter , number and special Letter, Minimum 4 Letter");
			lblNewLabel_5.setForeground(new Color(255, 0, 0));
			lblNewLabel_5.setBackground(new Color(255, 0, 0));
			lblNewLabel_5.setBounds(77, 466, 514, 23);
			panel_1.add(lblNewLabel_5);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setFont(new Font("Nirmala UI", Font.BOLD, 30));
			lblNewLabel.setBounds(0, 0, 890, 831);
			panel.add(lblNewLabel);
			
			JLabel lblNewLabel_3 = new JLabel("About Us");
			lblNewLabel_3.setFont(new Font("Nirmala UI", Font.BOLD, 30));
			lblNewLabel_3.setBounds(51, 146, 158, 63);
			panel.add(lblNewLabel_3);
			
			JTextPane txtpnLoremIpsumDolor = new JTextPane();
			txtpnLoremIpsumDolor.setBackground(new Color(173, 216, 230));
			txtpnLoremIpsumDolor.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
			txtpnLoremIpsumDolor.setText("This vehicle rental system facilitates and provides a\r\n"
					+ "service to the people willing to rent vehicles for their purpose. People will\r\n"
					+ "be able to rent different vehicles such as cars, bikes, cycles etc. The system\r\n"
					+ "will address various business needs such as improving the customer experience\r\n"
					+ "by providing an easy online platform for booking and renting vehicles,\r\n"
					+ "increasing efficiency by automating rental processes, enhancing fleet management\r\n"
					+ "by enabling tracking and optimization of vehicle usage, and increasing revenue\r\n"
					+ "by offering a wider range of vehicles and rental options..");
			txtpnLoremIpsumDolor.setBounds(51, 234, 736, 580);
			panel.add(txtpnLoremIpsumDolor);
			Image img = new ImageIcon(this.getClass().getResource("/Screenshot_2023-03-09_at_12.16.png")).getImage();
	}
}