package VechileRentalSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ForgetPassword {

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
					ForgetPassword window = new ForgetPassword();
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
	public ForgetPassword() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Forget Password");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(0, 0, 256, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Verify its you");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(172, 68, 296, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Answer the 3 Question");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(126, 122, 388, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(130, 232, 229, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 351, 229, 35);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(130, 477, 229, 35);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(29, 173, 485, 42);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setBounds(29, 277, 485, 42);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("New label");
		lblNewLabel_3_2.setBounds(29, 410, 485, 42);
		frame.getContentPane().add(lblNewLabel_3_2);
	}
}
