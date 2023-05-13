package VechileRentalSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Return {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Return window = new Return();
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
	public Return() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
        
Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 21, 49, 32);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(img2));
		
		JPanel panel = new JPanel();
		panel.setBounds(43, 38, 365, 170);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vehicle Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(80, 26, 144, 42);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(80, 59, 198, 33);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Return");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Vechile_number = textField.getText();
				int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to Return?", "Confirmation", JOptionPane.YES_NO_OPTION);
				if (choice == JOptionPane.YES_OPTION) {
					try {
						String url = "jdbc:mysql://localhost:3306/Oursystem";
						String username = "root";
						String password = "sunil123";
						Connection connection = DriverManager.getConnection(url, username, password);

					    
					    PreparedStatement stmt = connection.prepareStatement("DELETE FROM notification WHERE vehicle_number=?") ;
					    stmt.setString(1, Vechile_number);
				        stmt.executeUpdate();

					} catch (SQLException ex) {
						ex.printStackTrace();
						}

				}

				try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Oursystem", "root",
				"sunil123");
				PreparedStatement stmt = conn
				        .prepareStatement("UPDATE vehicle SET status='Available' WHERE vehicle_number=?")) {
				stmt.setString(1, Vechile_number);
				stmt.executeUpdate();


				} catch (SQLException ex) {
				ex.printStackTrace();

				}
				
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(124, 116, 85, 33);
		panel.add(btnNewButton);
		
		
			

		

















		}


		

		
	
}
