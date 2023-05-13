package VechileRentalSystem;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class next extends JFrame {

    private JPanel contentPane;
    private JComboBox<String> hoursComboBox;
    private JLabel priceLabel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    next frame = new next();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public next() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        hoursComboBox = new JComboBox<String>(new String[] {"1", "2", "3", "4"});
        hoursComboBox.setBounds(181, 66, 83, 27);
        hoursComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedHours = (String) hoursComboBox.getSelectedItem();
                int hours = Integer.parseInt(selectedHours);
                int price = 250 * hours;
                priceLabel.setText("New price: " + price);
            }
        });
        contentPane.add(hoursComboBox);

        JLabel lblNewLabel = new JLabel("Select Rental Hours");
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(6, 66, 163, 27);
        contentPane.add(lblNewLabel);

        priceLabel = new JLabel("New price:");
        priceLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        priceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        priceLabel.setBounds(6, 129, 438, 27);
        contentPane.add(priceLabel);
    }

}