package GUI;
import java.awt.*;
import javax.swing.*;
class TestSolution extends JFrame{
    JFrame frm1;
    JLabel lbl_num1, lbl_num2,lbl_ans;
    JTextField txt_num1, txt_num2,txt_ans;
    JButton btn_add, btn_exit;
    FlowLayout f1;
    TestSolution(){

        frm1 = new JFrame("Welcome to JAVA frame");
        lbl_num1 = new JLabel("Num1");
        lbl_num2 = new JLabel("Num2");
        lbl_ans = new JLabel("Ans");

        txt_num1 = new JTextField(20);
        txt_num2 = new JTextField(20);
        txt_ans = new JTextField(20);

        btn_add = new JButton("Add");
        btn_exit = new JButton("Exit");

        f1 = new FlowLayout();

        frm1.setLayout(f1);
        frm1.add(lbl_num1);
        frm1.add(txt_num1);
        frm1.add(lbl_num2);
        frm1.add(txt_num2);
        frm1.add(lbl_ans);
        frm1.add(txt_ans);
        frm1.add(btn_add);
        frm1.add(btn_exit);
        



        frm1.setVisible(true);
        frm1.setSize(600,600);
    }
}
public class TestGUI {
   public static void main(String[] args){
    TestSolution ts = new TestSolution();


   }
}

