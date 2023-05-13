package VechileRentalSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Check  {

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
                    Check window = new Check();
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
    public Check() {
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
        
Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(4, 82, 49, 32);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new forgetpassword();
				
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(img2));

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
        
        JLabel lblNewLabel_11 = new JLabel("Answer these Correctly");
        lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 50));
        lblNewLabel_11.setBounds(46, 42, 652, 82);
        frame.getContentPane().add(lblNewLabel_11);

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String answer1 = textField.getText();
                String answer2 = textField_1.getText();
                String answer3 = textField_2.getText();

                // Retrieve values from the database and compare with user inputs
                boolean match = compareWithDatabase(answer1, answer2, answer3, forgetpassword.Number);

                if (match) {
                    frame.setVisible(false);
                    new  PasswordReset();
                    
                    // Show options for confirming password
                    // ...
                } else {
                    JOptionPane.showMessageDialog(frame, "Sorry, your answers do not match our records. Please try again.");
                }
            }
        });
    }
    private boolean compareWithDatabase(String answer1, String answer2, String answer3, String pn_number) { // function
        boolean match = false;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/OurSystem", "root", "sunil123");
             PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM userdetails WHERE Phone_Number=? AND question=? AND question1=? AND question2=?")) {

            pstmt.setString(1, pn_number);
            pstmt.setString(2, answer1);
            pstmt.setString(3, answer2);
            pstmt.setString(4, answer3);

            ResultSet rs = pstmt.executeQuery();

            match = rs.next();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return match;
    }


}
