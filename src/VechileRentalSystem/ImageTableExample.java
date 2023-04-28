package VechileRentalSystem;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.sql.*;
import java.util.*;

public class ImageTableExample extends JFrame {

    private JTable table;
    private DefaultTableModel tableModel;

    public ImageTableExample() {
        super("Image Table Example");

        tableModel = new DefaultTableModel(new Object[]{"Image"}, 0);

        table = new JTable(tableModel) {
            public Class getColumnClass(int column) {
                return ImageIcon.class;
            }
        };

        table.setRowHeight(200); // set row height for better image display

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        loadData();
    }

    private void loadData() {
        try {
        	String url= "jdbc:mysql://localhost:3306/Oursystem";
    	    String username = "root";
    	    String password = "sunil123";
            Connection conn = DriverManager.getConnection(url, username, password);

            String sql = "SELECT image_data FROM file";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                byte[] imageData = rs.getBytes("image_data");
                ImageIcon imageIcon = new ImageIcon(imageData);
                tableModel.addRow(new Object[]{imageIcon});
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ImageTableExample();
    }
}