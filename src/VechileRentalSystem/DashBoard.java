package VechileRentalSystem;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DashBoard {

	private JFrame frame;
	private JTextField textField;
	private JTable table;
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard window = new DashBoard();
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
	public DashBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1610, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setBounds(0, 0, 1540, 81);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vechile Rental");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(464, 19, 291, 61);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_8 = new JLabel("logout");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new LogInPage();
			}
		});
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_8.setBounds(1421, 39, 109, 32);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel(ProfileDatabase.Secondname);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_9.setBounds(69, 32, 205, 39);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		Image img9 = new ImageIcon(this.getClass().getResource("/user.png")).getImage();
		lblNewLabel_10.setIcon(new ImageIcon(img9));

		lblNewLabel_10.setBounds(10, 12, 74, 68);
		panel.add(lblNewLabel_10);
		
		textField = new JTextField();
		textField.setBounds(1155, 23, 134, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
       
			public void actionPerformed(ActionEvent e) {
				
				String url= "jdbc:mysql://localhost:3306/Oursystem";
				String username = "root";
				String password = "sunil123";
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,username,password);

					
                       Statement stmt = con.createStatement();
					
                       String sql = "SELECT * FROM Vechile WHERE VechileNumber='"+textField.getText()+"'";


					ResultSet rs = stmt.executeQuery(sql);
					if(rs.next()) {
						
						String[] columnNames = {"VechileNumber","Name","Model","companyname","modelnumber","price"};
						ResultSetMetaData rsmd = rs.getMetaData();
						DefaultTableModel model= (DefaultTableModel) table.getModel();
						model.setColumnIdentifiers(columnNames);

						String i,st,co,m,p,g;
						i=rs.getString(1);
						st=rs.getString(2);
						co=rs.getString(3);
						m=rs.getString(4);
						p=rs.getString(5);
						g=rs.getString(6);

						String[] row = {i,st,co,m,p,g};
						model.addRow(row);

						stmt.close();
						con.close();
					}
					
					
					
				} catch (ClassNotFoundException f) {
					// TODO Auto-generated catch block
					System.out.println(f);
				}catch (SQLException r) {
					// TODO Auto-generated catch block
					System.out.println(r);
				} 
			}
		});
		btnNewButton.setBounds(1299, 32, 85, 21);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 80, 1540, 765);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Catagories");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(217, 21, 177, 37);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setForeground(new Color(158, 158, 158));
		panel_2.setBounds(104, 80, 356, 283);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Bike();
			}
		});
		Image img = new ImageIcon(this.getClass().getResource("/Bike.jpeg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));

		
		lblNewLabel_2.setBounds(0, 21, 356, 232);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("                 Bikes");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Bike();
			}
		});
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(0, 251, 356, 32);
		panel_2.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(0, 0, 0));
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(598, 80, 356, 283);
		panel_1.add(panel_2_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("                 Cycle");
		lblNewLabel_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Cycle();
			}
		});
		lblNewLabel_4_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_1.setBounds(0, 251, 356, 32);
		panel_2_1.add(lblNewLabel_4_1);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Cycle();
			}
		});
		
		lblNewLabel_3.setBounds(0, 20, 356, 231);
		panel_2_1.add(lblNewLabel_3);
		Image img2 = new ImageIcon(this.getClass().getResource("/Cycle.jpeg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img2));
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(0, 0, 0));
		panel_2_2.setLayout(null);
		panel_2_2.setBounds(1079, 387, 356, 283);
		panel_1.add(panel_2_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("                  Car");
		lblNewLabel_4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Car();
			}
		});
		lblNewLabel_4_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_2.setBounds(0, 252, 356, 31);
		panel_2_2.add(lblNewLabel_4_2);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(0, 10, 356, 229);
		panel_2_2.add(lblNewLabel_5);
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Car();
			}
		});
		Image img3 = new ImageIcon(this.getClass().getResource("/car.jpeg")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img3));

		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(new Color(0, 0, 0));
		panel_2_3.setLayout(null);
		panel_2_3.setBounds(104, 425, 356, 289);
		panel_1.add(panel_2_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("                  Jeep");
		lblNewLabel_4_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Jeep();
			}
		});
		lblNewLabel_4_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_3.setBounds(0, 257, 356, 32);
		panel_2_3.add(lblNewLabel_4_3);
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new Jeep();
			}
		});
		Image img5 = new ImageIcon(this.getClass().getResource("/Jeep.jpeg")).getImage();
		lblNewLabel_6.setIcon(new ImageIcon(img5));
		lblNewLabel_6.setBounds(0, 24, 356, 236);
		panel_2_3.add(lblNewLabel_6);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setBackground(new Color(0, 0, 0));
		panel_2_4.setLayout(null);
		panel_2_4.setBounds(598, 425, 356, 289);
		panel_1.add(panel_2_4);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			}
		});
		Image img6 = new ImageIcon(this.getClass().getResource("/Van.jpeg")).getImage();
		lblNewLabel_7.setIcon(new ImageIcon(img6));
		
		lblNewLabel_7.setBounds(0, 25, 356, 235);
		panel_2_4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_4_5 = new JLabel("Others");
		lblNewLabel_4_5.setBounds(10, 257, 356, 32);
		panel_2_4.add(lblNewLabel_4_5);
		lblNewLabel_4_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 255, 255));
		panel_3.setBounds(0, 0, 70, 765);
		panel_1.add(panel_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(0, 255, 255));
		panel_3_1.setBounds(1470, 0, 70, 765);
		panel_1.add(panel_3_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(1160, 0, 196, 125);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}