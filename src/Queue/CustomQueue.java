package Queue;

public class CustomQueue {
    private int[] data;
    private static final int default_size = 10;

    int end = 0;
    public CustomQueue(){
        this(default_size);
    }
    public CustomQueue(int Size) {
        this.data = new int[Size];
    }

    public boolean isFull(){
        return end == data.length-1;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        data[end] = item;

        end++;
        return true;
    }

    public int remove()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        int removed = data[0];

        for(int i=1;i<end;i++){
            data[i-1] = data[i];

        }
        end--;

        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        return data[0];
    }

    public void display(){
        for(int i=0;i<end;i++){
            System.out.print(data[i] + " <- ");
        }

        System.out.println("End");
    }

    public static void main(String[] args) throws Exception{
        CustomQueue queue = new CustomQueue(5);

        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);

        queue.display();
        System.out.println(queue.remove());
        queue.display();

    }

}
