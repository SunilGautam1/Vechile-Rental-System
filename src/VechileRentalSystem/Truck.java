package VechileRentalSystem;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Truck {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Truck window = new Truck();
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
	public Truck() {
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
		JLabel lblNewLabel = new JLabel("Available Truck");
		lblNewLabel.setBounds(686, 110, 267, 37);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image Bike = new ImageIcon(this.getClass().getResource("/Truck3.png")).getImage();

		lblNewLabel_2.setIcon(new ImageIcon(Bike));
		lblNewLabel_2.setBounds(183, 330, 475, 262);
		frame.getContentPane().add(lblNewLabel_2);
		Image Rectangle = new ImageIcon(this.getClass().getResource("/Rectangle 23.png")).getImage();
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image Frame = new ImageIcon(this.getClass().getResource("/Frame 7.png")).getImage();

		lblNewLabel_4.setIcon(new ImageIcon(Frame));
		lblNewLabel_4.setBounds(243, 712, 240, 57);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		Image Duke = new ImageIcon(this.getClass().getResource("/Truck1.png")).getImage();

		lblNewLabel_2_1.setIcon(new ImageIcon(Duke));
		lblNewLabel_2_1.setBounds(527, 330, 461, 262);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("");
		lblNewLabel_4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
			
			}
		});
		lblNewLabel_4_2.setIcon(new ImageIcon(Frame));
		lblNewLabel_4_2.setBounds(698, 712, 240, 57);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("");
		Image Harly = new ImageIcon(this.getClass().getResource("/Truck2.png")).getImage();

		lblNewLabel_2_1_3.setIcon(new ImageIcon(Harly));
		lblNewLabel_2_1_3.setBounds(1103, 342, 436, 262);
		frame.getContentPane().add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("");
		lblNewLabel_4_2_1.setIcon(new ImageIcon(Frame));
		lblNewLabel_4_2_1.setBounds(1172, 712, 240, 57);
		frame.getContentPane().add(lblNewLabel_4_2_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(-1, 0, 1540, 70);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBackground(SystemColor.menu);
		
		JLabel lblNewLabel_5 = new JLabel("Vehicle Rental");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 25));
		lblNewLabel_5.setBounds(126, 6, 171, 61);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_8 = new JLabel("logout");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_8.setBounds(1421, 19, 109, 32);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_2_3 = new JLabel("Category");
		lblNewLabel_2_3.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_3.setBounds(365, 21, 109, 29);
		panel.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("My Bookings");
		lblNewLabel_2_1_4.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_4.setBounds(605, 22, 150, 29);
		panel.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Vehicle");
		lblNewLabel_2_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1.setBounds(489, 23, 109, 29);
		panel.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("Profile");
		lblNewLabel_6.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 22));
		lblNewLabel_6.setBounds(1295, 22, 84, 29);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		Image Icon = new ImageIcon(this.getClass().getResource("/Truck.png")).getImage();
		lblNewLabel_3_2.setIcon(new ImageIcon(Icon));
		lblNewLabel_3_2.setBounds(6, 19, 115, 41);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_2_2 = new JLabel("");
		Image Icon1 = new ImageIcon(this.getClass().getResource("/Frame 2.png")).getImage();
		lblNewLabel_4_2_2.setIcon(new ImageIcon(Icon1));
		lblNewLabel_4_2_2.setBounds(312, 18, 45, 38);
		panel.add(lblNewLabel_4_2_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("");
		Image Icon2 = new ImageIcon(this.getClass().getResource("/Vector.png")).getImage();
		lblNewLabel_5_2.setIcon(new ImageIcon(Icon2));
		lblNewLabel_5_2.setBounds(1394, 23, 29, 27);
		panel.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_7 = new JLabel("");
		Image Icon3 = new ImageIcon(this.getClass().getResource("/user.png")).getImage();

		
		lblNewLabel_7.setIcon(new ImageIcon(Icon3));
		lblNewLabel_7.setBounds(1253, 14, 45, 43);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(4, 82, 49, 32);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new DashBoard();
			}
		});
		
		
		JLabel lblNewLabel_9 = new JLabel("TATA");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_9.setBounds(243, 601, 240, 57);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("FORD");
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_9_1.setBounds(733, 601, 240, 57);
		frame.getContentPane().add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("FORD");
		lblNewLabel_9_1_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_9_1_1.setBounds(1220, 601, 267, 57);
		frame.getContentPane().add(lblNewLabel_9_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image Rectangle1 = new ImageIcon(this.getClass().getResource("/Rectangle 23.png")).getImage();

		lblNewLabel_3.setIcon(new ImageIcon(Rectangle1));
		
		
		lblNewLabel_3.setBounds(168, 310, 362, 365);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");

		lblNewLabel_3_1.setIcon(new ImageIcon(Rectangle1));
		lblNewLabel_3_1.setBounds(626, 310, 362, 365);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setIcon(new ImageIcon(Rectangle1));
		
		lblNewLabel_3_3.setBounds(1106, 310, 362, 365);
		frame.getContentPane().add(lblNewLabel_3_3);
		frame.setVisible(true);
	}

}