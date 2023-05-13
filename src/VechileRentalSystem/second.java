package VechileRentalSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
import java.sql.*;

public class second extends JFrame {
    private JButton uploadButton;
    private JLabel imageLabel;

    public second() {
        setTitle("Image Uploader");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout());

        uploadButton = new JButton("Upload Image");
        uploadButton.setBackground(new Color(255, 255, 255));
        uploadButton.setVerticalAlignment(SwingConstants.TOP);
        uploadButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        uploadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try {
                        BufferedImage image = ImageIO.read(selectedFile);
                        imageLabel.setIcon(new ImageIcon(image));
                        uploadToDatabase(image);
                        JOptionPane.showMessageDialog(null, "Image uploaded successfully!");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Failed to upload image!");
                    }
                }
            }
        });

        imageLabel = new JLabel();
        imageLabel.setPreferredSize(new Dimension(300, 300));

        getContentPane().add(uploadButton);
        getContentPane().add(imageLabel);

        pack();
        setLocationRelativeTo(null);
    }

    private void uploadToDatabase(BufferedImage image) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(image, "png", baos);
            byte[] imageData = baos.toByteArray();

            String url= "jdbc:mysql://localhost:3306/Oursystem";
    	    String username = "root";
    	    String password = "sunil123";
            Connection conn = DriverManager.getConnection(url, username, password);

            String sql = "INSERT INTO file (image_data) VALUES (?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setBytes(1, imageData);
            pstmt.executeUpdate();

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new second().setVisible(true);
            }
        });
    }
}