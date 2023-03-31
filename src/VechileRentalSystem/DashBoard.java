package VechileRentalSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class DashBoard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard window = new DashBoard();
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
	public DashBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1610, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 10, 1540, 69);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vehicle Rental");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 25));
		lblNewLabel.setBounds(89, 5, 171, 61);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_8 = new JLabel("logout");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new LogInPage();
			}
		});
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_8.setBounds(1421, 19, 109, 32);
		panel.add(lblNewLabel_8);
		Image img9 = new ImageIcon(this.getClass().getResource("/user.png")).getImage();
		
		JLabel lblNewLabel_2 = new JLabel("Category");
		lblNewLabel_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(312, 21, 109, 29);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("My Bookings");
		lblNewLabel_2_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1.setBounds(569, 21, 150, 29);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Vehicle");
		lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(true);
				new Vechile();
			}
		});
		lblNewLabel_2_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1.setBounds(450, 21, 109, 29);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("Profile");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new ProfileSetting();
			}
		});
		lblNewLabel_6.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 22));
		lblNewLabel_6.setBounds(1295, 22, 84, 29);
		panel.add(lblNewLabel_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(173, 216, 230));
		panel_1.setBounds(0, 80, 1540, 765);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("All Catagories");
		lblNewLabel_1.setFont(new Font("Nirmala UI", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(706, 22, 220, 37);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 248, 255));
		panel_2.setForeground(new Color(158, 158, 158));
		panel_2.setBounds(103, 233, 356, 283);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setBounds(0, 10, 356, 251);
		panel_2.add(lblNewLabel_3_1);
		
		Image img = new ImageIcon(this.getClass().getResource("/Bike.jpeg")).getImage();
		lblNewLabel_3_1.setIcon(new ImageIcon(img));
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(240, 248, 255));
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(591, 233, 356, 283);
		panel_1.add(panel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/Cycle.jpeg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img1));
		
		lblNewLabel_3.setBounds(0, 23, 356, 231);
		panel_2_1.add(lblNewLabel_3);
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Cycle();
			}
		});
		
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(240, 248, 255));
		panel_2_2.setLayout(null);
		panel_2_2.setBounds(1068, 233, 356, 283);
		panel_1.add(panel_2_2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Car();
			}
		});
		Image img3 = new ImageIcon(this.getClass().getResource("/car.jpeg")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img3));
		
		lblNewLabel_5.setBounds(0, 22, 356, 229);
		panel_2_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_2 = new JLabel("                  Car");
		lblNewLabel_4_2.setBounds(1088, 525, 336, 31);
		panel_1.add(lblNewLabel_4_2);
		lblNewLabel_4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Car();
			}
		});
		lblNewLabel_4_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblNewLabel_4_1 = new JLabel("                 Cycle");
		lblNewLabel_4_1.setBounds(601, 524, 356, 32);
		panel_1.add(lblNewLabel_4_1);
		lblNewLabel_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Cycle();
			}
		});
		lblNewLabel_4_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblNewLabel_4 = new JLabel("                 Bikes");
		lblNewLabel_4.setBounds(103, 524, 356, 32);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.setBackground(new Color(244, 164, 96));
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Bike();
			}
		});
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
	
	}
}
