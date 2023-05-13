package VechileRentalSystem;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Notification {

    public JFrame frame;

	static String name;

	static String Vechile_name;
    
    static String ID;
    static String textarea;
    static String vechilename;
    static String vechile_ID;
    static String Time;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Notification window = new Notification();
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
    public Notification() {
        initialize();
     
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(128, 255, 255));
        frame.setBounds(00, 0, 1600, 900);
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
      		        
      		                JLabel lblNewLabel = new JLabel("My Booking");
      		                lblNewLabel.setBounds(180, 76, 394, 86);
      		                frame.getContentPane().add(lblNewLabel);
      		                lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
      		                
      		                
      		                
      		             JPanel notificationsPanel = new JPanel();
      		             notificationsPanel.setBackground(new Color(255, 255, 255));
      		             notificationsPanel.setBounds(28, 182, 1487, 653);
      		            notificationsPanel.setLayout(new BoxLayout(notificationsPanel, BoxLayout.Y_AXIS));
      		            frame.getContentPane().add(notificationsPanel);
      		            
      		            
      		         
      		            
      		            
      		            
      		           

      		            // Connecting  to the database and retrieve the rows from the table
      		          String url1 = "jdbc:mysql://localhost:3306/OurSystem";
      		        String user = "root";
      		        String password1 = "sunil123";
      		        String query1 = "SELECT * FROM notification WHERE ID=?";
      		        try (Connection con = DriverManager.getConnection(url1, user, password1);
      		             PreparedStatement ps = con.prepareStatement(query1)) {
      		            ps.setString(1, ProfileDatabase.Secondname); // set the value of the parameter
      		            ResultSet rs = ps.executeQuery();
      		                     
      		            
      		            
      		            	

      		                // Iterating through the result set and create a notification panel for each row
      		                while (rs.next()) {
      		                	 byte[] imageData1 = rs.getBytes("ScreenShot");

      			                // Create input stream from image data
      			               
      		                	
      		                	String ID = rs.getString("ID");  
      		                	 name = rs.getString("Name");
      		                	 Vechile_name = rs.getString("vehicle_name");
      		                	String vehicle_number = rs.getString("vehicle_number");
      		                	String Phone_Number = rs.getString("Phone_Number");
      		                	String Time = rs.getString("Time");
      		                	String Address = rs.getString("Address");
      		                	
      		                	
      		                	
      		                	
      		                	
      		                	
      		                	
      		                	
      		                     JPanel notificationPanel = new JPanel();
      		                    notificationPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
      		                    notificationPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
      		                    
      		                    

      		                    // Add the fields from the row to the notification panel
      		                    JLabel title = new JLabel(name+", ");
      		                    title.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 25));
      		                    notificationPanel.add(title);
      		                    
      		                  
    		                    
    		                    JLabel text = new JLabel("You have Booked a, " + Vechile_name + "," );
      		                    text.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 25));
      		                    text.setAlignmentX(Component.CENTER_ALIGNMENT);
      		                    notificationPanel.add(text);
      		                    
      		                    

      		                    JLabel description = new JLabel("          Vehicle Number: "  );
      		                  description.setFont(new Font("Times new Roman", Font.BOLD, 17));
      		                    description.setAlignmentX(Component.CENTER_ALIGNMENT);
      		                    notificationPanel.add(description);
      		                    

      		                    JLabel des = new JLabel( vehicle_number );
      		                  des.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 17));
      		                des.setAlignmentX(Component.CENTER_ALIGNMENT);
      		                    notificationPanel.add(des);
      		                    
      		                    
      		                    
      		                  JLabel descript = new JLabel("                                                                                    " );
      		                descript.setFont(new Font("Arial", Font.BOLD, 16));
      		              descript.setAlignmentX(Component.CENTER_ALIGNMENT);
    		                    notificationPanel.add(descript);
      		                    
      		                    
      		                    
      		                  
      	    	                       

JButton button = new JButton("Return Vehicle");
  button.setAlignmentX(Component.CENTER_ALIGNMENT);
  
  
button.setFont(new Font("Arial", Font.BOLD, 15));
button.setBackground(Color.WHITE);
  notificationPanel.add(button);
   button.addActionListener(new ActionListener() {
  private BufferedImage image;

@Override
  public void actionPerformed(ActionEvent e) {
  	try {
		  
		  String url = "jdbc:mysql://localhost:3306/Oursystem";
            String username = "root";
            String password = "sunil123";
            Connection connection = DriverManager.getConnection(url, username, password);

            // Retrieve bike information from database
            String query = "SELECT * FROM vehicle WHERE vehicle_name = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, Vechile_name); 
            ResultSet rs = ps.executeQuery();
           
           
            if (rs.next()) {
                // Get image data from result set
                byte[] imageData = rs.getBytes("Image");

                // Create input stream from image data
                InputStream in = new ByteArrayInputStream(imageData);

                // Read image from input stream
                 image = ImageIO.read(in);
            }
               
            rs.close();
            ps.close();
            
          
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        

                // Create image icon from image
  	 JFrame newFrame = new JFrame("New Frame");
     newFrame.setSize(800, 600);
     newFrame.setLocationRelativeTo(null);
     newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     newFrame.setVisible(true);
     
   JPanel panel = new JPanel();
 panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
 newFrame.getContentPane().add(panel);
 
 
JLabel lblNewLabel_11 = new JLabel("" );
lblNewLabel_11.setAlignmentX(Component.CENTER_ALIGNMENT);
ImageIcon imageIcon = new ImageIcon(image);
ImageIcon resizedImageIcon = new ImageIcon(imageIcon.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH));
lblNewLabel_11.setIcon(resizedImageIcon);
panel.add(lblNewLabel_11);



 
 
JLabel label = new JLabel(Vechile_name);
label.setFont(new Font("Arial", Font.BOLD, 30));
label.setAlignmentX(Component.CENTER_ALIGNMENT);

JLabel label1= new JLabel("");
panel.add(label1);
JLabel label2= new JLabel("");
panel.add(label2);
JLabel label3= new JLabel("");
panel.add(label3);



JButton button = new JButton("return");
button.setFont(new Font("Arial", Font.BOLD, 15));
button.setBackground(Color.WHITE);

button.setAlignmentX(Component.CENTER_ALIGNMENT);
button.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to Return?", "Confirmation", JOptionPane.YES_NO_OPTION);
if (choice == JOptionPane.YES_OPTION) {
	try {
		String url = "jdbc:mysql://localhost:3306/Oursystem";
		String username = "root";
		String password = "sunil123";
		Connection connection = DriverManager.getConnection(url, username, password);

	    
	    PreparedStatement stmt = connection.prepareStatement("DELETE FROM notification WHERE vehicle_name=?") ;
	    stmt.setString(1, Vechile_name);
        stmt.executeUpdate();

	} catch (SQLException ex) {
		ex.printStackTrace();
		}

}

try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Oursystem", "root",
"sunil123");
PreparedStatement stmt = conn
        .prepareStatement("UPDATE vehicle SET status='Available' WHERE vehicle_number=?")) {
stmt.setString(1, vehicle_number);
stmt.executeUpdate();


} catch (SQLException ex) {
ex.printStackTrace();

}

try {
String url = "jdbc:mysql://localhost:3306/Oursystem";
String username = "root";
String password = "sunil123";
Connection connection = DriverManager.getConnection(url, username, password);




//Insert the image bytes into the database
String queryString2 ="INSERT INTO History(ID,vehicle_name, vehicle_number,Name,Phone_Number,Address,Time,ScreenShot)VALUES(?,?,?,?,?,?,?,?)";
PreparedStatement statement1 = connection.prepareStatement(queryString2);
statement1.setString(1, ID);
statement1.setString(2, Vechile_name  );
statement1.setString(3, vehicle_number );
statement1.setString(4,name );
statement1.setString(5,Phone_Number );
statement1.setString(6, Address );
statement1.setString(7,Time );

statement1.setBytes(8, imageData1);

newFrame.setVisible(false);
frame.setVisible(false);
new Notification();

statement1.executeUpdate();
System.out.println("Inserted!!!!");
statement1.close();
connection.close();
} catch (SQLException ex) {
ex.printStackTrace();
}


















}


});

JButton button_1 = new JButton("Rate Us");

button_1.setBackground(Color.WHITE);

button_1.setFont(new Font("Arial", Font.BOLD, 15));


button_1.setAlignmentX(Component.CENTER_ALIGNMENT);
button_1.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
	
	frame.setVisible(true);
	  new FeedbackForm();
	
	
	
}
});


      		                   panel.add(label);
      		                   panel.add(button);
      		                 panel.add(button_1);
      		                       
      		                       
      		                       
      		                    }
      		                });
      		                    
      		               


      		                    // Add the notification panel to the main panel
      		                    notificationsPanel.add(notificationPanel);
      		                }
      		            } catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
      		                
      		      
      		                
    }
    
   

	


	
}