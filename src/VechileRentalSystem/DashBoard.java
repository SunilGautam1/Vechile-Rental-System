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
import javax.swing.SwingConstants;

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
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Nirmala UI", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(-1, 122, 1540, 114);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		Image Frame7 = new ImageIcon(this.getClass().getResource("/Frame 7 (1).png")).getImage();

		lblNewLabel_3.setIcon(new ImageIcon(Frame7));
		lblNewLabel_3.setBounds(95, 526, 270, 54);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		Image Sedan = new ImageIcon(this.getClass().getResource("/Sedan.png")).getImage();

		lblNewLabel_4.setIcon(new ImageIcon(Sedan));
		lblNewLabel_4.setBounds(95, 328, 270, 200);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		Image Rectangle15 = new ImageIcon(this.getClass().getResource("/Rectangle 15.png")).getImage();

		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Car();
			
			}
		});
		lblNewLabel_5.setIcon(new ImageIcon(Rectangle15));
		lblNewLabel_5.setBounds(95, 328, 270, 273);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		Image Chopper = new ImageIcon(this.getClass().getResource("/Chopper.png")).getImage();

		
		lblNewLabel_4_1.setIcon(new ImageIcon(Chopper));
		lblNewLabel_4_1.setBounds(474, 328, 270, 200);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		Image Frame72 = new ImageIcon(this.getClass().getResource("/Frame 7 (2).png")).getImage();
		lblNewLabel_3_1.setIcon(new ImageIcon(Frame72));
		lblNewLabel_3_1.setBounds(474, 526, 270, 54);
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
		lblNewLabel_5_1.setBounds(474, 328, 270, 273);
		panel_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		Image SUV = new ImageIcon(this.getClass().getResource("/SUV.png")).getImage();

		lblNewLabel_4_1_1.setIcon(new ImageIcon(SUV));
		lblNewLabel_4_1_1.setBounds(836, 328, 270, 200);
		panel_1.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		Image Frame73 = new ImageIcon(this.getClass().getResource("/Frame 7 (3).png")).getImage();

		
		lblNewLabel_3_1_1.setIcon(new ImageIcon(Frame73));
		lblNewLabel_3_1_1.setBounds(836, 526, 270, 54);
		panel_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("");
		lblNewLabel_5_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new SUV();
				
			}
		});
		lblNewLabel_5_1_1.setIcon(new ImageIcon(Rectangle15));
		lblNewLabel_5_1_1.setBounds(836, 328, 270, 273);
		panel_1.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("");
		lblNewLabel_4_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		Image semi = new ImageIcon(this.getClass().getResource("/Semi.png")).getImage();

		lblNewLabel_4_1_1_1.setIcon(new ImageIcon(semi));
		lblNewLabel_4_1_1_1.setBounds(1190, 328, 270, 200);
		panel_1.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		Image Frame74 = new ImageIcon(this.getClass().getResource("/Frame 7 (4).png")).getImage();

		
		lblNewLabel_3_1_1_1.setIcon(new ImageIcon(Frame74));
		lblNewLabel_3_1_1_1.setBounds(1190, 526, 270, 54);
		panel_1.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("");
		lblNewLabel_5_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Truck();
			}
		});
		lblNewLabel_5_1_1_1.setIcon(new ImageIcon(Rectangle15));
		lblNewLabel_5_1_1_1.setBounds(1190, 328, 270, 273);
		panel_1.add(lblNewLabel_5_1_1_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(-1, 0, 1540, 70);
		
		panel_1.add(panel);
		panel.setLayout(null);
		panel.setBackground(SystemColor.menu);
		
		JLabel lblNewLabel_51 = new JLabel("Vehicle Rental");
		lblNewLabel_51.setForeground(Color.BLACK);
		lblNewLabel_51.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 25));
		lblNewLabel_51.setBounds(126, 6, 171, 61);
		panel.add(lblNewLabel_51);
		
		JLabel lblNewLabel_8 = new JLabel("logout");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new LogInPage();
			}
		});
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_8.setBounds(1421, 19, 109, 32);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("My Bookings");
		lblNewLabel_2_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(true);
				new Notification();
				
			}
		});
		lblNewLabel_2_1_4.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_4.setBounds(683, 3, 150, 67);
		panel.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		Image Icon = new ImageIcon(this.getClass().getResource("/Truck.png")).getImage();
		lblNewLabel_3_2.setIcon(new ImageIcon(Icon));
		lblNewLabel_3_2.setBounds(6, 19, 115, 41);
		panel.add(lblNewLabel_3_2);
		Image Icon1 = new ImageIcon(this.getClass().getResource("/Frame 2.png")).getImage();
		
		JLabel lblNewLabel_5_2 = new JLabel("");
		lblNewLabel_5_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new LogInPage();
			}
		});
		Image Icon2 = new ImageIcon(this.getClass().getResource("/Vector.png")).getImage();
		lblNewLabel_5_2.setIcon(new ImageIcon(Icon2));
		lblNewLabel_5_2.setBounds(1394, 19, 29, 37);
		panel.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			    frame.setVisible(true);	
			    new ProfileSetting();
			    }
		});
		Image Icon3 = new ImageIcon(this.getClass().getResource("/user.png")).getImage();

		
		lblNewLabel_7.setIcon(new ImageIcon(Icon3));
		lblNewLabel_7.setBounds(531, 6, 35, 57);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("Profile");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(true);	
			    new ProfileSetting();
			}
		});
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(553, 5, 123, 64);
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 22));
		
		JLabel lblNewLabel_2_1_4_1 = new JLabel("History");
		lblNewLabel_2_1_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(true);
				new History();
			}
		});
		lblNewLabel_2_1_4_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_4_1.setBounds(864, 3, 164, 67);
		panel.add(lblNewLabel_2_1_4_1);
		
		JLabel lblNewLabel_2_1_4_2 = new JLabel("Vehicle");
		lblNewLabel_2_1_4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			frame.setVisible(true);
			new VehicleTable();
			}
		});
		lblNewLabel_2_1_4_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_4_2.setBounds(990, 3, 150, 67);
		panel.add(lblNewLabel_2_1_4_2);
		
		
	}
}
