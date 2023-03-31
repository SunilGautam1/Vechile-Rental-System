package VechileRentalSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bike {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bike window = new Bike();
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
	public Bike() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(173, 216, 230));
		frame.setBounds(0, 00, 1600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(209, 251, 489, 389);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		Image img = new ImageIcon(this.getClass().getResource("/Bike2.jpeg")).getImage();
		
		JLabel lblNewLabel_3 = new JLabel("KTM Duke");
		lblNewLabel_3.setBackground(new Color(255, 160, 122));
		lblNewLabel_3.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		lblNewLabel_3.setBounds(159, 341, 119, 38);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_7 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/Bike2.jpeg")).getImage();
		lblNewLabel_7.setIcon(new ImageIcon(img1));
		lblNewLabel_7.setBounds(10, 10, 471, 341);
		panel.add(lblNewLabel_7);
		Image img3 = new ImageIcon(this.getClass().getResource("/Bike2.jpeg")).getImage();
		Image img4 = new ImageIcon(this.getClass().getResource("/Bike2.jpeg")).getImage();
		
		JButton btnBook = new JButton("View");
		btnBook.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				 Insidebike insidebike2 = new Insidebike();
				insidebike2.setVisible(true);
			}
		});
		btnBook.setForeground(new Color(0, 0, 0));
		btnBook.setBackground(new Color(255, 160, 122));
		btnBook.setBounds(362, 650, 195, 48);
		frame.getContentPane().add(btnBook);
		Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(0, 0, 1586, 78);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(10, 32, 49, 32);
		panel_5.add(lblNewLabel_1);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new DashBoard();
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(img2));
		
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
		lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(true);
				new Vechile();
			}
		});
		lblNewLabel_2_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1.setBounds(406, 32, 109, 29);
		panel_5.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("My Bookings");
		lblNewLabel_2_1_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_2.setBounds(530, 32, 150, 29);
		panel_5.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel = new JLabel("Available bikes");
		lblNewLabel.setBounds(686, 110, 229, 37);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JButton btnBook_1 = new JButton("View");
		btnBook_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 InsideBike1 insidebike = new InsideBike1();
				insidebike.setVisible(true);
			}
		});
		btnBook_1.setForeground(new Color(0, 0, 0));
		btnBook_1.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnBook_1.setBackground(new Color(255, 160, 122));
		btnBook_1.setBounds(1101, 650, 195, 48);
		frame.getContentPane().add(btnBook_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(962, 251, 489, 389);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("harley davidson");
		lblNewLabel_3_1.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		lblNewLabel_3_1.setBackground(new Color(255, 160, 122));
		lblNewLabel_3_1.setBounds(159, 341, 183, 38);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("");
		Image img9 = new ImageIcon(this.getClass().getResource("/Bike2.1.jpeg")).getImage();
		lblNewLabel_7_1.setIcon(new ImageIcon(img9));
		
		lblNewLabel_7_1.setBounds(10, 10, 469, 341);
		panel_1.add(lblNewLabel_7_1);
		frame.setVisible(true);
	}
}