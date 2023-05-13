package VechileRentalSystem;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ViewDetailSUV1  {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewDetailSUV1 window = new ViewDetailSUV1();
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
	public ViewDetailSUV1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		frame.setBounds(0, 0, 1600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(4, 82, 49, 32);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new SUV();
				
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(img2));
		
		JPanel panel = new JPanel();
		panel.setBounds(-1, 0, 1540, 70);
		frame.getContentPane().add(panel);
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
		lblNewLabel_2_1_4_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_4_1.setBounds(864, 3, 164, 67);
		panel.add(lblNewLabel_2_1_4_1);
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(139, 147, 1278, 629);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("" );
		ImageIcon imageIcon = new ImageIcon(SUV.image);
		ImageIcon resizedImageIcon = new ImageIcon(imageIcon.getImage().getScaledInstance(600, 480, Image.SCALE_SMOOTH));
		lblNewLabel_11.setIcon(resizedImageIcon);
		
		lblNewLabel_11.setBounds(36, 67, 661, 480);
		panel_1.add(lblNewLabel_11);
		
		
		JLabel lblNewLabel_6_1 = new JLabel("Description");
		lblNewLabel_6_1.setBounds(731, 52, 159, 50);
		panel_1.add(lblNewLabel_6_1);
		lblNewLabel_6_1.setFont(new Font("Nirmala UI", Font.BOLD, 25));
		
		JLabel lblNewLabel_2_1_1_11 = new JLabel(SUV.vehicle_name);
		lblNewLabel_2_1_1_11.setBounds(756, 92, 270, 40);
		panel_1.add(lblNewLabel_2_1_1_11);
		lblNewLabel_2_1_1_11.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Specifications");
		lblNewLabel_6_1_1.setBounds(731, 180, 190, 50);
		panel_1.add(lblNewLabel_6_1_1);
		lblNewLabel_6_1_1.setFont(new Font("Nirmala UI", Font.BOLD, 25));
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Price :  " +SUV.Price);
		lblNewLabel_2_1_1_1_1.setBounds(756, 386, 512, 29);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Displacement : " +  SUV.Displacement);
		lblNewLabel_2_1_1_1_1_1.setBounds(756, 306, 270, 29);
		panel_1.add(lblNewLabel_2_1_1_1_1_1);
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		
		JLabel lblNewLabel_2_1_1_1_1_2 = new JLabel("Mileage:  " + SUV.mileage);
		lblNewLabel_2_1_1_1_1_2.setBounds(755, 228, 340, 29);
		panel_1.add(lblNewLabel_2_1_1_1_1_2);
		lblNewLabel_2_1_1_1_1_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		
		JLabel lblNewLabel_2_1_1_1_1_2_1 = new JLabel("Fuel Capacity : "  + SUV.Fuel_Capacity);
		lblNewLabel_2_1_1_1_1_2_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1_2_1.setBounds(756, 267, 294, 29);
		panel_1.add(lblNewLabel_2_1_1_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_1_1_2_1_1 = new JLabel("Company Name : " +  SUV.Company_Name );
		lblNewLabel_2_1_1_1_1_2_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1_2_1_1.setBounds(755, 345, 474, 29);
		panel_1.add(lblNewLabel_2_1_1_1_1_2_1_1);
		
		JButton btnNewButton = new JButton("Book");
		if(SUV.Status .equals("Booked")) {
			btnNewButton.setEnabled(false);
		}
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				new ConfirmSUV();
				
				
			}
		});
		btnNewButton.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(255, 160, 122));
		btnNewButton.setBounds(876, 521, 146, 42);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_2_1_1_1_1_2_1_1_1_1 = new JLabel("Status : "  + SUV.Status     );
		lblNewLabel_2_1_1_1_1_2_1_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1_2_1_1_1_1.setBounds(756, 425, 474, 29);
		panel_1.add(lblNewLabel_2_1_1_1_1_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_3 = new JLabel(SUV.vehicle_number);
		lblNewLabel_2_1_1_1_1_3.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1_3.setBounds(744, 141, 256, 29);
		panel_1.add(lblNewLabel_2_1_1_1_1_3);
		
		JLabel lblNewLabel_2_1_1_1_1_2_1_1_1_1_1 = new JLabel("Pick Up Loaction: Naxal Moto Shop");
		lblNewLabel_2_1_1_1_1_2_1_1_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1_2_1_1_1_1_1.setBounds(756, 462, 474, 29);
		panel_1.add(lblNewLabel_2_1_1_1_1_2_1_1_1_1_1);
		
	}
}
