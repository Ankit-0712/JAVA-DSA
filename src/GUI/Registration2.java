package GUI;

import java.awt.event.*;
import javax.swing.*;

class Registration implements ActionListener {
    JFrame frame;
    JLabel lbl_name, lbl_email, lbl_password, lbl_message;
    JTextField txt_name, txt_email;
    JPasswordField txt_password;
    JButton btn_register;

    Registration() {
        frame = new JFrame("Registration Page");
        
        lbl_name = new JLabel("Name");
        lbl_email = new JLabel("Email");
        lbl_password = new JLabel("Password");
        lbl_message = new JLabel();

        txt_name = new JTextField(20);
        txt_email = new JTextField(20);
        txt_password = new JPasswordField(20);

        btn_register = new JButton("Register");

        frame.setLayout(new java.awt.FlowLayout());

        frame.add(lbl_name);
        frame.add(txt_name);
        frame.add(lbl_email);
        frame.add(txt_email);
        frame.add(lbl_password);
        frame.add(txt_password);
        frame.add(btn_register);
        frame.add(lbl_message);

        btn_register.addActionListener(this);

        frame.setVisible(true);
        frame.setSize(300, 300);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_register) {
            String name = txt_name.getText();
            String email = txt_email.getText();
            String password = new String(txt_password.getPassword());

            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                lbl_message.setText("Please fill all fields");
            } else {
                lbl_message.setText("Registration Successful");
                // Printing the user input to console
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("Password: " + password);
            }
        }
    }
}

public class Registration2 {
    public static void main(String[] args) {
        new Registration();
    }
}
