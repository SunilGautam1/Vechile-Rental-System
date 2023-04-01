package VechileRentalSystem;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ConfirmBookingPage {

    private JFrame frame;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ConfirmBookingPage window = new ConfirmBookingPage();
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
    public ConfirmBookingPage() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(255, 255, 255)); // set background color of the frame
        frame.setBounds(500, 100, 500, 500); // set size and position of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set default close operation for the frame
        frame.getContentPane().setLayout(null); // set layout manager for the content pane
        frame.setVisible(true); // set visibility of the frame to true

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setVisible(false);

            }
        });
        Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();
        lblNewLabel.setIcon(new ImageIcon(img2)); // set an image icon for the label
    lblNewLabel.setBounds(0, 0, 45, 33); // set size and position of the label
    frame.getContentPane().add(lblNewLabel); // add the label to the content pane

        JLabel lblNewLabel_1 = new JLabel("Confirm Vehicle Number");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(90, 141, 266, 46);
        frame.getContentPane().add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBounds(85, 190, 256, 27);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JButton btnNewButton = new JButton("Book");
        btnNewButton.setBackground(new Color(255, 255, 255));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String vehicleNumber = textField.getText().trim();
                if (!vehicleNumber.isEmpty()) {
                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Oursystem", "root",
                            "sunil123");
                            PreparedStatement stmt = conn
                                    .prepareStatement("UPDATE Vechile SET status='Booked' WHERE VechileNumber=?")) {
                        stmt.setString(1, vehicleNumber);
                        int updateCount = stmt.executeUpdate();
                        if (updateCount == 1) {
                            JOptionPane.showMessageDialog(null, "Booked Sucessfully!!!");
                            // display a success message or perform other actions here
                        } else {
                            // System.out.println("No vehicle with number " + vehicleNumber + " was
                            // found.");
                            // display an error message or perform other actions here
                            JOptionPane.showMessageDialog(null, "Vechile Not Found", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                        // display an error message or perform other actions here
                    }

                }
            }
        });
        btnNewButton.setBounds(167, 252, 108, 27);
        frame.getContentPane().add(btnNewButton);
    }

}