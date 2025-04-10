package LMS;

import javax.swing.*;
import java.awt.*;

public class hms {
    private final JWindow window;
    private long startTime;
    private int minimumMilliseconds;

    // Constructor
    public hms() {
        window = new JWindow();
        var image = new ImageIcon("C:\\Users\\fatim\\OneDrive\\Desktop\\img.png"); // Use correct path
        window.getContentPane().add(new JLabel(image, SwingConstants.CENTER));

        // Center the windowja
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        window.setBounds((screenSize.width - image.getIconWidth()) / 2,
                (screenSize.height - image.getIconHeight()) / 2,
                image.getIconWidth(), image.getIconHeight());
    }

    public void show(int minimumMilliseconds) {
        this.minimumMilliseconds = minimumMilliseconds;
        window.setVisible(true);
        startTime = System.currentTimeMillis();
    }

    public void hide() {
        long elapsedTime = System.currentTimeMillis() - startTime;
        int remainingTime = Math.max(minimumMilliseconds - (int) elapsedTime, 0);

        // Hide splash screen after the remaining time
        new Timer(remainingTime, e -> window.setVisible(false)).start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            var splash = new hms();
            splash.show(3000);

            // Create a timer that runs once (non-repeating)
            Timer timer = new Timer(3000, e -> {
                splash.hide();
                System.out.println("Main application started!");
            });
            timer.setRepeats(false); // Ensure it runs only once
            timer.start();
        });
    }
}
