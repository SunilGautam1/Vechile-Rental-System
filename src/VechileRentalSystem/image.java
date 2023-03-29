package VechileRentalSystem;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class image {

	private JFrame frame;
	 JLabel pic;
	    Timer tm;
	    int x = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					image window = new image();
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
	public image() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JComponent contentPane2 = new JPanel();
		contentPane2.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane2);
		contentPane2.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(186, 85, 211));
		panel.setBounds(0, 0, 434, 261);
		contentPane2.add(panel);
		panel.setLayout(null);
		
		JPanel contentPane = new JPanel();
		contentPane.setBounds(0, 68, 434, 193);
		panel.add(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel car = new JPanel();
		contentPane.add(car, "t1");
		car.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Datsun Go");
		lblNewLabel_1.setBounds(57, 11, 56, 14);
		car.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ford Ecosport");
		lblNewLabel_2.setBounds(57, 36, 76, 14);
		car.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Creta");
		lblNewLabel_2_1.setBounds(57, 61, 76, 14);
		car.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("kia");
		lblNewLabel_2_2.setBounds(57, 87, 76, 14);
		car.add(lblNewLabel_2_2);
		
		JPanel bike = new JPanel();
		contentPane.add(bike, "t2");
		bike.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Pulsar");
		lblNewLabel_3.setBounds(20, 11, 46, 14);
		bike.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("KTM");
		lblNewLabel_3_1.setBounds(20, 40, 46, 14);
		bike.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("yamaha");
		lblNewLabel_3_2.setBounds(20, 65, 46, 14);
		bike.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Jawa");
		lblNewLabel_3_2_1.setBounds(20, 98, 46, 14);
		bike.add(lblNewLabel_3_2_1);
		
		JPanel truck = new JPanel();
		contentPane.add(truck, "t3");
		truck.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Chevy");
		lblNewLabel_4.setBounds(10, 24, 46, 14);
		truck.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Ford");
		lblNewLabel_4_1.setBounds(10, 62, 46, 14);
		truck.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Toyota");
		lblNewLabel_4_1_1.setBounds(10, 106, 46, 14);
		truck.add(lblNewLabel_4_1_1);
		
		JButton btnNewButton = new JButton("Car");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c=(CardLayout)(contentPane.getLayout());
				c.show(contentPane, "t1");
			}
		});
		btnNewButton.setBounds(18, 41, 89, 22);
		panel.add(btnNewButton);
		
		JButton btnBike = new JButton("Bike");
		btnBike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c=(CardLayout)(contentPane.getLayout());
				c.show(contentPane, "t2");
			}
		});
		btnBike.setBounds(117, 41, 89, 22);
		panel.add(btnBike);
		
		JButton btnNewButton_1_1 = new JButton("Trucks");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c=(CardLayout)(contentPane.getLayout());
				c.show(contentPane, "t3");
			}
		});
		btnNewButton_1_1.setBounds(216, 41, 89, 22);
		panel.add(btnNewButton_1_1);
		
		JLabel lblNewLabel = new JLabel("Find Vehicle");
		lblNewLabel.setBounds(173, 2, 95, 28);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	}

	private void setContentPane(JComponent contentPane2) {
		// TODO Auto-generated method stub
		
	}

	private void setBounds(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
	}

	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}


}
