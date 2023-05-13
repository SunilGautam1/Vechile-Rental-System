package VechileRentalSystem;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
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

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.border.EtchedBorder;

public class PaymentCar {

	private JFrame frame;
	static File selectedFile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentCar window = new PaymentCar();
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
	public PaymentCar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		 frame.setBounds(00, 00, 1600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setVisible(false);
                new ConfirmCar();

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
		
		 JPanel panel_2 = new JPanel();
         panel_2.setBounds(1005, 106, 520, 630);
         frame.getContentPane().add(panel_2);
         panel_2.setLayout(null);
         
         JLabel lblNewLabel_2_1 = new JLabel("Please Scan QR for Payment");
         lblNewLabel_2_1.setForeground(Color.RED);
         lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 28));
         lblNewLabel_2_1.setBounds(118, 10, 366, 46);
         panel_2.add(lblNewLabel_2_1);
         
         JTextArea txtrnotePleaseTake = new JTextArea();
         txtrnotePleaseTake.setForeground(new Color(255, 0, 0));
         txtrnotePleaseTake.setBackground(new Color(240, 240, 240));
         txtrnotePleaseTake.setEditable(false);
         txtrnotePleaseTake.setLineWrap(true);
         txtrnotePleaseTake.setFont(new Font("Courier New", Font.PLAIN, 23));
         txtrnotePleaseTake.setText("** Please Take the ScreenShot of      payment and Upload the File**");
         txtrnotePleaseTake.setBounds(31, 557, 510, 73);
         panel_2.add(txtrnotePleaseTake);
         
         JLabel lblNewLabel_3 = new JLabel();
         Image img4 = new ImageIcon(this.getClass().getResource("/QR.jpg")).getImage();
         lblNewLabel_3.setIcon(new ImageIcon(img4));
         
         
         lblNewLabel_3.setBounds(-27, 66, 568, 476);
         panel_2.add(lblNewLabel_3);
         
         JPanel panel_1 = new JPanel();
         panel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
         panel_1.setBounds(37, 125, 958, 698);
         frame.getContentPane().add(panel_1);
         panel_1.setLayout(null);
         
         JPanel panel_3 = new JPanel();
         panel_3.setBounds(10, 10, 938, 608);
         panel_1.add(panel_3);
         panel_3.setLayout(new BorderLayout(0, 0));
         
         JLabel lblNewLabel_1 = new JLabel("Upload the transaction photo");
         lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
         lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
         panel_3.add(lblNewLabel_1);
         
         JButton btnNewButton = new JButton("Choose File");
         btnNewButton.addActionListener(new ActionListener() {
         	

			public void actionPerformed(ActionEvent e) {
         		  if (e.getSource() == btnNewButton) {
  		            JFileChooser fileChooser = new JFileChooser();
  		            fileChooser.setDialogTitle("Choose a PNG file");
  		            fileChooser.setFileFilter(new FileNameExtensionFilter("PNG Files", "png"));
  		            int result = fileChooser.showOpenDialog(null);
  		            if (result == JFileChooser.APPROVE_OPTION) {
  		                 selectedFile = fileChooser.getSelectedFile();
  		                try {
  		                    BufferedImage image = ImageIO.read(selectedFile);
  		                    ImageIcon icon = new ImageIcon(image.getScaledInstance(900, 600, Image.SCALE_SMOOTH));
  		                    JLabel label = new JLabel(icon);
  		                    panel_3.removeAll();
  		                    panel_3.add(label);
  		                    panel_3.revalidate();
  		                    panel_3.repaint();
  		                } catch (IOException ex) {
  		                    ex.printStackTrace();
  		                }
  		            }
  		        }
         		
         	}
         });
         btnNewButton.setBackground(new Color(255, 255, 255));
         btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
         btnNewButton.setBounds(376, 628, 229, 45);
         panel_1.add(btnNewButton);
         
         JButton btnNewButton_1 = new JButton("Continue");
         btnNewButton_1.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		if (selectedFile != null ) {
         		
         			 try {
      		            String url = "jdbc:mysql://localhost:3306/Oursystem";
      		            String username = "root";
      		            String password = "sunil123";
      		            Connection connection = DriverManager.getConnection(url, username, password);

      		            BufferedImage image = ImageIO.read(selectedFile);
      		            ByteArrayOutputStream baos = new ByteArrayOutputStream();
      		            ImageIO.write(image, "png", baos);
      		            byte[] imageBytes = baos.toByteArray();

      		            //Insert the image bytes into the database
      		            String queryString2 ="INSERT INTO notification(ID,vehicle_name, vehicle_number,Name,Phone_Number,Address,Time,ScreenShot)VALUES(?,?,?,?,?,?,?,?)";
      		            PreparedStatement statement1 = connection.prepareStatement(queryString2);
      		            statement1.setString(1,ProfileDatabase.Secondname );
      		            statement1.setString(2,Car.vehicle_name  );
      		            statement1.setString(3, Car.vehicle_number );
      		            statement1.setString(4,ConfirmCar.name );
      		            statement1.setString(5,ConfirmCar.Number );
      		            statement1.setString(6,ConfirmCar.Address );
      		            statement1.setString(7,ConfirmCar.Time );
      		            
      		            statement1.setBytes(8, imageBytes);

      		            statement1.executeUpdate();
      		            System.out.println("Inserted!!!!");
      		            statement1.close();
      		            connection.close();
      		        } catch (IOException ex) {
      		            ex.printStackTrace();
      		        } catch (SQLException ex) {
      		            ex.printStackTrace();
      		        }
         		 
         	
                       try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Oursystem", "root",
                               "sunil123");
                               PreparedStatement stmt = conn
                                       .prepareStatement("UPDATE vehicle SET status='Booked' WHERE vehicle_number=?")) {
                           stmt.setString(1, Car.vehicle_number);
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

                   }else {
                	   JOptionPane.showMessageDialog(null, "Please Choose a File", "Error",
                               JOptionPane.ERROR_MESSAGE);
                	   
                	   
                	   
                	   
                   }
         	}
         		
         	
         });
         btnNewButton_1.setBackground(new Color(255, 255, 255));
         btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
         btnNewButton_1.setBounds(1161, 759, 217, 45);
         frame.getContentPane().add(btnNewButton_1);
         
  
	}
}
