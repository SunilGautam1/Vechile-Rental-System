package VechileRentalSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InsideBike1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsideBike1 frame = new InsideBike1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InsideBike1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1361, 774);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1347, 737);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(0, 0, 1586, 89);
		panel.add(panel_5);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(10, 32, 49, 32);
		panel_5.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Vehicle Rental");
		lblNewLabel_4_1.setForeground(Color.BLACK);
		lblNewLabel_4_1.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 25));
		lblNewLabel_4_1.setBounds(67, 16, 171, 61);
		panel_5.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Category");
		lblNewLabel_2_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_2.setBounds(275, 32, 109, 29);
		panel_5.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Vehicle");
		lblNewLabel_2_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1.setBounds(414, 32, 109, 29);
		panel_5.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("My Bookings");
		lblNewLabel_2_1_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_2.setBounds(530, 32, 150, 29);
		panel_5.add(lblNewLabel_2_1_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(173, 216, 230));
		panel_2.setBounds(0, 88, 1347, 649);
		panel.add(panel_2);
		
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setBounds(10, 19, 45, 43);
		Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();
		panel_5.add(lblNewLabel1);
		lblNewLabel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Bike();
				
				
			}
		});
		lblNewLabel1.setIcon(new ImageIcon(img2));
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(166, 103, 1035, 490);
		panel_2.add(panel_3);
		
		JLabel lblNewLabel_6 = new JLabel("Description");
		lblNewLabel_6.setFont(new Font("Nirmala UI", Font.BOLD, 25));
		lblNewLabel_6.setBounds(586, 104, 159, 50);
		panel_3.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ConfirmBookingPage();
			}
		});
		btnNewButton.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(255, 160, 122));
		btnNewButton.setBounds(607, 414, 150, 43);
		panel_3.add(btnNewButton);
		
		JButton btnAvailable = new JButton("Available");
		btnAvailable.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		btnAvailable.setBackground(new Color(255, 165, 0));
		btnAvailable.setBounds(782, 414, 150, 43);
		panel_3.add(btnAvailable);
		
		JLabel lblNewLabel_6_1 = new JLabel("Specifications");
		lblNewLabel_6_1.setFont(new Font("Nirmala UI", Font.BOLD, 25));
		lblNewLabel_6_1.setBounds(586, 212, 190, 50);
		panel_3.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Harley Davidson");
		lblNewLabel_2_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1.setBounds(586, 151, 190, 29);
		panel_3.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Condition : Great");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1.setBounds(586, 258, 203, 29);
		panel_3.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Displacement : 1200.5 CC");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1_1.setBounds(586, 290, 270, 29);
		panel_3.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_2 = new JLabel("Mileage: 20kmpl");
		lblNewLabel_2_1_1_1_1_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1_2.setBounds(586, 323, 203, 29);
		panel_3.add(lblNewLabel_2_1_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_1_3 = new JLabel("Rate: 9000/Day");
		lblNewLabel_2_1_1_1_1_3.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1_3.setBounds(586, 375, 203, 29);
		panel_3.add(lblNewLabel_2_1_1_1_1_3);
		
		JLabel lblNewLabel_7_1 = new JLabel("");
		Image img9 = new ImageIcon(this.getClass().getResource("/Bike2.1.jpeg")).getImage();
		lblNewLabel_7_1.setIcon(new ImageIcon(img9));
		lblNewLabel_7_1.setBounds(41, 63, 469, 341);
		panel_3.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("BA25LA");
		lblNewLabel_2_1_1_1_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_2.setBounds(586, 190, 137, 29);
		panel_3.add(lblNewLabel_2_1_1_1_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(173, 216, 230));
		panel_1_1.setBounds(684, 9, 1, 1);
		panel_2.add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("All Catagories");
		lblNewLabel_1_1.setFont(new Font("Nirmala UI", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(706, 22, 220, 37);
		panel_1_1.add(lblNewLabel_1_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setForeground(new Color(158, 158, 158));
		panel_2_1.setBackground(new Color(240, 248, 255));
		panel_2_1.setBounds(103, 233, 356, 283);
		panel_1_1.add(panel_2_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(new Color(240, 248, 255));
		panel_2_1_1.setBounds(591, 233, 356, 283);
		panel_1_1.add(panel_2_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, 24, 356, 231);
		panel_2_1_1.add(lblNewLabel_3);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBackground(new Color(240, 248, 255));
		panel_2_2.setBounds(1068, 233, 356, 283);
		panel_1_1.add(panel_2_2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(0, 22, 356, 229);
		panel_2_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_2 = new JLabel("                  Car");
		lblNewLabel_4_2.setForeground(Color.WHITE);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4_2.setBounds(1088, 525, 336, 31);
		panel_1_1.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("                 Cycle");
		lblNewLabel_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4_1_1.setBounds(601, 524, 356, 32);
		panel_1_1.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("                 Bikes");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4.setBackground(new Color(244, 164, 96));
		lblNewLabel_4.setBounds(103, 524, 356, 32);
		panel_1_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("View Details");
		lblNewLabel_2_2_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_2_1.setBounds(614, 20, 154, 29);
		panel_2.add(lblNewLabel_2_2_1);
	}
}