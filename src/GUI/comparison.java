package GUI;
import java.awt.event.*;
import javax.swing.*;

class Testing implements ActionListener{
    JFrame frm1;
    JLabel lbl_num1, lbl_num2,lbl_ans;
    JTextField txt_num1, txt_num2,txt_ans;
    JButton btn_greater, btn_less;
    
    Testing(){

    frm1 = new JFrame("Welcome to JAVA frame");
    lbl_num1 = new JLabel("Num1");
    lbl_num2 = new JLabel("Num2");
    lbl_ans = new JLabel("Ans");

    txt_num1 = new JTextField(20);
    txt_num2 = new JTextField(20);
    txt_ans = new JTextField(20);

    btn_greater = new JButton("greater");
    btn_less = new JButton("less");

    frm1.setLayout(new java.awt.FlowLayout());



    frm1.add(lbl_num1);
    frm1.add(txt_num1);
    frm1.add(lbl_num2);
    frm1.add(txt_num2);
    frm1.add(lbl_ans);
    frm1.add(txt_ans);
    frm1.add(btn_greater);
    frm1.add(btn_less);

    btn_greater.addActionListener(this);
        btn_less.addActionListener(this);

    frm1.setVisible(true);
    frm1.setSize(600,600);

    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(txt_num1.getText());
            double num2 = Double.parseDouble(txt_num2.getText());

            if (e.getSource() == btn_greater) {
                if (num1 > num2) {
                    txt_ans.setText("Num1 is greater");
                } else {
                    txt_ans.setText("Num2 is greater");
                }
            } else if (e.getSource() == btn_less) {
                if (num1 < num2) {
                    txt_ans.setText("Num1 is less");
                } else {
                    txt_ans.setText("Num2 is less");
                }
            }
        } catch (NumberFormatException ex) {
            txt_ans.setText("Invalid input");
        }
    }
}
public class comparison {
    public static void main(String[] args) {
        Testing t1 = new Testing();
    }
    
}
