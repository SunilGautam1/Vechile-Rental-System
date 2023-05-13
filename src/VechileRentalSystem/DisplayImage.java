package VechileRentalSystem;
import java.awt.BorderLayout;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DisplayImage {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Display Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel();
        frame.getContentPane().add(label, BorderLayout.CENTER);

        try {
            // Connection to database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/OurSystem", "root", "sunil123");

            // Query to fetch image
            PreparedStatement stmt = conn.prepareStatement("SELECT Image FROM vehicle");

           
          

            // Execute query
            ResultSet rs = stmt.executeQuery();

            // If result set has data, fetch first row
            if (rs.next()) {
                // Get image data from result set
                byte[] imageData = rs.getBytes("Image");

                // Create input stream from image data
                InputStream in = new ByteArrayInputStream(imageData);

                // Read image from input stream
                Image image = ImageIO.read(in);

                // Creating image icon from image
                ImageIcon icon = new ImageIcon(image);

                // Set icon to label
                label.setIcon(icon);
            }

            // Closing  result set, statement, and connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        frame.pack();
        frame.setVisible(true);
    }
}