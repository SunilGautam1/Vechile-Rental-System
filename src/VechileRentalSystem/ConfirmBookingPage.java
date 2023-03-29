package VechileRentalSystem;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

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
		frame.setBounds(500, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				
			}
		});
		 Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img2));
		lblNewLabel.setBounds(0, 0, 45, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Confirm Vechile Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(45, 147, 266, 46);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(55, 192, 256, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.setBounds(181, 351, 108, 27);
		frame.getContentPane().add(btnNewButton);
	}
}
