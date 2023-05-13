package VechileRentalSystem;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import javax.swing.*;


import javax.swing.table.DefaultTableModel;

public class VehicleTable {

    private JFrame frame;
    private JTable table;
    
    static Image image;
    static String vehicle_name;
    static String vehicle_number;
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
                    VehicleTable window = new VehicleTable();
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
    public VehicleTable() {
        initialize();
        showData();
        viewallvehicle();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(0, 0, 1600, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1540, 65);
        panel.setBackground(new Color(128, 255, 255));
        frame.getContentPane().add(panel);
                panel.setLayout(null);
                
                Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();
        		
        		JLabel lblNewLabel_1 = new JLabel("");
        		 lblNewLabel_1.setBounds(10, 5, 70, 50);
        		 panel.add(lblNewLabel_1);
        		lblNewLabel_1.addMouseListener(new MouseAdapter() {
        			@Override
        			public void mouseClicked(MouseEvent e) {
        				frame.setVisible(false);
        				
        			}
        		});
        		lblNewLabel_1.setIcon(new ImageIcon(img2));
                
                JLabel lblNewLabel = new JLabel("Search for Needed Vehicle");
                lblNewLabel.setBounds(324, 5, 589, 55);
                lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
                panel.add(lblNewLabel);
        
                JTextField searchField = new JTextField();
                searchField.setBounds(1128, 27, 200, 30);
                searchField.setFont(new Font("Tahoma", Font.PLAIN, 20));
                panel.add(searchField);
                searchField.setPreferredSize(new Dimension(200, 30));
        
                JButton btnNewButton = new JButton("Search");
                btnNewButton.setBounds(1335, 27, 126, 33);
                btnNewButton.setBackground(new Color(255, 255, 255));
                btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
                panel.add(btnNewButton);
                btnNewButton.addActionListener(new ActionListener() {
                    

					public void actionPerformed(ActionEvent e) {
                        // search function
                        String url = "jdbc:mysql://localhost:3306/Oursystem";
                        String username = "root";
                        String password = "sunil123";
                       

                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con = DriverManager.getConnection(url, username, password);
                            Statement stmt = con.createStatement();

                            String sql = "SELECT * FROM vehicle WHERE vehicle_name='" + searchField.getText() + "'";
                            ResultSet rs = stmt.executeQuery(sql);

                            DefaultTableModel model = (DefaultTableModel) table.getModel();
                            model.setRowCount(0); // clear the table before adding new data

                            if (rs.next()) {
                                String[] columnNames = {"Vehicle Name", "Number",  "Company Name",  "Status"};
                                ResultSetMetaData rsmd = rs.getMetaData();
                                model.setColumnIdentifiers(columnNames);

                                String i, st, co, m, p, g;
                                i = rs.getString(1);
                                st = rs.getString(2);
                                co = rs.getString(3);
                               
                                String r = rs.getString(7);

                                // Retrieve image data as a byte array
                                byte[] imageData = rs.getBytes("Image");

                                if (imageData != null && imageData.length > 0) {
                                    try {
                                        // Create input stream from image data
                                        InputStream in = new ByteArrayInputStream(imageData);
                                        
                                        // Read image from input stream
                                        BufferedImage image = ImageIO.read(in);
                                        
                                        if (image == null) {
                                            throw new IOException("Failed to read image data from database");
                                        }
                                        
                                        // Create image icon from image
                                        ImageIcon icon = new ImageIcon(image.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
                                        
                                        Object[] row = {i, st, co, r };
                                        model.addRow(row);
                                    } catch (IOException e1) {
                                        // Log error and add null image to table
                                        System.err.println("Failed to load image: " + e1.getMessage());
                                        e1.printStackTrace();
                                        Object[] row = {i, st, co};
                                        model.addRow(row);
                                    }
                                } else {
                                    Object[] row = {i, st, co};
                                    model.addRow(row);
                                }

                                stmt.close();
                                con.close();
                            } else {
                                System.out.println("No matching records found");
                            }

                        } catch (ClassNotFoundException f) {
                            // Log error
                            System.err.println("Failed to load database driver: " + f.getMessage());
                            f.printStackTrace();
                        } catch (SQLException r) {
                            // Log error
                            System.err.println("Failed to execute SQL query: " + r.getMessage());
                            r.printStackTrace();
                        }

                        
                     // Add a MouseListener to the table
                        table.addMouseListener(new MouseAdapter() {
                          

							public void mouseClicked(MouseEvent e) {
                                // Check if the mouse click was a double-click on a row
                                if (e.getClickCount() == 2) {
                                    // Get the selected row index
                                	   String Name = searchField.getText();
                                    int rowIndex = table.getSelectedRow();
                                    // Get the data from the selected row
                                    String vehicleNumber = table.getValueAt(rowIndex, 0).toString();
                                    String name = table.getValueAt(rowIndex, 1).toString();
                                    String model = table.getValueAt(rowIndex, 2).toString();
                                    
                                    String status = table.getValueAt(rowIndex, 3).toString();
                                    
                                    try {
                          			  
                          			  String url = "jdbc:mysql://localhost:3306/Oursystem";
                          	            String username = "root";
                          	            String password = "sunil123";
                          	            Connection connection = DriverManager.getConnection(url, username, password);

                                        // Retrieve bike information from database
                                        String query = "SELECT * FROM vehicle WHERE vehicle_name = ?";
                                        PreparedStatement ps = connection.prepareStatement(query);
                                        ps.setString(1, Name); 
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
                                    new ViewDetails();
                                }
                            }
                        });

                        
                    }
                });

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 65, 1540, 770);
        frame.getContentPane().add(scrollPane);

        table = new JTable();
        table.setFont(new Font("Tahoma", Font.PLAIN, 20));
        table.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "vehicle_name", "vehicle_number", "Company_Name", "Fuel_Capacity", "Price", "Displacement", "mileage", "Status", "Image"
                }
        ) {
            Class[] columnTypes = new Class[] {
                    Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, ImageIcon.class
            };
            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
            boolean[] columnEditables = new boolean[] {
                    false, false, false, false, false, false, false, false, false
            };
            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        scrollPane.setViewportView(table);
        table.setRowHeight(100);
    }
    public void viewallvehicle() {

        // Add search field and button
        JPanel searchPanel = new JPanel();
        searchPanel.setBounds(0, 835, 1540, 10);
        frame.getContentPane().add(searchPanel);
    }






    private void showData() {
        try {
            // Connect to database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/OurSystem", "root", "sunil123");

            // Query to fetch all images
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM vehicle");

            // Execute query
            ResultSet rs = stmt.executeQuery();

            // Create model for table
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            // Iterate over result set
            while (rs.next()) {
                // Get image data from result set
                byte[] imageData = rs.getBytes("Image");

                // Create input stream from image data
                InputStream in = new ByteArrayInputStream(imageData);

                // Read image from input stream
                Image image = ImageIO.read(in);

                // Create image icon from image
                ImageIcon icon = new ImageIcon(image.getScaledInstance(50, 50, Image.SCALE_SMOOTH));

                String vechile_name = rs.getString("vehicle_name");
                String vechile_number = rs.getString("vehicle_number");
                String CompanY_Name = rs.getString("Company_Name");
                String Fuel_Capacity = rs.getString("Fuel_Capacity");
                String Price = rs.getString("Price");
                String Displacement = rs.getString("Displacement");
                String mileage = rs.getString("mileage");
                String Status = rs.getString("Status");



                // Add row to table model with image icon
                model.addRow(new Object[] {vechile_name,vechile_number,CompanY_Name,Fuel_Capacity,Price,Displacement,mileage,Status,icon});
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