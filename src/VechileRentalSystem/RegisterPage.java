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

public class RegisterPage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

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
		panel.setBounds(0, 0, 1540, 845);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register Your Number");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(131, 0, 479, 64);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Phone number");
		lblNewLabel_1.setForeground(new Color(64, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(334, 177, 168, 29);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(299, 204, 296, 35);
		panel.add(textField);
		textField.setColumns(10);
		
		
		
			
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(890, 0, 650, 870);
			panel.add(panel_1);
			panel_1.setBackground(new Color(128, 255, 128));
			panel_1.setLayout(null);
			panel_1.setVisible(false);

			JButton btnNewButton = new JButton("Confirm");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String phonenumber = textField.getText();
					if(RegistrationValidation.validateName(phonenumber)) {
						JOptionPane.showMessageDialog(null, "Invalid  Number!!!!", "Error", JOptionPane.ERROR_MESSAGE);
						
					}
					else {
						  panel_1.setVisible(true);
					}
						
					    
					  
			
					
					
						
					
					
				
				}
			});
			btnNewButton.setBackground(new Color(255, 255, 255));
			btnNewButton.setBounds(377, 284, 122, 29);
			panel.add(btnNewButton);
			
			JLabel lblNewLabel_4 = new JLabel("Please Enter Your details");
			lblNewLabel_4.setBounds(153, 89, 287, 31);
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
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
			lblNewLabel_2_1.setBounds(166, 278, 200, 31);
			panel_1.add(lblNewLabel_2_1);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(166, 305, 243, 31);
			panel_1.add(textField_2);
			
			JLabel lblNewLabel_2_1_1 = new JLabel("Password");
			lblNewLabel_2_1_1.setForeground(new Color(0, 0, 0));
			lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel_2_1_1.setBounds(166, 375, 200, 31);
			panel_1.add(lblNewLabel_2_1_1);
			
			JLabel lblNewLabel_2_1_1_1 = new JLabel("Confrim Password");
			lblNewLabel_2_1_1_1.setForeground(new Color(0, 0, 0));
			lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel_2_1_1_1.setBounds(166, 473, 200, 31);
			panel_1.add(lblNewLabel_2_1_1_1);
			
			JButton btnRegister = new JButton("Register");
			btnRegister.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String phonenumber = textField.getText();
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
					  } else if (!RegistrationValidation.validatePassword(passwordString)) {
					     JOptionPane.showMessageDialog(null, "Invalid Password", "Error", JOptionPane.ERROR_MESSAGE);
					  } else if (!RegistrationValidation.validateConfirmPassword(ConfirmPasswordString, ConfirmPasswordString)) {
					     JOptionPane.showMessageDialog(null, "Password and Confirm Password do not match", "Error", JOptionPane.ERROR_MESSAGE);
					  } else {
						  
					     JOptionPane.showMessageDialog(null, "Form Submitted Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
					        
                         
					  }	
						if(RegistrationValidation.validateName(fullname) && RegistrationValidation.validateEmail(Email) && 
						RegistrationValidation.validatePassword(passwordString) && RegistrationValidation.validateConfirmPassword(ConfirmPasswordString, ConfirmPasswordString)) {
							       
							  RegisterDatabase.RegisterDatabaseConnection(phonenumber, fullname, Email, passwordString);
							
							
							
							     frame.setVisible(false);
								  new LogInPage();
							
						}
					
					
								
					
					
				
				
				}
			});
			btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnRegister.setForeground(new Color(0, 0, 0));
			btnRegister.setBackground(Color.WHITE);
			btnRegister.setBounds(244, 598, 122, 29);
			panel_1.add(btnRegister);
			
			passwordField = new JPasswordField();
			passwordField.setBounds(166, 406, 243, 31);
			panel_1.add(passwordField);
			
			passwordField_1 = new JPasswordField();
			passwordField_1.setBounds(166, 499, 251, 31);
			panel_1.add(passwordField_1);
			
			JLabel lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.setBackground(new Color(128, 255, 128));
			lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\gauta\\OneDrive\\Desktop\\Untitled design (1).png"));
			lblNewLabel_5.setBounds(0, 0, 650, 844);
			panel_1.add(lblNewLabel_5);
			
			JLabel lblNewLabel_6 = new JLabel("Already Have Account?");
			lblNewLabel_6.setForeground(new Color(0, 0, 0));
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel_6.setBounds(267, 378, 225, 35);
			panel.add(lblNewLabel_6);
			
			JLabel lblNewLabel_7 = new JLabel("Log in");
			lblNewLabel_7.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					frame.setVisible(false);
					new LogInPage();
				}
			});
			lblNewLabel_7.setForeground(new Color(0, 0, 0));
			lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel_7.setBounds(484, 379, 100, 32);
			panel.add(lblNewLabel_7);
			
			JLabel lblNewLabel_3 = new JLabel("");
			
			lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\gauta\\OneDrive\\Desktop\\Untitled design.png"));
			lblNewLabel_3.setBounds(0, 0, 1554, 845);
			panel.add(lblNewLabel_3);
			Image img = new ImageIcon(this.getClass().getResource("/Screenshot_2023-03-09_at_12.16.png")).getImage();
	}
}
