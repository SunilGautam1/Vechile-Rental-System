package VechileRentalSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BikeDetailsApp extends JFrame {
    private JTextField bikeNameField;
    private JButton addButton;
    private JButton viewDetailsButton;
    private JLabel bikeImageLabel;
    private JPanel bikePanel;

    public BikeDetailsApp() {
        setTitle("Bike Details");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        add(mainPanel);

        // Create a text field to get bike name from user
        bikeNameField = new JTextField(20);

        // Create a button to add bike details
        addButton = new JButton("Add Bike");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addBikeDetails();
            }
        });

        // Create a panel to hold the text field and button
        JPanel inputPanel = new JPanel();
        inputPanel.add(bikeNameField);
        inputPanel.add(addButton);

        // Create a panel to hold the bike image and name
        bikePanel = new JPanel();
        bikePanel.setLayout(new BorderLayout());
        bikeImageLabel = new JLabel();
        bikePanel.add(bikeImageLabel, BorderLayout.WEST);
        mainPanel.add(bikePanel);
        mainPanel.add(inputPanel);

        // Create a button to view bike details
        viewDetailsButton = new JButton("View Details");
        viewDetailsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewBikeDetails();
            }
        });
        mainPanel.add(viewDetailsButton);

        pack();
        setVisible(true);
    }

    // Method to add bike details to the bike panel
    private void addBikeDetails() {
        // Get the bike name from the text field
        String bikeName = bikeNameField.getText();

        // Load the bike image
        ImageIcon bikeImage = new ImageIcon("bike.jpg");

        // Set the bike image on the image label
        bikeImageLabel.setIcon(bikeImage);

        // Set the bike name on the name label
        JLabel bikeNameLabel = new JLabel(bikeName);
        bikePanel.add(bikeNameLabel, BorderLayout.CENTER);
        bikePanel.revalidate();
    }

    // Method to view bike details in a new JFrame
    private void viewBikeDetails() {
        // Create a new JFrame
        JFrame detailsFrame = new JFrame();
        detailsFrame.setTitle("Bike Details");
        detailsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create a panel to hold the bike details
        JPanel detailsPanel = new JPanel();
        detailsPanel.setLayout(new BoxLayout(detailsPanel, BoxLayout.Y_AXIS));
        detailsFrame.add(detailsPanel);

        // Get the bike name and image from the main frame
        String bikeName = bikeNameField.getText();
        ImageIcon bikeImage = (ImageIcon) bikeImageLabel.getIcon();

        // Add the bike name and image to the details panel
        JLabel bikeNameLabel = new JLabel(bikeName);
        JLabel bikeImageLabel = new JLabel(bikeImage);
        detailsPanel.add(bikeNameLabel);
        detailsPanel.add(bikeImageLabel);

        detailsFrame.pack();
        detailsFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new BikeDetailsApp();
    }
}


