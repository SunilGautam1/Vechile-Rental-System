package VechileRentalSystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class DatabaseRowsToUI extends JFrame {
    private JPanel notificationsPanel;

    public DatabaseRowsToUI() {
        // Set up the JFrame and the notificationsPanel
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Notifications");
        setPreferredSize(new Dimension(400, 400));

        notificationsPanel = new JPanel();
        notificationsPanel.setLayout(new BoxLayout(notificationsPanel, BoxLayout.Y_AXIS));
        getContentPane().add(notificationsPanel);

        // Connect to the database and retrieve the rows from the table
        String url = "jdbc:mysql://localhost:3306/OurSystem";
        String user = "root";
        String password = "sunil123";
        String query = "SELECT * FROM notification";
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            // Iterate through the result set and create a notification panel for each row
            while (rs.next()) {
                JPanel notificationPanel = new JPanel();
                notificationPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
                notificationPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

                // Add the fields from the row to the notification panel
                JLabel title = new JLabel(rs.getString("Name"));
                
                title.setAlignmentX(Component.CENTER_ALIGNMENT);
                notificationPanel.add(title);
                
                JLabel text = new JLabel(" Have Booked a Vehicle");
                text.setFont(new Font("Arial", Font.BOLD, 16));
                text.setAlignmentX(Component.CENTER_ALIGNMENT);
                notificationPanel.add(text);
                
                

                JLabel description = new JLabel(rs.getString("Phone_Number"));
                description.setAlignmentX(Component.CENTER_ALIGNMENT);
                notificationPanel.add(description);

                JButton button = new JButton("Open");
                button.setAlignmentX(Component.CENTER_ALIGNMENT);
                notificationPanel.add(button);
                
           


                // Add the notification panel to the main panel
                notificationsPanel.add(notificationPanel);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DatabaseRowsToUI());
    }
}
