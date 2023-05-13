package VechileRentalSystem;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewFEEDBack {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewFEEDBack window = new ViewFEEDBack();
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
	public ViewFEEDBack() {
		initialize();
		showData() ;
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setBounds(0, 0, 1600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		
Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(10, 100, 49, 32);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(img2));
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1540, 91);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		JLabel lblNewLabel_51 = new JLabel("Vehicle Rental");
		lblNewLabel_51.setForeground(Color.BLACK);
		lblNewLabel_51.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 25));
		lblNewLabel_51.setBounds(126, 6, 171, 61);
		panel_1.add(lblNewLabel_51);
		
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
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("View Bookings");
		lblNewLabel_2_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new ViewALLBooking();
				
				
			}
		});
		lblNewLabel_2_1_4.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 25));
		lblNewLabel_2_1_4.setBounds(590, 3, 195, 67);
		panel_1.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		Image Icon = new ImageIcon(this.getClass().getResource("/Truck.png")).getImage();
		lblNewLabel_3_2.setIcon(new ImageIcon(Icon));
		lblNewLabel_3_2.setBounds(6, 19, 115, 41);
		panel_1.add(lblNewLabel_3_2);
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
		panel_1.add(lblNewLabel_5_2);
		Image Icon3 = new ImageIcon(this.getClass().getResource("/user.png")).getImage();
		
		JLabel lblNewLabel_2_1_4_1 = new JLabel("View History");
		lblNewLabel_2_1_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new ViewALLHistory();
				
			}
		});
		lblNewLabel_2_1_4_1.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 25));
		lblNewLabel_2_1_4_1.setBounds(786, 3, 164, 67);
		panel_1.add(lblNewLabel_2_1_4_1);
		
		JLabel lblNewLabel_2_1_4_1_1 = new JLabel("View User");
		lblNewLabel_2_1_4_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new ViewALLUSER();
			}
		});
		lblNewLabel_2_1_4_1_1.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 25));
		lblNewLabel_2_1_4_1_1.setBounds(960, 3, 164, 67);
		panel_1.add(lblNewLabel_2_1_4_1_1);
		
		JLabel lblNewLabel_2_1_4_2 = new JLabel("View Vehicle");
		lblNewLabel_2_1_4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new viewallvehicle();
			}
		});
		lblNewLabel_2_1_4_2.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 25));
		lblNewLabel_2_1_4_2.setBounds(419, 3, 195, 67);
		panel_1.add(lblNewLabel_2_1_4_2);
		
		JLabel lblNewLabel_2_1_4_1_1_1 = new JLabel("Feedback");
		lblNewLabel_2_1_4_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 25));
		lblNewLabel_2_1_4_1_1_1.setBounds(1103, 3, 245, 67);
		panel_1.add(lblNewLabel_2_1_4_1_1_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(74, 154, 1405, 681);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Vehicle Name", "Name", "Rating", "message"
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
		
		JLabel lblNewLabel = new JLabel("Rating and Reviews");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(147, 95, 786, 56);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		
		
		
		
	}
	
	 private void showData() {
	        try {
	            // Connect to database
	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/OurSystem", "root", "sunil123");

	            // Query to fetch all images
	            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM feedback");

	            // Execute query
	            ResultSet rs = stmt.executeQuery();

	            // Create model for table
	            DefaultTableModel model = (DefaultTableModel) table.getModel();

	            // Iterate over result set
	            while (rs.next()) {
	             
	                

	                String vechile_name = rs.getString("name");
	                String vechile_number = rs.getString("vechile_name");
	                String CompanY_Name = rs.getString("rating");
	                
	                String mm = rs.getString("message");
	                



	                // Add row to table model with image icon
	                model.addRow(new Object[] {vechile_name, vechile_number,CompanY_Name,mm});
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

