import java.util.*;
class emp{
    String emp_name;
    String emp_desg;
    String emp_salary;

    emp(String emp_name,String emp_desg, String emp_salary){
        this.emp_name = emp_name;
        this.emp_desg = emp_desg;
        this.emp_salary = emp_salary;
    }
    void get_input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name");
        emp_name = sc.nextLine();

        System.out.println("Enter emp desg");
        emp_desg = sc.nextLine();

        System.out.println("Enter emp salary");
        emp_salary = sc.nextLine();

    }
void display(){
    System.out.println(emp_name);
    System.out.println(emp_desg);
    System.out.println(emp_salary);
}

}
public class employee {
    public static void main(String [] args){
        emp obj_e1 = new emp("Amit", "Manager", "20,000");
        obj_e1.get_input();
        obj_e1.display();

    }
}
