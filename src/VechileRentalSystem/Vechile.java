package VechileRentalSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Vechile {

	private JFrame frame;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vechile window = new Vechile();
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
	public Vechile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 00, 1050, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(0, 0, 1036, 74);
		frame.getContentPane().add(panel_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("Vehicle Rental");
		lblNewLabel_4_1.setForeground(Color.BLACK);
		lblNewLabel_4_1.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 25));
		lblNewLabel_4_1.setBounds(63, 10, 171, 61);
		panel_5.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("Category");
		lblNewLabel_2_3.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_3.setBounds(272, 26, 109, 29);
		panel_5.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Vehicle");
		lblNewLabel_2_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_1.setBounds(410, 26, 109, 29);
		panel_5.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("My Bookings");
		lblNewLabel_2_1_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 25));
		lblNewLabel_2_1_2.setBounds(519, 26, 150, 29);
		panel_5.add(lblNewLabel_2_1_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 168, 1026, 585);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setBounds(183, 116, 231, 29);
		frame.getContentPane().add(textField);
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
					
                       String sql = "SELECT * FROM Vechile WHERE Name='"+textField.getText()+"'";


					ResultSet rs = stmt.executeQuery(sql);
					if(rs.next()) {
						
						String[] columnNames = {"VechileNumber","Name","Model","companyname","modelnumber","price","Status"};
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
						String r = rs.getString(7);

						String[] row = {i,st,co,m,p,g,r};
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
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(423, 116, 85, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
			
				
				
			}
		});
		Image img2 = new ImageIcon(this.getClass().getResource("/back-button.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img2));
		
		lblNewLabel.setBounds(10, 5, 45, 43);
		panel_5.add(lblNewLabel);
	}
}
