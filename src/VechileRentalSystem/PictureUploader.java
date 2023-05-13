package VechileRentalSystem;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class PictureUploader extends JFrame {
    private JLabel pictureLabel;
    private JButton uploadButton;

               PictureUploader() {
        // Set up the window
        setTitle("Picture Uploader");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());

        // Add the picture label
        pictureLabel = new JLabel("No picture selected", SwingConstants.CENTER);
        getContentPane().add(pictureLabel, BorderLayout.CENTER);

        // Add the upload button
        uploadButton = new JButton("Upload picture");
        uploadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open a file chooser dialog
                JFileChooser chooser = new JFileChooser();
                int result = chooser.showOpenDialog(PictureUploader.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    // Set the picture label to the selected file
                    File file = chooser.getSelectedFile();
                    ImageIcon imageIcon = new ImageIcon(file.getAbsolutePath());
                    Image image = imageIcon.getImage();
                    Image scaledImage = image.getScaledInstance(-1, 400, Image.SCALE_SMOOTH);
                    ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
                    pictureLabel.setIcon(scaledImageIcon);
                    pictureLabel.setText("");
                }
            }
        });
        getContentPane().add(uploadButton, BorderLayout.SOUTH);
    }

    private ImageIcon scaleImageIcon(ImageIcon imageIcon, int height) {
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(-1, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

    public static void main(String[] args) {
        // Create and show the window
        PictureUploader uploader = new PictureUploader();
        uploader.setVisible(true);
    }
}
