package VechileRentalSystem;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Car {

	private JFrame frame;
	static String vehicle_name;
	static String vehicle_number;
	static BufferedImage image;
	static String Company_Name;
	static String Fuel_Capacity;
	static String Price;
	static String Displacement;
	static String mileage;
	static String Status;

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
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setBounds(0, 0, 1600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("Available Sedan");
		lblNewLabel.setBounds(686, 110, 267, 37);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		
Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();
		
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
		lblNewLabel_1.setIcon(new ImageIcon(img2));
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image Bike = new ImageIcon(this.getClass().getResource("/Car.png")).getImage();

		lblNewLabel_2.setIcon(new ImageIcon(Bike));
		lblNewLabel_2.setBounds(55, 312, 475, 262);
		frame.getContentPane().add(lblNewLabel_2);
		Image Rectangle = new ImageIcon(this.getClass().getResource("/Rectangle 23.png")).getImage();
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			

			@Override
			public void mouseClicked(MouseEvent e) {
				String BikeName2 = "Mercedes";
				  try {
					  
					  String url = "jdbc:mysql://localhost:3306/Oursystem";
			            String username = "root";
			            String password = "sunil123";
			            Connection connection = DriverManager.getConnection(url, username, password);

	                    // Retrieve bike information from database
	                    String query = "SELECT * FROM vehicle WHERE vehicle_name = ?";
	                    PreparedStatement ps = connection.prepareStatement(query);
	                    ps.setString(1, BikeName2); 
	                    ResultSet rs = ps.executeQuery();
	                   
	                   
	                    if (rs.next()) {
	                        // Get image data from result set
	                        byte[] imageData = rs.getBytes("Image");

	                        // Create input stream from image data
	                        InputStream in = new ByteArrayInputStream(imageData);

	                        // Read image from input stream
	                         image = ImageIO.read(in);

	                        // Create image icon from image
	                       

	                      
	                       
	                        
	                        
	                        
	                        vehicle_name = rs.getString("vehicle_name");
		                    vehicle_number = rs.getString("vehicle_number");
		                    Company_Name = rs.getString("Company_Name");
		                    Fuel_Capacity = rs.getString("Fuel_Capacity");
		                    Price = rs.getString("Price");
		                    Displacement = rs.getString("Displacement");
		                    mileage = rs.getString("mileage");
		                    Status = rs.getString("Status");
		                    
		                  
	                    }
	                   
	                    rs.close();
	                    ps.close();
	                    
	                  
	                   
	                } catch (Exception ex) {
	                    ex.printStackTrace();
	                }
				  frame.setVisible(false);
				  new ViewDetailBike1();
				
			}
		});
		Image Frame = new ImageIcon(this.getClass().getResource("/Frame 7.png")).getImage();

		lblNewLabel_4.setIcon(new ImageIcon(Frame));
		lblNewLabel_4.setBounds(243, 712, 240, 57);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		Image Duke = new ImageIcon(this.getClass().getResource("/Car1.png")).getImage();

		lblNewLabel_2_1.setIcon(new ImageIcon(Duke));
		lblNewLabel_2_1.setBounds(626, 330, 347, 262);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("");
		lblNewLabel_4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String BikeName2 = "Honda";
				  try {
					  
					  String url = "jdbc:mysql://localhost:3306/Oursystem";
			            String username = "root";
			            String password = "sunil123";
			            Connection connection = DriverManager.getConnection(url, username, password);

	                    // Retrieve bike information from database
	                    String query = "SELECT * FROM vehicle WHERE vehicle_name = ?";
	                    PreparedStatement ps = connection.prepareStatement(query);
	                    ps.setString(1, BikeName2); 
	                    ResultSet rs = ps.executeQuery();
	                   
	                   
	                    if (rs.next()) {
	                        // Get image data from result set
	                        byte[] imageData = rs.getBytes("Image");

	                        // Create input stream from image data
	                        InputStream in = new ByteArrayInputStream(imageData);

	                        // Read image from input stream
	                         image = ImageIO.read(in);

	                        // Create image icon from image
	                       

	                      
	                       
	                        
	                        
	                        
	                        vehicle_name = rs.getString("vehicle_name");
		                    vehicle_number = rs.getString("vehicle_number");
		                    Company_Name = rs.getString("Company_Name");
		                    Fuel_Capacity = rs.getString("Fuel_Capacity");
		                    Price = rs.getString("Price");
		                    Displacement = rs.getString("Displacement");
		                    mileage = rs.getString("mileage");
		                    Status = rs.getString("Status");
		                    
		                  
	                    }
	                   
	                    rs.close();
	                    ps.close();
	                    
	                  
	                   
	                } catch (Exception ex) {
	                    ex.printStackTrace();
	                }
				
				frame.setVisible(false);
				new ViewDetailBike1();
				
			}
		});
		lblNewLabel_4_2.setIcon(new ImageIcon(Frame));
		lblNewLabel_4_2.setBounds(698, 712, 240, 57);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("");
		Image Harly = new ImageIcon(this.getClass().getResource("/Car3.png")).getImage();

		lblNewLabel_2_1_3.setIcon(new ImageIcon(Harly));
		lblNewLabel_2_1_3.setBounds(1129, 330, 332, 262);
		frame.getContentPane().add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("");
		lblNewLabel_4_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String BikeName2 = "Toyota";
				  try {
					  
					  String url = "jdbc:mysql://localhost:3306/Oursystem";
			            String username = "root";
			            String password = "sunil123";
			            Connection connection = DriverManager.getConnection(url, username, password);

	                    // Retrieve bike information from database
	                    String query = "SELECT * FROM vehicle WHERE vehicle_name = ?";
	                    PreparedStatement ps = connection.prepareStatement(query);
	                    ps.setString(1, BikeName2); 
	                    ResultSet rs = ps.executeQuery();
	                   
	                   
	                    if (rs.next()) {
	                        // Get image data from result set
	                        byte[] imageData = rs.getBytes("Image");

	                        // Create input stream from image data
	                        InputStream in = new ByteArrayInputStream(imageData);

	                        // Read image from input stream
	                         image = ImageIO.read(in);

	                        // Create image icon from image
	                       

	                      
	                       
	                        
	                        
	                        
	                        vehicle_name = rs.getString("vehicle_name");
		                    vehicle_number = rs.getString("vehicle_number");
		                    Company_Name = rs.getString("Company_Name");
		                    Fuel_Capacity = rs.getString("Fuel_Capacity");
		                    Price = rs.getString("Price");
		                    Displacement = rs.getString("Displacement");
		                    mileage = rs.getString("mileage");
		                    Status = rs.getString("Status");
		                    
		                  
	                    }
	                   
	                    rs.close();
	                    ps.close();
	                    
	                  
	                   
	                } catch (Exception ex) {
	                    ex.printStackTrace();
	                }
				  frame.setVisible(false);
					new ViewDetailBike1();
				
			}
		});
		lblNewLabel_4_2_1.setIcon(new ImageIcon(Frame));
		lblNewLabel_4_2_1.setBounds(1172, 712, 240, 57);
		frame.getContentPane().add(lblNewLabel_4_2_1);
		
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
		
		JLabel lblNewLabel_9 = new JLabel("Mercedes ");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_9.setBounds(228, 601, 240, 57);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("Honda");
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_9_1.setBounds(713, 601, 240, 57);
		frame.getContentPane().add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("Toyota");
		lblNewLabel_9_1_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_9_1_1.setBounds(1185, 601, 267, 57);
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
		
		

