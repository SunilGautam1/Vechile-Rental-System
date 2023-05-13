package VechileRentalSystem;


import java.awt.EventQueue;
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

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;

public class ViewALLUSER {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewALLUSER window = new ViewALLUSER();
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
	public ViewALLUSER() {
		initialize();
		showData();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	    frame = new JFrame();
	    frame.getContentPane().setBackground(new Color(128, 255, 255));
	    frame.setBounds(00, 00, 1600, 850);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setLayout(null);
	    
	    

	    JPanel panel = new JPanel();
	    panel.setBounds(0, 110, 1540, 718);
	    frame.getContentPane().add(panel);
	    panel.setLayout(new BorderLayout(0, 0));
Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();

	    JScrollPane scrollPane = new JScrollPane();
	    panel.add(scrollPane, BorderLayout.CENTER);
	    
	    

	    table = new JTable();
	    table.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    table.setModel(new DefaultTableModel(
	            new Object[][] {
	            },
	            new String[] {
	                    "Name", "Phone Number", "Username", "Email", "Password"
	            }
	    ) {
	        boolean[] columnEditables = new boolean[] {
	                false, false, false, false, false
	        };
	        public boolean isCellEditable(int row, int column) {
	            return columnEditables[column];
	        }
	    });
	    scrollPane.setViewportView(table);
	    table.setRowHeight(100);
	    
	    JLabel lblNewLabel = new JLabel("Total User ");
	    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
	    lblNewLabel.setBounds(597, 10, 494, 90);
	    frame.getContentPane().add(lblNewLabel);
	    
	    JLabel lblNewLabel_1 = new JLabel("");
	    frame.getContentPane().add(lblNewLabel_1);
	    lblNewLabel_1.setBounds(10, 34, 70, 50);
	    lblNewLabel_1.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		frame.setVisible(false);
	    		
	    	}
	    });
	    lblNewLabel_1.setIcon(new ImageIcon(img2));

	    
	    table.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	            int selectedRow = table.getSelectedRow();
	            if (selectedRow == -1) { // Check if no row is selected
	                return;
	            }
	            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
	            if (confirm == JOptionPane.YES_OPTION) { // Check if user confirmed deletion
	                try {
	                    // Connect to database
	                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/OurSystem", "root", "sunil123");

	                    // Get the value of the "Phone_Number" column for the selected row
	                    String phoneNumber = (String) table.getValueAt(selectedRow, 1);

	                    // Delete the row from the database
	                    String deleteQuery = "DELETE FROM userdetails WHERE Phone_Number = ?";
	                    PreparedStatement deleteStatement = conn.prepareStatement(deleteQuery);
	                    deleteStatement.setString(1, phoneNumber);
	                    deleteStatement.executeUpdate();

	                    // Remove the row from the table model
	                    DefaultTableModel model = (DefaultTableModel) table.getModel();
	                    model.removeRow(selectedRow);

	                    // Close statement and connection
	                    deleteStatement.close();
	                    conn.close();

	                } catch (Exception ex) {
	                    ex.printStackTrace();
	                }
	            }
	        }
	    });

	  
	  
	    // Populate table with data from database
	    showData();

	    frame.setVisible(true);
	}

	
	 private void showData() {
	        try {
	            // Connect to database
	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/OurSystem", "root", "sunil123");

	            // Query to fetch all images
	            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM userdetails");

	            // Execute query
	            ResultSet rs = stmt.executeQuery();

	            // Create model for table
	            DefaultTableModel model = (DefaultTableModel) table.getModel();

	            // Iterate over result set
	            while (rs.next()) {
	             
	                

	                String vechile_name = rs.getString("Phone_Number");
	                String vechile_number = rs.getString("Full_name");
	                String CompanY_Name = rs.getString("Username");
	                String Fuel_Capacity = rs.getString("Email");
	                String Price = rs.getString("Password");
	                



	                // Add row to table model with image icon
	                model.addRow(new Object[] {vechile_number,vechile_name,CompanY_Name,Fuel_Capacity,Price});
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