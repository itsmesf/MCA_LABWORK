package LMS;

import java.awt.*;
import java.awt.color.*;
import javax.swing.*;
import java.util.Scanner;

public class MyFirstSwingApp extends JFrame{

    public MyFirstSwingApp(){
        initUI ();
    }

    private void initUI() {
        setTitle("Swing Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        // Panel to hold form components
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Padding between components
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel userLabel = new JLabel("Username:");
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(userLabel, gbc);

        JTextField usernameField = new JTextField(15);
        gbc.gridx = 1;
        panel.add(usernameField, gbc);

        JLabel passLabel = new JLabel("Password:");
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(passLabel, gbc);

        JPasswordField passwordField = new JPasswordField(15);
        gbc.gridx = 1;
        panel.add(passwordField, gbc);

        JButton loginButton = new JButton("Login");
        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2;
        panel.add(loginButton, gbc);

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
    public static void main ( String[] args ) {

        SwingUtilities.invokeLater ( ()->new MyFirstSwingApp() );

    }
}
