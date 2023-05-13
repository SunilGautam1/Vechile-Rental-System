package VechileRentalSystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class onelast extends JFrame implements ActionListener {
    private JButton chooseButton;
    private JFileChooser fileChooser;
    private EllipsePanel ellipsePanel;

    public onelast() {
        super("Ellipse File Chooser");

        // Create the ellipse panel and add it to the frame
        ellipsePanel = new EllipsePanel();
        getContentPane().add(ellipsePanel, BorderLayout.SOUTH);

        // Create the button and file chooser and add them to the frame
        chooseButton = new JButton("Choose File");
        ellipsePanel.add(chooseButton);
        chooseButton.addActionListener(this);
        fileChooser = new JFileChooser();

        // Set the frame properties
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Open the file chooser dialog and get the user's selection
        int returnVal = fileChooser.showOpenDialog(this);

        // If the user selected a file, set the ellipse image
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            ellipsePanel.setImage(fileChooser.getSelectedFile());
        }
    }

    public static void main(String[] args) {
        new onelast();
    }
}

class EllipsePanel extends JPanel {
    private Image ellipseImage;

    public EllipsePanel() {
        super();
        ellipseImage = null;
    }

    public void setImage(File file) {
        // Load the original image from the file
        Image originalImage = new ImageIcon(file.getAbsolutePath()).getImage();

        // Scale the image to a smaller size
        int scaledWidth = 50;
        int scaledHeight = 25;
        Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);

        // Set the scaled image as the new ellipse image and repaint the panel
        ellipseImage = scaledImage;
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the ellipse if an image is set
        if (ellipseImage != null) {
            int centerX = getWidth() / 2 - 25;
            int centerY = getHeight() / 2 - 12;
            g.drawImage(ellipseImage, centerX, centerY, null);
        }
    }
}