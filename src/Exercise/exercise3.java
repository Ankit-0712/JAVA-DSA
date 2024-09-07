package Exercise;

import java.util.Scanner;

class emp{
    String emp_no;
    String emp_name;
    String emp_desg;
    String emp_salary;

    emp(String emp_no, String emp_name, String emp_desg, String emp_salary){
        this.emp_no = emp_no;
        this.emp_name = emp_name;
        this.emp_desg = emp_desg;
        this.emp_salary = emp_salary;
    }

    void get_input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter emp no: ");
        emp_no = sc.nextLine();

        System.out.println("Enter emp name");
        emp_name = sc.nextLine();

        System.out.println("Enter emp desg ");
        emp_desg = sc.nextLine();

        System.out.println("Enter emp salary");
        emp_salary = sc.nextLine();
    }

    void display(){
        System.out.println(emp_no);
        System.out.println(emp_name);
        System.out.println(emp_desg);
        System.out.println(emp_salary);
    }

}
public class exercise3 {
    public static void main(String[] args){
        emp e1 = new emp("E001", "Aakash", "Manager", "25000");
        e1.get_input();
        e1.display();
    }
   


    
}
