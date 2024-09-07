import java.util.Arrays;

public class VarArgs {
    public static void main(String [] args){
        fun(2,3,4,5,45,64,34,53); 
       }

    static void fun(int ...v){ //creates variable length arguments
        System.out.println(Arrays.toString(v));
    }

}

