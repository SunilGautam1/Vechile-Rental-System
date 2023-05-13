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
		panel.setBounds(0, 0, 1540, 859);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
	   Image img = new ImageIcon(this.getClass().getResource("/Screenshot_2023-03-09_at_12.16.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(587, 334, 945, 378);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Vehicle for you");
		lblNewLabel_1.setFont(new Font("Nirmala UI", Font.BOLD, 58));
		lblNewLabel_1.setBounds(134, 276, 487, 100);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Find the Perfect");
		lblNewLabel_1_1.setFont(new Font("Nirmala UI", Font.BOLD, 58));
		lblNewLabel_1_1.setBounds(100, 206, 487, 100);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rent Vehicles");
		lblNewLabel_2.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		lblNewLabel_2.setBounds(364, 691, 181, 41);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("guaranteed quality.");
		lblNewLabel_3.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(134, 439, 529, 60);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Every car unit at [Page Name] is ");  
		lblNewLabel_3_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 30));
		lblNewLabel_3_1.setBounds(115, 386, 528, 74);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new GuestDashBoard();
			}
		});
		   Image Button = new ImageIcon(this.getClass().getResource("/button.png")).getImage();

		
		lblNewLabel_4.setIcon(new ImageIcon(Button));
		lblNewLabel_4.setBounds(51, 671, 323, 87);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("Log in");
		lblNewLabel_2_1.setBounds(1378, 36, 105, 41);
		panel.add(lblNewLabel_2_1);
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new LogInPage();
			}
		});
		lblNewLabel_2_1.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new RegisterPage();
			}
		});
		   Image Sign = new ImageIcon(this.getClass().getResource("/Sign in.png")).getImage();

		
		lblNewLabel_5.setIcon(new ImageIcon(Sign));
		lblNewLabel_5.setBounds(1240, 23, 128, 74);
		panel.add(lblNewLabel_5);
	}
}