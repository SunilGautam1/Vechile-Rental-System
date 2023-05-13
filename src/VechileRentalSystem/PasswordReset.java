package VechileRentalSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JButton;

public class PasswordReset {

	private JFrame frame;
	private JTextField newPasswordField;
	private JTextField confirmNewPasswordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasswordReset window = new PasswordReset();
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
	public PasswordReset() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setBounds(300, 100, 986, 662);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(90, 115, 754, 424);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Password");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(182, 35, 352, 72);
		panel.add(lblNewLabel);
		
		newPasswordField = new JPasswordField();
		newPasswordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		newPasswordField.setBounds(182, 96, 328, 39);
		panel.add(newPasswordField);
		newPasswordField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Confirm Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(182, 179, 352, 62);
		panel.add(lblNewLabel_1);
		
		
		confirmNewPasswordField = new JPasswordField();
		confirmNewPasswordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		confirmNewPasswordField.setColumns(10);
		confirmNewPasswordField.setBounds(182, 236, 328, 39);
		panel.add(confirmNewPasswordField);
		
		JButton btnNewButton = new JButton("Continue");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(268, 355, 176, 39);
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String newPassword = new String(((JPasswordField) newPasswordField).getPassword());
		        String confirmNewPassword = new String(((JPasswordField) confirmNewPasswordField).getPassword());
		        if (newPassword.equals(confirmNewPassword)) {
		            // update the password in the database
		        	 JOptionPane.showMessageDialog(frame, "passwordChanged!!");
		            updatePasswordInDatabase(newPassword);
		            frame.dispose();
		        } else {
		            JOptionPane.showMessageDialog(frame, "Passwords do not match. Please try again.");
		        }
		    }
		});

		panel.add(btnNewButton);
		
		
	
	}
	
	private void updatePasswordInDatabase(String newPassword) {
	    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/OurSystem", "root", "sunil123");
	         PreparedStatement stmt = conn.prepareStatement("UPDATE userdetails SET password = ? WHERE Phone_Number = ?")) {
	         
	        // Replace "username" with the actual username of the user whose password is being updated
	        stmt.setString(1, newPassword);
	        stmt.setString(2, forgetpassword.Number);
	        
	        int rowsUpdated = stmt.executeUpdate();
	        
	        if (rowsUpdated > 0) {
	            System.out.println("Password updated successfully!");
	        } else {
	            System.out.println("Failed to update password.");
	        }
	        
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }
	}

}