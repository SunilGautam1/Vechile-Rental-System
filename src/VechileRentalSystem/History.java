package VechileRentalSystem;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class History {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					History window = new History();
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
	public History() {
		initialize();
		showData();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setBounds(0, 0, 1650, 900);
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
				
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(img2));
		
		JPanel panel1 = new JPanel();
  		panel1.setBounds(-1, 0, 1540, 70);
  		frame.getContentPane().add(panel1);
  		panel1.setLayout(null);
  		panel1.setBackground(SystemColor.menu);
  		
  		JLabel lblNewLabel_51 = new JLabel("Vehicle Rental");
  		lblNewLabel_51.setForeground(Color.BLACK);
  		lblNewLabel_51.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 25));
  		lblNewLabel_51.setBounds(126, 6, 171, 61);
  		panel1.add(lblNewLabel_51);
  		
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
  		panel1.add(lblNewLabel_8);
  		
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
  		panel1.add(lblNewLabel_2_1_4);
  		
  		JLabel lblNewLabel_3_2 = new JLabel("");
  		Image Icon = new ImageIcon(this.getClass().getResource("/Truck.png")).getImage();
  		lblNewLabel_3_2.setIcon(new ImageIcon(Icon));
  		lblNewLabel_3_2.setBounds(6, 19, 115, 41);
  		panel1.add(lblNewLabel_3_2);
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
  		panel1.add(lblNewLabel_5_2);
  		
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
  		panel1.add(lblNewLabel_7);
  		
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
  		panel1.add(lblNewLabel_6);
  		lblNewLabel_6.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 22));
  		
  		JLabel lblNewLabel_2_1_4_1 = new JLabel("History");
  		lblNewLabel_2_1_4_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
  		lblNewLabel_2_1_4_1.setBounds(864, 3, 164, 67);
  		panel1.add(lblNewLabel_2_1_4_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(65, 168, 1420, 649);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setBackground(new Color(255, 255, 255));
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "   ", "Vehicle Name", "Vehicle Number"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		table.setRowHeight(100);
	}
	
	 private void showData() {
	        try {
	            // Connect to database
	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/OurSystem", "root", "sunil123");

	            // Query to fetch all images
	            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM History");

	            // Execute query
	            ResultSet rs = stmt.executeQuery();

	            // Create model for table
	            DefaultTableModel model = (DefaultTableModel) table.getModel();

	            // Iterate over result set
	            while (rs.next()) {
	             
	                

	                String vechile_name = rs.getString("vehicle_name");
	                String vechile_number = rs.getString("vehicle_number");
	                String CompanY_Name = rs.getString("Name");
	                
	                String mm = "had Booked ";
	                



	                // Add row to table model with image icon
	                model.addRow(new Object[] {CompanY_Name,mm,vechile_name, vechile_number});
	            }

	            // Close result set, statement, and connection
	            rs.close();
	            stmt.close();
	            conn.close();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	 }
}
