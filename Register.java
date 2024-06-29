import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Register {
    JTextField textField;
    JPasswordField jPasswordField, confirmPasswordField;

    Register() {
        Frame f = new Frame("Panel Example");

        // Handle window closing event
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Panel panel = new Panel();
        panel.setBackground(new Color(182, 222, 184));
        panel.setLayout(new GridBagLayout());
        // Use GridBagLayout for panel

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(40, 10, 10, 10); // Add padding between components

        // Add heading label
        JLabel headerLabel = new JLabel("Sign Up");
        headerLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        headerLabel.setForeground(Color.BLACK);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(headerLabel, gbc);

        // Add labels and text fields
        JLabel namelabel = new JLabel("Username");
        namelabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        namelabel.setForeground(Color.BLACK);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(namelabel, gbc);

        textField = new JTextField(15);
        textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(textField, gbc);

        JLabel passwordLabel = new JLabel("Create Password");
        passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        passwordLabel.setForeground(Color.BLACK);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(passwordLabel, gbc);

        jPasswordField = new JPasswordField(15);
        jPasswordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(jPasswordField, gbc);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password");
        confirmPasswordLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        confirmPasswordLabel.setForeground(Color.BLACK);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(confirmPasswordLabel, gbc);

        confirmPasswordField = new JPasswordField(15);
        confirmPasswordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(confirmPasswordField, gbc);

        // Add buttons
        JButton b1 = new JButton("Sign Up");
        b1.setFont(new Font("serif", Font.BOLD, 15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(b1, gbc);

        JButton b2 = new JButton("Cancel");
        b2.setFont(new Font("serif", Font.BOLD, 15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(b2, gbc);

        // Add "Have an account?" label
        JLabel haveAccountLabel = new JLabel("<html> HAVE YOU  AN ACCOUNT ? <span style='color:blue;'>LOGIN</span></html>");
        haveAccountLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        haveAccountLabel.setForeground(Color.BLACK);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(haveAccountLabel, gbc);


        // Add panel to frame and set frame properties
        f.add(panel);
        f.setSize(400, 400); // Adjusted size to better fit components
        f.setLayout(null);
        f.setBackground(new Color(250, 249, 246));
        panel.setBounds(400, 100, 450, 450); // Adjust panel bounds to fit the frame
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new Register();
    }
}
