package VechileRentalSystem;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewDetailBike1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewDetailBike1 window = new ViewDetailBike1();
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
	public ViewDetailBike1() {
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(139, 147, 1278, 629);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image Duke = new ImageIcon(this.getClass().getResource("/duke 5 (1).png")).getImage();

		
		lblNewLabel_1.setBounds(31, 83, 661, 480);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(Duke));
		
		JLabel lblNewLabel_6_1 = new JLabel("Description");
		lblNewLabel_6_1.setBounds(731, 83, 159, 50);
		panel_1.add(lblNewLabel_6_1);
		lblNewLabel_6_1.setFont(new Font("Nirmala UI", Font.BOLD, 25));
		
		JLabel lblNewLabel_2_1_1_11 = new JLabel("KTM DUKE");
		lblNewLabel_2_1_1_11.setBounds(755, 130, 171, 29);
		panel_1.add(lblNewLabel_2_1_1_11);
		lblNewLabel_2_1_1_11.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Specifications");
		lblNewLabel_6_1_1.setBounds(731, 180, 190, 50);
		panel_1.add(lblNewLabel_6_1_1);
		lblNewLabel_6_1_1.setFont(new Font("Nirmala UI", Font.BOLD, 25));
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Engine Typpe : Single Cylinder,liquid Cooled");
		lblNewLabel_2_1_1_1_1.setBounds(755, 302, 512, 29);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Displacement : 199.5 CC");
		lblNewLabel_2_1_1_1_1_1.setBounds(752, 263, 270, 29);
		panel_1.add(lblNewLabel_2_1_1_1_1_1);
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		
		JLabel lblNewLabel_2_1_1_1_1_2 = new JLabel("Mileage: 33kmpl");
		lblNewLabel_2_1_1_1_1_2.setBounds(755, 228, 203, 29);
		panel_1.add(lblNewLabel_2_1_1_1_1_2);
		lblNewLabel_2_1_1_1_1_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		
		JLabel lblNewLabel_2_1_1_1_1_2_1 = new JLabel("No. of Cylinders: 1");
		lblNewLabel_2_1_1_1_1_2_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1_2_1.setBounds(755, 337, 294, 29);
		panel_1.add(lblNewLabel_2_1_1_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_1_1_2_1_1 = new JLabel("Max Power25 PS @10,000 rpm");
		lblNewLabel_2_1_1_1_1_2_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1_2_1_1.setBounds(755, 376, 474, 29);
		panel_1.add(lblNewLabel_2_1_1_1_1_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_2_1_1_1 = new JLabel("Max Torque:19.3 Nm @ 8000 rpm");
		lblNewLabel_2_1_1_1_1_2_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1_2_1_1_1.setBounds(755, 410, 474, 29);
		panel_1.add(lblNewLabel_2_1_1_1_1_2_1_1_1);
		
		JButton btnNewButton = new JButton("Book");
		if(status().equals("Booked")) {
			btnNewButton.setEnabled(false);
		}
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(255, 160, 122));
		btnNewButton.setBounds(876, 521, 146, 42);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_2_1_1_1_1_2_1_1_1_1 = new JLabel("Status:       "       + status());
		lblNewLabel_2_1_1_1_1_2_1_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1_2_1_1_1_1.setBounds(755, 449, 474, 29);
		panel_1.add(lblNewLabel_2_1_1_1_1_2_1_1_1_1);
		
	}
	
	public static String status(){
	    String url= "jdbc:mysql://localhost:3306/Oursystem";
	    String username = "root";
	    String password = "sunil123";
	    String status = "";
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection Connect = DriverManager.getConnection(url,username,password);
	        java.sql.Statement stmt = Connect.createStatement();
	        String vechileNumber = "BA25LA";
	        String statusQuery = "SELECT status FROM Vechile WHERE VechileNumber = '" + vechileNumber + "'";
	        ResultSet resultSet = stmt.executeQuery(statusQuery);
	        while (resultSet.next()) {
	            status = resultSet.getString("status");
	        } 
	    } catch (Exception e) {
	        System.out.println(e);
	    }
	    return status;
	}

	

}
