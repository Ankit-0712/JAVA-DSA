package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationPage extends JFrame implements ActionListener {

    private Container container;
    private JLabel titleLabel, nameLabel, emailLabel, passwordLabel, confirmPasswordLabel;
    private JTextField nameField, emailField;
    private JPasswordField passwordField, confirmPasswordField;
    private JButton registerButton, resetButton;

    public RegistrationPage() {
        setTitle("Registration Page");
        setBounds(300, 90, 500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        titleLabel = new JLabel("Register Here");
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        titleLabel.setSize(200, 30);
        titleLabel.setLocation(180, 30);
        container.add(titleLabel);

        nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        nameLabel.setSize(100, 20);
        nameLabel.setLocation(100, 100);
        container.add(nameLabel);

        nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.PLAIN, 15));
        nameField.setSize(190, 20);
        nameField.setLocation(200, 100);
        container.add(nameField);

        emailLabel = new JLabel("Email:");
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        emailLabel.setSize(100, 20);
        emailLabel.setLocation(100, 150);
        container.add(emailLabel);

        emailField = new JTextField();
        emailField.setFont(new Font("Arial", Font.PLAIN, 15));
        emailField.setSize(190, 20);
        emailField.setLocation(200, 150);
        container.add(emailField);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordLabel.setSize(100, 20);
        passwordLabel.setLocation(100, 200);
        container.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordField.setSize(190, 20);
        passwordField.setLocation(200, 200);
        container.add(passwordField);

        confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        confirmPasswordLabel.setSize(140, 20);
        confirmPasswordLabel.setLocation(50, 250);
        container.add(confirmPasswordLabel);

        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setFont(new Font("Arial", Font.PLAIN, 15));
        confirmPasswordField.setSize(190, 20);
        confirmPasswordField.setLocation(200, 250);
        container.add(confirmPasswordField);

        registerButton = new JButton("Register");
        registerButton.setFont(new Font("Arial", Font.PLAIN, 15));
        registerButton.setSize(100, 20);
        registerButton.setLocation(150, 300);
        registerButton.addActionListener(this);
        container.add(registerButton);

        resetButton = new JButton("Reset");
        resetButton.setFont(new Font("Arial", Font.PLAIN, 15));
        resetButton.setSize(100, 20);
        resetButton.setLocation(270, 300);
        resetButton.addActionListener(this);
        container.add(resetButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            String name = nameField.getText();
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());

            if (password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(this, "Registration Successful");
                // Here you can add further actions like saving the data
            } else {
                JOptionPane.showMessageDialog(this, "Passwords do not match");
            }
        } else if (e.getSource() == resetButton) {
            nameField.setText("");
            emailField.setText("");
            passwordField.setText("");
            confirmPasswordField.setText("");
        }
    }

    public static void main(String[] args) {
        new RegistrationPage();
    }
}
