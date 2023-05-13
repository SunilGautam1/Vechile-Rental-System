package VechileRentalSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegistrationQuestion {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RegistrationQuestion window = new RegistrationQuestion();
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
    public RegistrationQuestion() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(128, 255, 255));
        frame.setBounds(350, 100, 900, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setBounds(46, 119, 787, 510);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("1.   What is your Family name?");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(10, 21, 679, 52);
        panel.add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(42, 63, 279, 34);
        panel.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("2. What city were you born?");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_2.setBounds(10, 161, 679, 52);
        panel.add(lblNewLabel_2);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(42, 203, 279, 34);
        panel.add(textField_1);

        JLabel lblNewLabel_2_1 = new JLabel("3. What is your favorite movie?");
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_2_1.setBounds(10, 303, 679, 52);
        panel.add(lblNewLabel_2_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(42, 354, 279, 34);
        panel.add(textField_2);

        JButton btnNewButton = new JButton("Continue");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNewButton.setBackground(new Color(255, 255, 255));
        btnNewButton.setBounds(298, 437, 147, 34);
        panel.add(btnNewButton);
        
        JLabel lblNewLabel_1 = new JLabel("Please Answer All  Security Questions");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
        lblNewLabel_1.setBounds(46, 37, 772, 83);
        frame.getContentPane().add(lblNewLabel_1);

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String answer1 = textField.getText();
                String answer2 = textField_1.getText();
                String answer3 = textField_2.getText();
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/OurSystem", "root", "sunil123")) {
                    String sql = "UPDATE userdetails SET Question=?, Question1=?, Question2=? WHERE Phone_Number=?";
                    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                        pstmt.setString(1, answer1);
                        pstmt.setString(2, answer2);
                        pstmt.setString(3, answer3);
                        pstmt.setString(4, RegisterPage.phonenumber);
                        int rowsUpdated = pstmt.executeUpdate();
                        if (rowsUpdated > 0) {
                        	JOptionPane.showMessageDialog(null, "You have been Registered", "Success", JOptionPane.INFORMATION_MESSAGE);
                        	frame.setVisible(false);
                        	new LogInPage();
                           
                        } else {
                            System.out.println("No rows have been updated.");
                        }
                    } catch (SQLException f) {
                        // handle the exception here
                    }
                } catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
    }
 


}
