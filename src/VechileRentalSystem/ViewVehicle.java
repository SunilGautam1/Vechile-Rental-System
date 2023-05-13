package VechileRentalSystem;

import java.awt.EventQueue;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class ViewVehicle {

    private JFrame frame;
    private JTable table;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ViewVehicle window = new ViewVehicle();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ViewVehicle() {
        initialize();
        showData();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JScrollPane scrollPane = new JScrollPane();
        frame.getContentPane().add(scrollPane);

        table = new JTable();
        table.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[] {"Image"}
        ) {
            Class[] columnTypes = new Class[] {ImageIcon.class};

            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
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
            PreparedStatement stmt = conn.prepareStatement("SELECT Image FROM vehicle");

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

                // Add row to table model with image icon
                model.addRow(new Object[] {icon});
            }

            // Close result set, statement, and connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
//    private void resizeColumns() {
//        TableColumn column1 = table.getColumnModel().getColumn(0);
//        column1.setPreferredWidth(500);
//        TableColumn column2 = table.getColumnModel().getColumn(1);
//        column2.setPreferredWidth(500);
//    }
}