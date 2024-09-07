class Emp{
    int id;
    int salary;
    //static variable;
    static String ceo; //it will be same for all the objects

    static{ //static block
       ceo = "Larry"; 
       System.out.println("in static");
    }

    Emp(int id, int salary){ 
        this.id = id;
        this.salary = salary; 
       
       System.out.println("in constructor");
        
    }

    public void show(){
        System.out.println(id + " : " + salary +" : " + ceo);
    }

}
public class StaticDemo {
    public static void main(String [] args){
        Emp emp1  = new Emp(9,4000);
        Emp emp2 = new Emp(5,5000);

        emp1.show();
        emp2.show();

    }
}
