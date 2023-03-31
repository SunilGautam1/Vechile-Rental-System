package VechileRentalSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLayeredPane;

public class LandingPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LandingPage window = new LandingPage();
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
	public LandingPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		frame.setBounds(0, 0, 1605, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 1591, 859);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
	   Image img = new ImageIcon(this.getClass().getResource("/Screenshot_2023-03-09_at_12.16.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(566, 336, 945, 378);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Vehicle for you");
		lblNewLabel_1.setFont(new Font("Nirmala UI", Font.BOLD, 58));
		lblNewLabel_1.setBounds(134, 276, 487, 100);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Find the Perfect");
		lblNewLabel_1_1.setFont(new Font("Nirmala UI", Font.BOLD, 58));
		lblNewLabel_1_1.setBounds(100, 206, 487, 100);
		panel.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("Find your Vehicle");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new GuestDashboard();
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\COLLEGE\\Sem 4\\Collaborative Development\\project\\New folder\\magnifying-glass.png"));
		btnNewButton_1.setBounds(new Rectangle(0, 0, 0, 6));
		btnNewButton_1.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(255, 165, 0));
		btnNewButton_1.setBounds(37, 707, 266, 51);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rent Vehicles");
		lblNewLabel_2.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblNewLabel_2.setBounds(353, 717, 147, 31);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("guaranteed quality.");
		lblNewLabel_3.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(134, 439, 529, 60);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Every car unit at [Page Name] is ");  
		lblNewLabel_3_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 30));
		lblNewLabel_3_1.setBounds(115, 386, 528, 74);
		panel.add(lblNewLabel_3_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(173, 216, 230));
		panel_1.setBounds(0, 0, 1591, 100);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Log in");
		lblNewLabel_2_1.setBounds(1311, 33, 93, 31);
		panel_1.add(lblNewLabel_2_1);
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new LogInPage();
			}
		});
		lblNewLabel_2_1.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setBounds(1414, 32, 113, 37);
		panel_1.add(btnNewButton);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new RegisterPage();
			}
		});
		btnNewButton.setBackground(new Color(255, 165, 0));
		btnNewButton.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 17));
		Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();
	}
}