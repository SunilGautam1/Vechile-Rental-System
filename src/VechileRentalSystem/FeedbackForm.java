package VechileRentalSystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;

public class FeedbackForm extends JFrame implements ActionListener {

    private JRadioButton[] ratingButtons;
    private JTextField feedbackTextField;
    private Connection conn;

    public FeedbackForm() {
        // Set window title
        setTitle("Feedback Form");

        // Create rating buttons
        ratingButtons = new JRadioButton[5];
        ButtonGroup group = new ButtonGroup();
        JPanel ratingPanel = new JPanel(new FlowLayout());
        JLabel ratingLabel = new JLabel("Rating:");
        ratingLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        ratingPanel.add(ratingLabel);
        for (int i = 0; i < ratingButtons.length; i++) {
            ratingButtons[i] = new JRadioButton(Integer.toString(i + 1));
            group.add(ratingButtons[i]);
            ratingPanel.add(ratingButtons[i]);
        }

        // Create feedback text field
        feedbackTextField = new JTextField(20);
        JPanel feedbackPanel = new JPanel(new FlowLayout());
        JLabel feedbackLabel = new JLabel("Feedback:");
        feedbackLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        feedbackPanel.add(feedbackLabel);
        feedbackPanel.add(feedbackTextField);

        // Create submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        // Add components to the frame
        Container contentPane = getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("Thank you for Choosing us ");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(lblNewLabel);
        
        

		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(4, 82, 49, 32);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			new Notification();
			}
		});
		
        contentPane.add(Box.createRigidArea(new Dimension(0, 50)));
        contentPane.add(ratingPanel);
        contentPane.add(Box.createRigidArea(new Dimension(0,50)));
        contentPane.add(feedbackPanel);
        contentPane.add(Box.createRigidArea(new Dimension(0, 10)));
        contentPane.add(submitButton);
        
        JButton btnNewButton = new JButton("Back");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new Notification();
        		
        	}
        });
        getContentPane().add(btnNewButton);
        contentPane.add(Box.createRigidArea(new Dimension(0, 10)));
        
        
        

        // Set window properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Submit")) {
            // Save feedback to database
        	
            submitFeedback();
                
    
            // Show feedback submitted message
           
        }
    }

    private void submitFeedback() {
        int rating = getSelectedRating();
        String feedback = feedbackTextField.getText().trim();

        if (rating == 0 || feedback.isEmpty()) {
            return;
        }

        try {
            if (conn == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/OurSystem", "root", "sunil123");
            }

            String sql = "INSERT INTO feedback (name, vechile_name,rating, message) VALUES (?, ?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(3, rating);
            stmt.setString(4, feedback);
            stmt.setString(1, Notification.name);
            stmt.setString(2, Notification.Vechile_name);
            
            stmt.executeUpdate();
            stmt.close();

            clearForm();

            JOptionPane.showMessageDialog(this, "Feedback submitted successfully");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to submit feedback");
        }

    }

    private int getSelectedRating() {
        for (int i = 0; i < ratingButtons.length; i++) {
            if (ratingButtons[i].isSelected()) {
                return i + 1;
            }
        }
        return 0;
    }

    private void clearForm() {
        if (ratingButtons != null) {
            for (int i = 0; i < 5; i++) {
                ratingButtons[i].setSelected(false);
            }
        }
        feedbackTextField.setText("");
       

    }
    public static void main(String[] args) {
        new FeedbackForm();
    }
}



