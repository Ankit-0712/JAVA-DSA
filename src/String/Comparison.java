package String;

public class Comparison {
    public static void main(String[] args){
        //String a = "ankit";
        //String b  = "ankit";
        //a==b -> true

        String a = new String("Ankit");
        String b = new String("Ankit");
        System.out.println(a==b);// false
        System.out.println(a.equals(b)); //in that case it only compare the values so the result is true
        System.out.println(a.compareTo(b));

        System.out.println(a.charAt(3)); //i
        

       
    }
}
