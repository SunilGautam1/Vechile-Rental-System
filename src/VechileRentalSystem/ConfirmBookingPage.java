package VechileRentalSystem;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.SystemColor;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.border.EtchedBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;

public class ConfirmBookingPage {

    private JFrame frame;
    private JTextField textField;
	private JComboBox<String> hoursComboBox;
	private JLabel priceLabel;
	private JTextField textField_1;
	private JTextField textField_2;
	
	 static String name;
	static String Number;
    static String Address;
    static String Time;
	
	
	;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ConfirmBookingPage window = new ConfirmBookingPage();
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
    public ConfirmBookingPage() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(128, 255, 255)); // set background color of the frame
        frame.setBounds(00, 00, 1600, 900); // set size and position of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set default close operation for the frame
        frame.getContentPane().setLayout(null); // set layout manager for the content pane
        frame.setVisible(true); // set visibility of the frame to true

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setVisible(false);
                new Bike();

            }
        });
        Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();
        lblNewLabel.setIcon(new ImageIcon(img2)); // set an image icon for the label
    lblNewLabel.setBounds(9, 80, 45, 33); // set size and position of the label
    frame.getContentPane().add(lblNewLabel); // add the label to the content pane
        
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
		lblNewLabel_2_1_4_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_4_1.setBounds(864, 3, 164, 67);
		panel.add(lblNewLabel_2_1_4_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel_1.setBounds(32, 139, 977, 643);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		        textField = new JTextField();
		        textField.setBounds(535, 174, 329, 33);
		        panel_1.add(textField);
		        textField.setColumns(10);
		                
		                JLabel lblNewLabel_1_1_1 = new JLabel("Phone Number");
		                lblNewLabel_1_1_1.setBounds(535, 239, 266, 46);
		                panel_1.add(lblNewLabel_1_1_1);
		                lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		                
		                JLabel lblNewLabel_1_1_1_1 = new JLabel(Bike.vehicle_name);
		                lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		                lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		                lblNewLabel_1_1_1_1.setBounds(0, 326, 440, 46);
		                panel_1.add(lblNewLabel_1_1_1_1);
		                
		                hoursComboBox = new JComboBox<String>();
		                hoursComboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		                hoursComboBox.setBackground(new Color(255, 255, 255));
		                hoursComboBox.addItem("1");
		                hoursComboBox.addItem("2");
		                hoursComboBox.addItem("3");
		                hoursComboBox.addItem("4");
		                hoursComboBox.setBounds(535, 492, 329, 33);
		                hoursComboBox.addActionListener(new ActionListener() {
		                    public void actionPerformed(ActionEvent e) {
		                        String selectedHours = (String) hoursComboBox.getSelectedItem();
		                        int hours = Integer.parseInt(selectedHours);
		                        int price = 500 * hours;
		                        priceLabel.setText(" " + price);
		                       
		                    }
		                });
		                panel_1.add(hoursComboBox);
		                

		                JLabel lblNewLabel1 = new JLabel("Select Rental Time");
		                lblNewLabel1.setFont(new Font("Dialog", Font.PLAIN, 20));
		                lblNewLabel1.setBounds(535, 453, 231, 46);
		               panel_1.add(lblNewLabel1);

		                priceLabel = new JLabel("");
		                priceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		                priceLabel.setFont(new Font("Dialog", Font.PLAIN, 30));
		                priceLabel.setBounds(0, 509, 389, 46);
		                panel_1.add(priceLabel);
		                
		                
		                JLabel lblNewLabel_1 = new JLabel();
		                ImageIcon imageIcon = new ImageIcon(Bike.image);
		        		ImageIcon resizedImageIcon = new ImageIcon(imageIcon.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH));
		        		lblNewLabel_1.setIcon(resizedImageIcon);
		                
		                lblNewLabel_1.setBounds(10, 10, 430, 316);
		                panel_1.add(lblNewLabel_1);
		                
		                JLabel lblNewLabel_1_1_1_1_1 = new JLabel(Bike.vehicle_number);
		                lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		                lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		                lblNewLabel_1_1_1_1_1.setBounds(0, 366, 430, 46);
		                panel_1.add(lblNewLabel_1_1_1_1_1);
		                
		                textField_1 = new JTextField();
		                textField_1.setColumns(10);
		                textField_1.setBounds(535, 277, 329, 33);
		                panel_1.add(textField_1);
		                
		                JLabel lblNewLabel_1_1_1_2 = new JLabel("Address");
		                lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		                lblNewLabel_1_1_1_2.setBounds(535, 338, 266, 46);
		                panel_1.add(lblNewLabel_1_1_1_2);
		                
		                textField_2 = new JTextField();
		                textField_2.setColumns(10);
		                textField_2.setBounds(535, 379, 329, 33);
		                panel_1.add(textField_2);
		                
		                JLabel lblNewLabel_2 = new JLabel("Please Enter Your Details");
		                lblNewLabel_2.setForeground(new Color(255, 0, 0));
		                lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		                lblNewLabel_2.setBounds(535, 64, 366, 46);
		                panel_1.add(lblNewLabel_2);
		                
		                JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Total Price");
		                lblNewLabel_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		                lblNewLabel_1_1_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 42));
		                lblNewLabel_1_1_1_2_1.setBounds(0, 464, 430, 46);
		                panel_1.add(lblNewLabel_1_1_1_2_1);
		                
		                JLabel lblNewLabel_1_1_1_3 = new JLabel("Name");
		                lblNewLabel_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		                lblNewLabel_1_1_1_3.setBounds(535, 135, 266, 46);
		                panel_1.add(lblNewLabel_1_1_1_3);
		                
		                JLabel lblNewLabel_2_2 = new JLabel("**please enter all the required Field**");
		                lblNewLabel_2_2.setVisible(false);
		                lblNewLabel_2_2.setForeground(Color.RED);
		                lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		                lblNewLabel_2_2.setBounds(545, 412, 285, 33);
		                panel_1.add(lblNewLabel_2_2);
		                Image img4 = new ImageIcon(this.getClass().getResource("/QR.jpg")).getImage();
		                
		               
		                
		                JLabel lblNewLabel_1_1_2 = new JLabel("Confirm Booking");
		                lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		                lblNewLabel_1_1_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 38));
		                lblNewLabel_1_1_2.setBounds(0, 80, 1539, 58);
		                frame.getContentPane().add(lblNewLabel_1_1_2);
		                
		                        JButton btnNewButton = new JButton("Online");
		                        btnNewButton.setBounds(1162, 346, 288, 58);
		                        frame.getContentPane().add(btnNewButton);
		                        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		                        btnNewButton.setBackground(new Color(255, 255, 255));
		                        
		                        JButton btnCash = new JButton("Cash");
		                        btnCash.addActionListener(new ActionListener() {
		                        	public void actionPerformed(ActionEvent e) {

		                            	 name = textField.getText();
		                            	 Number = textField_1.getText();
		                            	 Address = textField_2.getText();
		                            	 Time = hoursComboBox.getSelectedItem().toString();
		                            	 if (!name.isEmpty() && !Number.isEmpty() && !Address.isEmpty() && !Time.isEmpty()) {
		                            		    // None of the fields are empty
		                            		 try {
		                       		            String url = "jdbc:mysql://localhost:3306/Oursystem";
		                       		            String username = "root";
		                       		            String password = "sunil123";
		                       		            Connection connection = DriverManager.getConnection(url, username, password);

		                       		           

		                       		            //Insert the image bytes into the database
		                       		            String queryString2 ="INSERT INTO notification(ID,vehicle_name, vehicle_number,Name,Phone_Number,Address,Time)VALUES(?,?,?,?,?,?,?)";
		                       		            PreparedStatement statement1 = connection.prepareStatement(queryString2);
		                       		            statement1.setString(1,ProfileDatabase.Secondname );
		                       		            statement1.setString(2,Bike.vehicle_name  );
		                       		            statement1.setString(3, Bike.vehicle_number );
		                       		            statement1.setString(4,name );
		                       		            statement1.setString(5,Number );
		                       		            statement1.setString(6,Address );
		                       		            statement1.setString(7,Time );
		                       		            
		                       		           

		                       		            statement1.executeUpdate();
		                       		            System.out.println("Inserted!!!!");
		                       		            statement1.close();
		                       		            connection.close();
		                       		        } catch (SQLException ex) {
		                       		            ex.printStackTrace();
		                       		        }
		                            		 
		                            		 
		                            		   try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Oursystem", "root",
		                                               "sunil123");
		                                               PreparedStatement stmt = conn
		                                                       .prepareStatement("UPDATE vehicle SET status='Booked' WHERE vehicle_number=?")) {
		                                           stmt.setString(1, Bike.vehicle_number);
		                                           int updateCount = stmt.executeUpdate();
		                                           if (updateCount == 1) {
		                                               JOptionPane.showMessageDialog(null, "Booked Sucessfully!!!");
		                                               frame.setVisible(false);
		                                               new DashBoard();
		                                               
		                                               
		                                               // display a success message or perform other actions here
		                                           } else {
		                                               // System.out.println("No vehicle with number " + vehicleNumber + " was
		                                               // found.");
		                                               // display an error message or perform other actions here
		                                               
		                                           }
		                                       } catch (SQLException ex) {
		                                           ex.printStackTrace();
		                                           // display an error message or perform other actions here
		                                       }
		                            		} else {
		                            		    // At least one of the fields is empty
		                            		    lblNewLabel_2_2.setVisible(true);
		                            		}
		                        		
		                        	}
		                        });
		                        btnCash.setFont(new Font("Tahoma", Font.PLAIN, 30));
		                        btnCash.setBackground(Color.WHITE);
		                        btnCash.setBounds(1162, 467, 288, 58);
		                        frame.getContentPane().add(btnCash);
		                        
		                        JLabel lblNewLabel_3 = new JLabel("Payment Method");
		                        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		                        lblNewLabel_3.setBounds(1168, 177, 387, 58);
		                        frame.getContentPane().add(lblNewLabel_3);
		                        
		                        JLabel lblNewLabel_3_1 = new JLabel("Choose one");
		                        lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		                        lblNewLabel_3_1.setBounds(1200, 245, 218, 58);
		                        frame.getContentPane().add(lblNewLabel_3_1);
		                        btnNewButton.addActionListener(new ActionListener() {
		                           

									public void actionPerformed(ActionEvent e) {
										
										
		                            	 name = textField.getText();
		                            	 Number = textField_1.getText();
		                            	 Address = textField_2.getText();
		                            	 Time = hoursComboBox.getSelectedItem().toString();
		                            	 
		                            	 if (!name.isEmpty() && !Number.isEmpty() && !Address.isEmpty() && !Time.isEmpty()) {
		                            		    // None of the fields are empty
		                            		    frame.setVisible(false);
		                            		    new Payment();
		                            		} else {
		                            		    // At least one of the fields is empty
		                            		    lblNewLabel_2_2.setVisible(true);
		                            		}
		                            	
		                            	
		                            	
		                       
		                            	
		                            	
		                                
		                             
		                            }
		                        });
		                
		              
		                
		                
		         
		            

		        
		                
		                
		                
		               
    }
}