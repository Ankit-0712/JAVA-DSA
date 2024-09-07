package Stack;

public class CustomStack {

        protected int[] data;
        private static final int default_size = 10;
        int ptr = -1;

        public CustomStack(){
            this(default_size);
        }

        public CustomStack(int size){
            this.data = new int[size];
        }

        public boolean push(int item){
            if(isFull()){
                return false;
            }
            ptr++;
            data[ptr] = item;

            return true;
        }

        public boolean isFull(){
            return ptr == data.length-1;
        }
        public boolean isEmpty(){
            return ptr==-1;
        }

        public int pop() throws StackException{
            if(isEmpty()){
                throw new StackException("Can not pop from a empty stack!");
            }

            int remove = data[ptr];
            ptr--;
            return remove;
        }

        public int peek() throws StackException{
            if(isEmpty()){
                throw new StackException("Can not peek from an empty stack!");
            }
            return data[ptr];
        }

        public static void main(String[] args) throws StackException{
            CustomStack stack  = new CustomStack(5);
            stack.push(34);
            stack.push(2);
            stack.push(23);
            stack.push(56);
            stack.push(18);

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }



    
}
