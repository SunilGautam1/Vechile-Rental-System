package VechileRentalSystem;

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class viewallvehicle {
    private JFrame frame;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    viewallvehicle window = new viewallvehicle();
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
    public viewallvehicle() {
        initialize();
        showData();
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
        panel.setBackground(new Color(128, 255, 255));
        panel.setBounds(0, 0, 1540, 84);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("List of Vehicle");
        lblNewLabel.setBounds(585, 5, 370, 74);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 61));
        panel.add(lblNewLabel);
        
      
       
       
        
        
Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();
		
		JLabel lblNewLabel_1 = new JLabel("");
		 lblNewLabel_1.setBounds(10, 24, 70, 50);
		 panel.add(lblNewLabel_1);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(img2));

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 84, 1540, 761);
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
                    false, false, false, true, false, false, false, false, false
            };
            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        scrollPane.setViewportView(table);
        table.setRowHeight(100);

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // Get the selected row
                //int selectedRow = table.getSelectedRow();

                // Show dialog box with options
                Object[] options = { "Delete"};
                int choice = JOptionPane.showOptionDialog(table, "Select an action", "Action", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                if (choice == 0) {
                    int selectedRow = table.getSelectedRow();
                    String vehicleNumber = (String) table.getValueAt(selectedRow, 1);

                    int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to delete this record?","Warning",JOptionPane.YES_NO_OPTION);
                    if(dialogResult == JOptionPane.YES_OPTION){
                        try {
                            // Connect to database
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/OurSystem", "root", "sunil123");

                            // Prepare statement to delete row from table
                            PreparedStatement stmt = conn.prepareStatement("DELETE FROM vehicle WHERE vehicle_number=?");

                            // Set values in prepared statement
                            stmt.setString(1, vehicleNumber);

                            // Execute statement
                            stmt.executeUpdate();

                            // Close statement and connection
                            stmt.close();
                            conn.close();

                            // Show success message
                            JOptionPane.showMessageDialog(frame, "Vehicle data deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

                            // Remove row from tableModel
                            DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
                            tableModel.removeRow(selectedRow);

                        } catch (Exception ex) {
                            ex.printStackTrace();
                            JOptionPane.showMessageDialog(frame, "Error deleting vehicle data.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }


            }
        });

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