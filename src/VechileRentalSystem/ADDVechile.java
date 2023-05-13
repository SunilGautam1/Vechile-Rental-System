package VechileRentalSystem;

import java.awt.EventQueue;

import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.border.BevelBorder;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class ADDVechile {

	private JFrame frame;
	private JTextField vehicleNameTextField;
	private JTextField vehicleNumberTextField;
	private JTextField companyNameTextField;
	private JTextField fuelCapacityTextField;
	private JTextField priceTextField;
	private JTextField displacementTextField;
	private JTextField mileageTextField;
	static   File selectedFile;
	
	


	public JTextField getTextField() {
		return vehicleNameTextField;
	}
	

	public JTextField getTextField_1() {
		return vehicleNumberTextField;
	}

	public JTextField getTextField_2() {
		return companyNameTextField;
	}

	public JTextField getTextField_3() {
		return fuelCapacityTextField;
	}

	public JTextField getTextField_4() {
		return priceTextField;
	}

	public JTextField getTextField_5() {
		return displacementTextField;
	}

	public JTextField getTextField_6() {
		return mileageTextField;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADDVechile window = new ADDVechile();
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
	public ADDVechile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setBounds(0, 0, 1600, 870);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		
Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();
		
		JLabel lblNewLabel_1 = new JLabel("");
		 lblNewLabel_1.setBounds(10, 105, 70, 50);
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
		lblNewLabel_2_1_4_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new ViewFEEDBack();
				
				
			}
		});
		lblNewLabel_2_1_4_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 25));
		lblNewLabel_2_1_4_1_1_1.setBounds(1103, 3, 245, 67);
		panel_1.add(lblNewLabel_2_1_4_1_1_1);
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(86, 149, 1383, 674);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD NEW VEHICLE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(0, 0, 1433, 51);
		panel.add(lblNewLabel);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_11.setBounds(108, 352, 493, 280);
		panel.add(panel_11);
		panel_11.setLayout(null);
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 10, 473, 224);
		panel_11.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_1 = new JButton("Choose");
		btnNewButton_1.addActionListener(new ActionListener() {
		  

			public void actionPerformed(ActionEvent e) {
		        if (e.getSource() == btnNewButton_1) {
		            JFileChooser fileChooser = new JFileChooser();
		            fileChooser.setDialogTitle("Choose a PNG file");
		            fileChooser.setFileFilter(new FileNameExtensionFilter("PNG Files", "png"));
		            int result = fileChooser.showOpenDialog(null);
		            if (result == JFileChooser.APPROVE_OPTION) {
		                 selectedFile = fileChooser.getSelectedFile();
		                try {
		                    BufferedImage image = ImageIO.read(selectedFile);
		                    ImageIcon icon = new ImageIcon(image.getScaledInstance(300, 200, Image.SCALE_SMOOTH));
		                    JLabel label = new JLabel(icon);
		                    panel_2.removeAll();
		                    panel_2.add(label);
		                    panel_2.revalidate();
		                    panel_2.repaint();
		                } catch (IOException ex) {
		                    ex.printStackTrace();
		                }
		            }
		        }
		    }
		});
		btnNewButton_1.setBounds(163, 244, 160, 36);
		panel_11.add(btnNewButton_1);
		
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Enter the field");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(51, 47, 259, 58);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Vehicle name:");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_1.setBounds(86, 129, 239, 39);
		panel.add(lblNewLabel_2_1);
		
		vehicleNameTextField = new JTextField();
		vehicleNameTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		vehicleNameTextField.setBounds(322, 134, 308, 38);
		panel.add(vehicleNameTextField);
		vehicleNameTextField.setColumns(10);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Vehicle number:");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_1_1.setBounds(86, 200, 239, 39);
		panel.add(lblNewLabel_2_1_1);
		
		vehicleNumberTextField = new JTextField();
		vehicleNumberTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		vehicleNumberTextField.setColumns(10);
		vehicleNumberTextField.setBounds(322, 205, 308, 38);
		panel.add(vehicleNumberTextField);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Fuel Capacity");
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_1_2.setBounds(690, 129, 239, 39);
		panel.add(lblNewLabel_2_1_2);
		
		companyNameTextField = new JTextField();
		companyNameTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		companyNameTextField.setColumns(10);
		companyNameTextField.setBounds(951, 134, 334, 38);
		panel.add(companyNameTextField);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Displacement:");
		lblNewLabel_2_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_1_2_1.setBounds(690, 204, 239, 39);
		panel.add(lblNewLabel_2_1_2_1);
		
		fuelCapacityTextField = new JTextField();
		fuelCapacityTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fuelCapacityTextField.setColumns(10);
		fuelCapacityTextField.setBounds(951, 205, 334, 38);
		panel.add(fuelCapacityTextField);
		
		JLabel lblNewLabel_2_1_2_1_1 = new JLabel("Company name");
		lblNewLabel_2_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_1_2_1_1.setBounds(71, 276, 239, 39);
		panel.add(lblNewLabel_2_1_2_1_1);
		
		priceTextField = new JTextField();
		priceTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		priceTextField.setColumns(10);
		priceTextField.setBounds(951, 281, 334, 38);
		panel.add(priceTextField);
		
		JLabel lblNewLabel_2_1_2_1_1_1 = new JLabel("Price :");
		lblNewLabel_2_1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_1_2_1_1_1.setBounds(690, 280, 239, 39);
		panel.add(lblNewLabel_2_1_2_1_1_1);
		
		displacementTextField = new JTextField();
		displacementTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		displacementTextField.setColumns(10);
		displacementTextField.setBounds(322, 281, 308, 38);
		panel.add(displacementTextField);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("Mileage :");
		lblNewLabel_2_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_1_2_2.setBounds(690, 349, 239, 39);
		panel.add(lblNewLabel_2_1_2_2);
		
		mileageTextField = new JTextField();
		mileageTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mileageTextField.setColumns(10);
		mileageTextField.setBounds(951, 350, 334, 38);
		panel.add(mileageTextField);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	String Vehicle_name = vehicleNameTextField.getText();
				String Vehicle_Number = vehicleNumberTextField.getText();
				String Comapany_Name = displacementTextField.getText();
				String Model_Number = companyNameTextField.getText();
				String Price = priceTextField.getText();
				String Mileage = mileageTextField.getText();
				String Displacement = fuelCapacityTextField.getText();
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
		            String queryString2 ="INSERT INTO vehicle(vehicle_name, vehicle_number,Company_Name,Fuel_Capacity,Price,Displacement,mileage,Status, Image)VALUES(?,?,?,?,?,?,?,?,?)";
		            PreparedStatement statement1 = connection.prepareStatement(queryString2);
		            statement1.setString(1, Vehicle_name);
		            statement1.setString(2, Vehicle_Number );
		            statement1.setString(3, Comapany_Name);
		            statement1.setString(4, Model_Number);
		            statement1.setString(5, Price);
		            statement1.setString(6, Displacement);
		            statement1.setString(7, Mileage);
		            statement1.setString(8, "Available");
		            statement1.setBytes(9, imageBytes);

		            statement1.executeUpdate();
		            
					JOptionPane.showMessageDialog(null, "Vehicle added!!", "Success", JOptionPane.INFORMATION_MESSAGE);
					frame.setVisible(false);

		            System.out.println("Inserted!!!!");
		            statement1.close();
		            connection.close();
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        } catch (SQLException ex) {
		            ex.printStackTrace();
		        }
		    }
		});
		btnAdd.setBackground(new Color(255, 255, 255));
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAdd.setBounds(921, 455, 176, 39);
		panel.add(btnAdd);
		
		
	
		
		
	}


	public ButtonGroup getButtonGroup() {
		// TODO Auto-generated method stub
		return null;
	}


	public JButton getSubmitButton() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
						

			

