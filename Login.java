import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login {
    JTextField textField;
    JPasswordField jPasswordField;

    Login() {
        Frame f = new Frame("Panel Example");

        // Handle window closing event
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Panel panel = new Panel();
        panel.setBackground(new Color(182, 222, 184));
        panel.setForeground(Color.BLACK);
        panel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(40, 20, 20, 20); // Add padding between components

        // Add header label
        JLabel headerLabel = new JLabel("LOGIN");

        headerLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
        headerLabel.setForeground(Color.BLACK);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(headerLabel, gbc);

        // Add labels and text fields
        JLabel namelabel = new JLabel("Username");
        namelabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        namelabel.setForeground(Color.BLACK);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(namelabel, gbc);

        textField = new JTextField(20);
        textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(textField, gbc);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        passwordLabel.setForeground(Color.BLACK);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(passwordLabel, gbc);

        jPasswordField = new JPasswordField(20);
        jPasswordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(jPasswordField, gbc);

        // Add forgot password label
        JLabel forgotPasswordLabel = new JLabel("FORGOT PASSWORD?");
        forgotPasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        forgotPasswordLabel.setForeground(Color.BLUE);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(forgotPasswordLabel, gbc);

        // Add buttons
        JButton b2 = new JButton("     CANCLE     ");
        b2.setFont(new Font("serif", Font.BOLD, 15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(b2, gbc);


        // Add buttons
        JButton b1 = new JButton("     LOGIN     ");
        b1.setFont(new Font("serif", Font.BOLD, 15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(b1, gbc);






        // Add "DONT HAVE ACCOUNT? SIGN UP" label
        JLabel signUpLabel = new JLabel("<html>DONT HAVE ACCOUNT? <span style='color:blue;'>SIGN UP</span></html>");
        signUpLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        signUpLabel.setForeground(Color.BLACK); // Set default color for the rest of the text
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(signUpLabel, gbc);


        // Add panel to frame and set frame properties
        f.add(panel);
        f.setSize(400, 400); // Adjusted size to better fit components
        f.setLayout(null);
        f.setBackground(new Color(250, 249, 246) );
        panel.setBounds(400, 100, 500, 500); // Adjust panel bounds to fit the frame

        f.setVisible(true);
    }

    public static void main(String args[]) {
        new Login();
    }
}
