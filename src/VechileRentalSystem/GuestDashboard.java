package VechileRentalSystem;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuestDashboard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuestDashboard window = new GuestDashboard();
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
	public GuestDashboard() {
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
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setBounds(0, 0, 1540, 81);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vechile Rental");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(464, 19, 291, 61);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_10 = new JLabel("");
		Image img9 = new ImageIcon(this.getClass().getResource("/user.png")).getImage();
		lblNewLabel_10.setIcon(new ImageIcon(img9));

		lblNewLabel_10.setBounds(10, 12, 74, 68);
		panel.add(lblNewLabel_10);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new LogInPage();
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(83, 40, 101, 32);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 80, 1540, 765);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Catagories");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(217, 21, 177, 37);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setForeground(new Color(158, 158, 158));
		panel_2.setBounds(104, 80, 356, 283);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "please Log in First!!", "Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		Image img = new ImageIcon(this.getClass().getResource("/Bike.jpeg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));

		
		lblNewLabel_2.setBounds(0, 21, 356, 232);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("                 Bikes");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "please Log in First!!", "Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(0, 251, 356, 32);
		panel_2.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(0, 0, 0));
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(598, 80, 356, 283);
		panel_1.add(panel_2_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("                 Cycle");
		lblNewLabel_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "please Log in First!!", "Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		lblNewLabel_4_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_1.setBounds(0, 251, 356, 32);
		panel_2_1.add(lblNewLabel_4_1);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "please Log in First!!", "Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		
		lblNewLabel_3.setBounds(0, 20, 356, 231);
		panel_2_1.add(lblNewLabel_3);
		Image img2 = new ImageIcon(this.getClass().getResource("/Cycle.jpeg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img2));
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(0, 0, 0));
		panel_2_2.setLayout(null);
		panel_2_2.setBounds(1084, 80, 356, 283);
		panel_1.add(panel_2_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("                  Car");
		lblNewLabel_4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "please Log in First!!", "Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		lblNewLabel_4_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_2.setBounds(0, 252, 356, 31);
		panel_2_2.add(lblNewLabel_4_2);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "please Log in First!!", "Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		Image img3 = new ImageIcon(this.getClass().getResource("/car.jpeg")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img3));
		
		lblNewLabel_5.setBounds(0, 27, 356, 229);
		panel_2_2.add(lblNewLabel_5);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(new Color(0, 0, 0));
		panel_2_3.setLayout(null);
		panel_2_3.setBounds(104, 425, 356, 289);
		panel_1.add(panel_2_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("                  Jeep");
		lblNewLabel_4_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "please Log in First!!", "Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		lblNewLabel_4_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_3.setBounds(0, 257, 356, 32);
		panel_2_3.add(lblNewLabel_4_3);
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "please Log in First!!", "Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		Image img5 = new ImageIcon(this.getClass().getResource("/Jeep.jpeg")).getImage();
		lblNewLabel_6.setIcon(new ImageIcon(img5));
		lblNewLabel_6.setBounds(0, 24, 356, 236);
		panel_2_3.add(lblNewLabel_6);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setBackground(new Color(0, 0, 0));
		panel_2_4.setLayout(null);
		panel_2_4.setBounds(598, 425, 356, 289);
		panel_1.add(panel_2_4);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			}
		});
		Image img6 = new ImageIcon(this.getClass().getResource("/Van.jpeg")).getImage();
		lblNewLabel_7.setIcon(new ImageIcon(img6));
		
		lblNewLabel_7.setBounds(0, 25, 356, 235);
		panel_2_4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_4_5 = new JLabel("Others");
		lblNewLabel_4_5.setBounds(10, 257, 356, 32);
		panel_2_4.add(lblNewLabel_4_5);
		lblNewLabel_4_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 255, 255));
		panel_3.setBounds(0, 0, 70, 765);
		panel_1.add(panel_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(0, 255, 255));
		panel_3_1.setBounds(1470, 0, 70, 765);
		panel_1.add(panel_3_1);
	}
}
