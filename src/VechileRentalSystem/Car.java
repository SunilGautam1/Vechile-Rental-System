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
		frame.setBounds(0, 0, 1600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("Available Car");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(47, 47, 244, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(56, 432, 174, 168);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/car2.jpeg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBounds(0, 34, 174, 92);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(0, 130, 174, 38);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(322, 432, 174, 168);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(img));
		lblNewLabel_2_1.setBounds(0, 38, 174, 92);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setBounds(0, 130, 174, 38);
		panel_1.add(lblNewLabel_3_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(580, 432, 174, 168);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon(img));
		lblNewLabel_2_2.setBounds(0, 31, 174, 92);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("New label");
		lblNewLabel_3_2.setBounds(0, 130, 174, 38);
		panel_2.add(lblNewLabel_3_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(857, 432, 174, 168);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(new ImageIcon(img));
		lblNewLabel_2_3.setBounds(0, 35, 174, 92);
		panel_3.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("New label");
		lblNewLabel_3_3.setBounds(0, 130, 174, 38);
		panel_3.add(lblNewLabel_3_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(1101, 432, 174, 168);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2_4 = new JLabel("");
		lblNewLabel_2_4.setIcon(new ImageIcon(img));
		lblNewLabel_2_4.setBounds(0, 36, 174, 92);
		panel_4.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("New label");
		lblNewLabel_3_4.setBounds(0, 130, 174, 38);
		panel_4.add(lblNewLabel_3_4);
		
		JButton btnNewButton = new JButton("View ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				new ViewPage();
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(56, 602, 85, 27);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBook = new JButton("Book");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				new ConfirmBookingPage();
			}
		});
		btnBook.setForeground(new Color(255, 255, 255));
		btnBook.setBackground(new Color(0, 0, 0));
		btnBook.setBounds(138, 602, 92, 27);
		frame.getContentPane().add(btnBook);
		
		JButton btnNewButton_1 = new JButton("View ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				new ViewPage();
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(321, 602, 85, 27);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("View ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				new ViewPage();
			}
		});
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setBounds(580, 602, 85, 27);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("View ");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				new ViewPage();
			}
		});
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setBounds(857, 602, 85, 27);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("View ");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				new ViewPage();
			}
		});
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(Color.BLACK);
		btnNewButton_4.setBounds(1101, 602, 85, 27);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnBook_1 = new JButton("Book");
		btnBook_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				new ConfirmBookingPage();
			}
		});
		btnBook_1.setForeground(Color.WHITE);
		btnBook_1.setBackground(Color.BLACK);
		btnBook_1.setBounds(404, 602, 92, 27);
		frame.getContentPane().add(btnBook_1);
		
		JButton btnBook_2 = new JButton("Book");
		btnBook_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				new ConfirmBookingPage();
			}
		});
		btnBook_2.setForeground(Color.WHITE);
		btnBook_2.setBackground(Color.BLACK);
		btnBook_2.setBounds(663, 602, 92, 27);
		frame.getContentPane().add(btnBook_2);
		
		JButton btnBook_3 = new JButton("Book");
		btnBook_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				new ConfirmBookingPage();
			}
		});
		btnBook_3.setForeground(Color.WHITE);
		btnBook_3.setBackground(Color.BLACK);
		btnBook_3.setBounds(940, 602, 92, 27);
		frame.getContentPane().add(btnBook_3);
		
		JButton btnBook_4 = new JButton("Book");
		btnBook_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				new ConfirmBookingPage();
			}
		});
		btnBook_4.setForeground(Color.WHITE);
		btnBook_4.setBackground(Color.BLACK);
		btnBook_4.setBounds(1183, 602, 92, 27);
		frame.getContentPane().add(btnBook_4);
		
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
		lblNewLabel_1.setBounds(10, 10, 49, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBounds(1341, 432, 174, 168);
		frame.getContentPane().add(panel_4_1);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("");
		lblNewLabel_2_4_1.setIcon(new ImageIcon(img));
		lblNewLabel_2_4_1.setBounds(0, 36, 174, 92);
		panel_4_1.add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("New label");
		lblNewLabel_3_4_1.setBounds(0, 130, 174, 38);
		panel_4_1.add(lblNewLabel_3_4_1);
		
		JButton btnNewButton_4_1 = new JButton("View ");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				new ViewPage();
			}
		});
		btnNewButton_4_1.setForeground(Color.WHITE);
		btnNewButton_4_1.setBackground(Color.BLACK);
		btnNewButton_4_1.setBounds(1341, 602, 85, 27);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnBook_4_1 = new JButton("Book");
		btnBook_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				new ConfirmBookingPage();
			}
		});
		btnBook_4_1.setForeground(Color.WHITE);
		btnBook_4_1.setBackground(Color.BLACK);
		btnBook_4_1.setBounds(1423, 602, 92, 27);
		frame.getContentPane().add(btnBook_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\gauta\\OneDrive\\Desktop\\images.jpg"));
		lblNewLabel_4.setBounds(852, 49, 254, 304);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Choose Your ");
		lblNewLabel_5.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 40));
		lblNewLabel_5.setBounds(63, 178, 312, 60);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Perfect Vehicle ");
		lblNewLabel_6.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 40));
		lblNewLabel_6.setBounds(254, 232, 295, 65);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("and book now");
		lblNewLabel_7.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 40));
		lblNewLabel_7.setBounds(518, 279, 327, 74);
		frame.getContentPane().add(lblNewLabel_7);
		frame.setVisible(true);
		
	}

}
