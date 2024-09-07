package GUI;
import java.awt.event.*;
import javax.swing.*;

class TestFrame implements ActionListener {
    JFrame frm1;
    JLabel lbl_num1, lbl_num2, lbl_ans;
    JTextField txt_num1, txt_num2, txt_ans;
    JButton btn_add, btn_sub, btn_multi, btn_div;

    TestFrame(){
        frm1 = new JFrame("Calculator");
        lbl_num1 = new JLabel("Num 1");
        lbl_num2 = new JLabel("Num 2");
        lbl_ans = new JLabel("Ans");

        txt_num1 = new JTextField(20);
        txt_num2 = new JTextField(20);
        txt_ans = new JTextField(20);

        btn_add = new JButton("Add");
        btn_sub = new JButton("Sub");
        btn_multi = new JButton("Multi");
        btn_div = new JButton("Div");

        frm1.setLayout(new java.awt.FlowLayout());

        frm1.add(lbl_num1);
        frm1.add(txt_num1);
        frm1.add(lbl_num2);
        frm1.add(txt_num2);
        frm1.add(lbl_ans);
        frm1.add(txt_ans);
        frm1.add(btn_add);
        frm1.add(btn_sub);
        frm1.add(btn_multi);
        frm1.add(btn_div);

        btn_add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int v1, v2, ans;
                v1 = Integer.parseInt(txt_num1.getText());
                v2 = Integer.parseInt(txt_num2.getText());
                ans = v1 + v2;
                txt_ans.setText(String.valueOf(ans));
            }
        });

        btn_sub.addActionListener(this);
        btn_multi.addActionListener(this);
        btn_div.addActionListener(this);

        frm1.setSize(300, 200);
        frm1.setVisible(true);
        frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int v1, v2, ans;
        v1 = Integer.parseInt(txt_num1.getText());
        v2 = Integer.parseInt(txt_num2.getText());

        if (e.getSource() == btn_sub) {
            ans = v1 - v2;
            txt_ans.setText(String.valueOf(ans));
        } else if (e.getSource() == btn_multi) {
            ans = v1 * v2;
            txt_ans.setText(String.valueOf(ans));
        } else if (e.getSource() == btn_div) {
            if (v2 != 0) {
                ans = v1 / v2;
                txt_ans.setText(String.valueOf(ans));
            } else {
                txt_ans.setText("Error: Div by 0");
            }
        }
    }
}

public class Adapter {
    public static void main(String[] args){
        TestFrame fm = new TestFrame();
    }
}
 