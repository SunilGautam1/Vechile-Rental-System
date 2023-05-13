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

public class ProfileSetting {

	private static String Secondname;
	private static String Email;
	private JFrame frame;

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
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		frame.setBounds(100, 00, 1358, 778);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		
		
		JLabel lblNewLabel = new JLabel("View Profile");
		lblNewLabel.setFont(new Font("Nirmala UI", Font.PLAIN, 30));
		lblNewLabel.setBounds(527, 79, 229, 55);
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
		panel_1.setBounds(258, 205, 772, 463);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(10, 10, 96, 55);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		
		JLabel lblNewLabel_1_4 = new JLabel(ProfileDatabase.Secondname);
		lblNewLabel_1_4.setBounds(278, 10, 267, 55);
		panel_1.add(lblNewLabel_1_4);
		lblNewLabel_1_4.setFont(new Font("Nirmala UI", Font.PLAIN, 30));
		
		JLabel lblNewLabel_1_1 = new JLabel("Username");
		lblNewLabel_1_1.setBounds(10, 95, 156, 55);
		panel_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		
		JLabel lblNewLabel_1_2 = new JLabel("Email");
		lblNewLabel_1_2.setBounds(10, 191, 96, 43);
		panel_1.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		
		JLabel lblNewLabel_1_5 = new JLabel(ProfileDatabase.Email );
		lblNewLabel_1_5.setBounds(274, 191, 420, 55);
		panel_1.add(lblNewLabel_1_5);
		lblNewLabel_1_5.setFont(new Font("Nirmala UI", Font.PLAIN, 30));
		
		JLabel lblNewLabel_1_3 = new JLabel("PhoneNumber");
		lblNewLabel_1_3.setBounds(10, 296, 229, 55);
		panel_1.add(lblNewLabel_1_3);
		lblNewLabel_1_3.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		
		JLabel lblNewLabel_1_3_1 = new JLabel(ProfileDatabase.Phonenumber);
		lblNewLabel_1_3_1.setBounds(277, 296, 367, 55);
		panel_1.add(lblNewLabel_1_3_1);
		lblNewLabel_1_3_1.setFont(new Font("Nirmala UI", Font.PLAIN, 30));
		
		JLabel lblNewLabel_1_4_1 = new JLabel((String) null);
		lblNewLabel_1_4_1.setFont(new Font("Nirmala UI", Font.PLAIN, 30));
		lblNewLabel_1_4_1.setBounds(278, 95, 282, 55);
		panel_1.add(lblNewLabel_1_4_1);
		
		JButton btnNewButton = new JButton("Edit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new ProfileUpdate();
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(583, 678, 116, 40);
		frame.getContentPane().add(btnNewButton);
		
	}
	

	
	
	
}