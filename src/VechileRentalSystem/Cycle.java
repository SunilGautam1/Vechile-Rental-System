package VechileRentalSystem;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cycle {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cycle window = new Cycle();
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
	public Cycle() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(173, 216, 230));
		frame.setBounds(0, 0, 1600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("View Bicycles");
		lblNewLabel.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		lblNewLabel.setBounds(677, 73, 190, 44);
		frame.getContentPane().add(lblNewLabel);
		Image img = new ImageIcon(this.getClass().getResource("/Cycle.jpeg")).getImage();
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new DashBoard();
			}
		});
		Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img2));
		lblNewLabel_1.setBounds(10, 10, 49, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(0, 0, 1598, 74);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Vehicle Rental");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 25));
		lblNewLabel_4.setBounds(63, 10, 171, 61);
		panel_5.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_3 = new JLabel("Category");
		lblNewLabel_2_3.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_3.setBounds(272, 26, 109, 29);
		panel_5.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Vehicle");
		lblNewLabel_2_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1.setBounds(410, 26, 109, 38);
		panel_5.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("My Bookings");
		lblNewLabel_2_1_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_2.setBounds(519, 26, 150, 29);
		panel_5.add(lblNewLabel_2_1_2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(379, 179, 400, 389);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img9 = new ImageIcon(this.getClass().getResource("/Cycle.jpeg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img9));
		lblNewLabel_2.setBounds(25, 10, 400, 333);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("YT Industries Tues");
		lblNewLabel_2_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1.setBounds(101, 353, 212, 29);
		panel.add(lblNewLabel_2_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(1007, 179, 400, 389);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/Cycle.jpeg")).getImage();
		lblNewLabel_2_1.setIcon(new ImageIcon(img5));
		
		lblNewLabel_2_1.setBounds(24, 10, 400, 333);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("CLEO 2");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1.setBounds(108, 350, 212, 29);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		
		JButton btnBook_1 = new JButton("View");
		btnBook_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 InnerBicycle  InnerBicycle1 = new  InnerBicycle();
				 InnerBicycle1.setVisible(true);
			}
		});
		btnBook_1.setForeground(Color.BLACK);
		btnBook_1.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnBook_1.setBackground(new Color(255, 160, 122));
		btnBook_1.setBounds(458, 578, 195, 48);
		frame.getContentPane().add(btnBook_1);
		
		JButton btnBook_1_1 = new JButton("View");
		btnBook_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InnerBicycle1  InnerBicycle = new  InnerBicycle1();
				 InnerBicycle.setVisible(true);
			}
		});
		btnBook_1_1.setForeground(Color.BLACK);
		btnBook_1_1.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnBook_1_1.setBackground(new Color(255, 160, 122));
		btnBook_1_1.setBounds(1117, 578, 195, 48);
		frame.getContentPane().add(btnBook_1_1);
		frame.setVisible(true);
		
	}

}