package VechileRentalSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InnerBicycle extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InnerBicycle frame = new InnerBicycle();
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
	public InnerBicycle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1359, 774);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1335, 727);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(SystemColor.menu);
		panel_1_2.setBounds(0, 0, 1342, 69);
		panel.add(panel_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("Vehicle Rental");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 25));
		lblNewLabel_3.setBounds(89, 5, 171, 61);
		panel_1_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_8_2 = new JLabel("logout");
		lblNewLabel_8_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_8_2.setBounds(1421, 19, 109, 32);
		panel_1_2.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_10_2 = new JLabel("");
		lblNewLabel_10_2.setBounds(1330, 5, 64, 61);
		panel_1_2.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Category");
		lblNewLabel_2_3.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_3.setBounds(312, 21, 109, 29);
		panel_1_2.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("My Bookings");
		lblNewLabel_2_1_3.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_3.setBounds(569, 21, 150, 29);
		panel_1_2.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Vehicle");
		lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				new Vechile();
			}
		});
		lblNewLabel_2_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1.setBounds(450, 21, 109, 29);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Cycle();
				
				
			}
		});
		Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img2));
		
		lblNewLabel.setBounds(10, 5, 45, 43);
		panel_1_2.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(173, 216, 230));
		panel_2.setBounds(0, 68, 1342, 688);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(155, 96, 1035, 490);
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
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("YT Industries Tues");
		lblNewLabel_2_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1.setBounds(586, 151, 212, 29);
		panel_3.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Frame sizes: S, M, L, XL");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1.setBounds(586, 258, 270, 29);
		panel_3.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Wheel sizes: 27.5” or 29”");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1_1.setBounds(586, 290, 270, 29);
		panel_3.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_2 = new JLabel("Type : DownHill");
		lblNewLabel_2_1_1_1_1_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1_2.setBounds(586, 323, 203, 29);
		panel_3.add(lblNewLabel_2_1_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_1_3 = new JLabel("Rate: 1500/Day");
		lblNewLabel_2_1_1_1_1_3.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1_3.setBounds(586, 376, 203, 29);
		panel_3.add(lblNewLabel_2_1_1_1_1_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/Cycle.jpeg")).getImage();
		lblNewLabel_2_1.setIcon(new ImageIcon(img5));
		lblNewLabel_2_1.setBounds(80, 72, 400, 333);
		panel_3.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("BASN12SM");
		lblNewLabel_2_1_1_1_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_2.setBounds(586, 192, 212, 29);
		panel_3.add(lblNewLabel_2_1_1_1_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(173, 216, 230));
		panel_1_1.setBounds(684, 9, 1, 1);
		panel_2.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("All Catagories");
		lblNewLabel_1.setFont(new Font("Nirmala UI", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(706, 22, 220, 37);
		panel_1_1.add(lblNewLabel_1);
		
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
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setBounds(0, 24, 356, 231);
		panel_2_1_1.add(lblNewLabel_3_1);
		
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
		
		JLabel lblNewLabel_4_1 = new JLabel("                 Cycle");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4_1.setBounds(601, 524, 356, 32);
		panel_1_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("                 Bikes");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4.setBackground(new Color(244, 164, 96));
		lblNewLabel_4.setBounds(103, 524, 356, 32);
		panel_1_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_2 = new JLabel("View Details");
		lblNewLabel_2_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_2.setBounds(614, 20, 154, 29);
		panel_2.add(lblNewLabel_2_2);


	}

}