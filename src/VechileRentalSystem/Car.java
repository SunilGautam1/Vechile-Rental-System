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

public class Car {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Car window = new Car();
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
	public Car() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(260, 199, 400, 389);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Car1.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBounds(0, 25, 400, 333);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Ioniq-5");
		lblNewLabel_2_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1.setBounds(110, 350, 171, 29);
		panel.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(true);
				new DashBoard();
			}
		});
		Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img2));
		lblNewLabel_1.setBounds(10, 23, 49, 32);
		frame.getContentPane().add(lblNewLabel_1);
		JLabel lblNewLabel = new JLabel("Available Car");
		lblNewLabel.setBounds(667, 107, 175, 37);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(0, 0, 1586, 74);
		frame.getContentPane().add(panel_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("Vehicle Rental");
		lblNewLabel_4_1.setForeground(Color.BLACK);
		lblNewLabel_4_1.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 25));
		lblNewLabel_4_1.setBounds(63, 10, 171, 61);
		panel_5.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("Category");
		lblNewLabel_2_3.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_3.setBounds(272, 26, 109, 29);
		panel_5.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Vehicle");
		lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(true);
				new Vechile();
			} // vehicle name
		});
		lblNewLabel_2_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1.setBounds(400, 26, 109, 29);
		panel_5.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("My Bookings");
		lblNewLabel_2_1_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_2.setBounds(519, 26, 150, 29);
		panel_5.add(lblNewLabel_2_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(920, 199, 400, 389);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/Car.jpeg")).getImage();
		lblNewLabel_2_1.setIcon(new ImageIcon(img1));
		lblNewLabel_2_1.setBounds(20, 7, 400, 333);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Maruti Suzuki");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1.setBounds(125, 350, 171, 29);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		
		JButton btnBook_1 = new JButton("View");
		btnBook_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Innercar1 car = new Innercar1();
					car.setVisible(true);
			}
		});
		btnBook_1.setForeground(Color.BLACK);
		btnBook_1.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnBook_1.setBackground(new Color(255, 160, 122));
		btnBook_1.setBounds(343, 598, 195, 48);
		frame.getContentPane().add(btnBook_1);
		
		JButton btnBook = new JButton("View");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 innercar car2 = new innercar();
					car2.setVisible(true);
			}
		});
		btnBook.setForeground(Color.BLACK);
		btnBook.setFont(new Font("Nirmala UI", Font.BOLD, 20));
		btnBook.setBackground(new Color(255, 160, 122));
		btnBook.setBounds(1025, 598, 195, 48);
		frame.getContentPane().add(btnBook);
		frame.setVisible(true);
		
	}

}