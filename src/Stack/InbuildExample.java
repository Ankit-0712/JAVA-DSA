package Stack;
import java.util.Stack;
public class InbuildExample {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(23);
        stack.push(28);
        stack.push(11);
        stack.push(7);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
