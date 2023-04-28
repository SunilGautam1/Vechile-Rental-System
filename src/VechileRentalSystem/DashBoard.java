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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 255));
		panel_1.setBounds(0, 0, 1540, 845);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("All Catagories");
		lblNewLabel_1.setFont(new Font("Nirmala UI", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(642, 191, 220, 47);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image Frame7 = new ImageIcon(this.getClass().getResource("/Frame 7 (1).png")).getImage();

		lblNewLabel_3.setIcon(new ImageIcon(Frame7));
		lblNewLabel_3.setBounds(112, 526, 236, 54);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image Sedan = new ImageIcon(this.getClass().getResource("/Sedan.png")).getImage();

		lblNewLabel_4.setIcon(new ImageIcon(Sedan));
		lblNewLabel_4.setBounds(135, 382, 195, 100);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		Image Rectangle15 = new ImageIcon(this.getClass().getResource("/Rectangle 15.png")).getImage();

		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			}
		});
		lblNewLabel_5.setIcon(new ImageIcon(Rectangle15));
		lblNewLabel_5.setBounds(95, 328, 270, 273);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		Image Chopper = new ImageIcon(this.getClass().getResource("/Chopper.png")).getImage();

		
		lblNewLabel_4_1.setIcon(new ImageIcon(Chopper));
		lblNewLabel_4_1.setBounds(522, 369, 195, 100);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		Image Frame72 = new ImageIcon(this.getClass().getResource("/Frame 7 (2).png")).getImage();
		lblNewLabel_3_1.setIcon(new ImageIcon(Frame72));
		lblNewLabel_3_1.setBounds(508, 526, 250, 54);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		
		
		lblNewLabel_5_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Bike();
			}
		});
		lblNewLabel_5_1.setIcon(new ImageIcon(Rectangle15));
		lblNewLabel_5_1.setBounds(469, 328, 270, 273);
		panel_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("");
		Image SUV = new ImageIcon(this.getClass().getResource("/SUV.png")).getImage();

		lblNewLabel_4_1_1.setIcon(new ImageIcon(SUV));
		lblNewLabel_4_1_1.setBounds(895, 382, 195, 100);
		panel_1.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		Image Frame73 = new ImageIcon(this.getClass().getResource("/Frame 7 (3).png")).getImage();

		
		lblNewLabel_3_1_1.setIcon(new ImageIcon(Frame73));
		lblNewLabel_3_1_1.setBounds(868, 526, 250, 54);
		panel_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("");
		lblNewLabel_5_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblNewLabel_5_1_1.setIcon(new ImageIcon(Rectangle15));
		lblNewLabel_5_1_1.setBounds(836, 328, 270, 273);
		panel_1.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("");
		Image semi = new ImageIcon(this.getClass().getResource("/Semi.png")).getImage();

		lblNewLabel_4_1_1_1.setIcon(new ImageIcon(semi));
		lblNewLabel_4_1_1_1.setBounds(1258, 382, 195, 100);
		panel_1.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("");
		Image Frame74 = new ImageIcon(this.getClass().getResource("/Frame 7 (4).png")).getImage();

		
		lblNewLabel_3_1_1_1.setIcon(new ImageIcon(Frame74));
		lblNewLabel_3_1_1_1.setBounds(1231, 526, 250, 54);
		panel_1.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("");
		lblNewLabel_5_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblNewLabel_5_1_1_1.setIcon(new ImageIcon(Rectangle15));
		lblNewLabel_5_1_1_1.setBounds(1211, 328, 270, 273);
		panel_1.add(lblNewLabel_5_1_1_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1540, 131);
		panel_1.add(panel);
		panel.setLayout(null);
		panel.setBackground(SystemColor.menu);
		
		Image Icon = new ImageIcon(this.getClass().getResource("/Truck.png")).getImage();
		Image Icon1 = new ImageIcon(this.getClass().getResource("/Frame 2.png")).getImage();
		Image Icon2 = new ImageIcon(this.getClass().getResource("/Vector.png")).getImage();
		Image Icon3 = new ImageIcon(this.getClass().getResource("/user.png")).getImage();
		
		JLabel lblNewLabel_51 = new JLabel("Vehicle Rental");
		lblNewLabel_51.setForeground(Color.BLACK);
		lblNewLabel_51.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 25));
		lblNewLabel_51.setBounds(126, 6, 171, 61);
		panel.add(lblNewLabel_51);
		
		JLabel lblNewLabel_8 = new JLabel("logout");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_8.setBounds(1431, 99, 109, 32);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_2_3 = new JLabel("Category");
		lblNewLabel_2_3.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_3.setBounds(61, 91, 109, 29);
		panel.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("My Bookings");
		lblNewLabel_2_1_4.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_4.setBounds(315, 91, 150, 29);
		panel.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Vehicle");
		lblNewLabel_2_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1.setBounds(196, 91, 109, 29);
		panel.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("Profile");
		lblNewLabel_6.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 22));
		lblNewLabel_6.setBounds(1290, 102, 84, 29);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setIcon(new ImageIcon(Icon));
		lblNewLabel_3_2.setBounds(6, 19, 115, 41);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_2_2 = new JLabel("");
		lblNewLabel_4_2_2.setIcon(new ImageIcon(Icon1));
		lblNewLabel_4_2_2.setBounds(6, 91, 45, 30);
		panel.add(lblNewLabel_4_2_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("");
		lblNewLabel_5_2.setIcon(new ImageIcon(Icon2));
		lblNewLabel_5_2.setBounds(1404, 104, 29, 27);
		panel.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_7 = new JLabel("");
		
				
				lblNewLabel_7.setIcon(new ImageIcon(Icon3));
				lblNewLabel_7.setBounds(1243, 91, 45, 43);
				panel.add(lblNewLabel_7);
		
		
	}
}
