package VechileRentalSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class LogInPage {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInPage window = new LogInPage();
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
	public LogInPage() {
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
		panel.setBounds(0, 0, 908, 845);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Today");
		lblNewLabel.setForeground(new Color(0, 189, 189));
		lblNewLabel.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 40));
		lblNewLabel.setBounds(385, 94, 155, 63);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Rent For ");
		lblNewLabel_1.setFont(new Font("Nirmala UI", Font.BOLD, 50));
		lblNewLabel_1.setBounds(118, 90, 257, 63);
		panel.add(lblNewLabel_1);
		
		JLabel lblTommrow = new JLabel("Tomorrow\r\n");
		lblTommrow.setForeground(new Color(0, 189, 189));
		lblTommrow.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 40));
		lblTommrow.setBounds(385, 152, 205, 63);
		panel.add(lblTommrow);
		
		JLabel lblEveryday = new JLabel("Everyday\r\n");
		lblEveryday.setForeground(new Color(0, 189, 189));
		lblEveryday.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 40));
		lblEveryday.setBounds(385, 210, 194, 63);
		panel.add(lblEveryday);
		
		JLabel lblNewLabel_2 = new JLabel("");
		 Image img = new ImageIcon(this.getClass().getResource("/Screenshot_2023-03-09_at_12.16.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBounds(0, 325, 880, 457);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new LandingPage();
			}
		});
		 Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();
			lblNewLabel_4_1.setIcon(new ImageIcon(img2));
		lblNewLabel_4_1.setBounds(10, 10, 58, 32);
		panel.add(lblNewLabel_4_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(906, 0, 650, 870);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Welcome back");
		lblNewLabel_3.setFont(new Font("Nirmala UI", Font.BOLD, 40));
		lblNewLabel_3.setBounds(194, 71, 279, 41);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Number");
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 30));
		lblNewLabel_5.setBounds(134, 224, 225, 49);
		panel_1.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(134, 264, 361, 41);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5_1 = new JLabel("Password");
		lblNewLabel_5_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_5_1.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 30));
		lblNewLabel_5_1.setBounds(134, 343, 225, 49);
		panel_1.add(lblNewLabel_5_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setBounds(134, 385, 361, 41);
		panel_1.add(passwordField);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  tglbtnNewToggleButton.setVisible(false);
	                tglbtnNewToggleButton.setVisible(true);
	                passwordField.setEchoChar((char) 0);
				


		            }
		        });
		       
		        
		 
		tglbtnNewToggleButton.setBackground(new Color(192, 192, 192));
		Image img1 = new ImageIcon(this.getClass().getResource("/eye.png")).getImage();
		tglbtnNewToggleButton.setIcon(new ImageIcon(img1));
		tglbtnNewToggleButton.setBounds(494, 401, 33, 25);
		panel_1.add(tglbtnNewToggleButton);
		
		JLabel lblNewLabel_6 = new JLabel("Forget Password?");
		lblNewLabel_6.setForeground(new Color(0, 0, 0));
		lblNewLabel_6.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(329, 425, 189, 41);
		panel_1.add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Please Select", "User ", "Admin"}));
		comboBox.setBounds(250, 515, 109, 29);
		panel_1.add(comboBox);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String phoneNumber = textField.getText();
				char[] password = passwordField.getPassword();
				String passwordString = new String(password);
			    String option = comboBox.getSelectedItem().toString();
			    if(comboBox.getSelectedIndex()==1) {
				if(LoginPageDatabase.LoginPageDatabasecheck(phoneNumber, passwordString)) {
					ProfileDatabase.profiledata(phoneNumber,passwordString);
					JOptionPane.showMessageDialog(null, "Logged In Successfully as" + option, "Success", JOptionPane.INFORMATION_MESSAGE);
					frame.setVisible(false);
					new DashBoard();
					
				}else {
					JOptionPane.showMessageDialog(null, "Number and Password doesnt match", "Error", JOptionPane.ERROR_MESSAGE);
				}
			    }
				else if(comboBox.getSelectedIndex()==2) {
					if(LoginPageDatabase.LoginPageDatabaseAdmincheck(phoneNumber, passwordString)) {
						ProfileDatabase.profiledata(phoneNumber,passwordString);
						JOptionPane.showMessageDialog(null, "Logged In Successfully as " + option, "Success", JOptionPane.INFORMATION_MESSAGE);
						frame.setVisible(false);
						new DashBoard();
						
					}else {
						JOptionPane.showMessageDialog(null, "Number and Password doesnt match", "Error", JOptionPane.ERROR_MESSAGE);
					}
					
					
				}
				
				
				
				
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnNewButton.setBounds(290, 611, 95, 31);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("Donot have Account?");
		lblNewLabel_7.setForeground(new Color(0, 0, 0));
		lblNewLabel_7.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(178, 695, 207, 41);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Register");
		lblNewLabel_8.setForeground(new Color(255, 128, 0));
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new RegisterPage();
			}
		});
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(388, 695, 95, 40);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_4 = new JLabel("Mode");
		lblNewLabel_4.setFont(new Font("Nirmala UI", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(144, 515, 71, 25);
		panel_1.add(lblNewLabel_4);
		

		
		JLabel lblNewLabel_9 = new JLabel("");
		 Image img4 = new ImageIcon(this.getClass().getResource("/Untitled design (2).png")).getImage();
		 lblNewLabel_9.setIcon(new ImageIcon(img4));
		lblNewLabel_9.setBounds(10, 49, 640, 860);
		panel_1.add(lblNewLabel_9);
		
		
	
	}
}