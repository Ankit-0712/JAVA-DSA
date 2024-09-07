package Queue;

public class CircularQueue {
    protected int[] data;
    private static final int default_size = 10;

   protected int end = 0;
    protected int front = 0;
    private int size = 0;


    public CircularQueue(){
        this(default_size);
    }
    public CircularQueue(int Size) {
        this.data = new int[Size];
    }

    public boolean isFull(){
        return size == data.length-1;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        data[end] = item;
        end = end % data.length;
        size++;
        end++;
        return true;
    }

    public int remove()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        int removed = data[front++];

        front = front % data.length;
        size++;

        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        return data[front];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Empty");

            return;
        }
        int i = front;
        do{
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        }while(i != end);
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception{
        CircularQueue cqueue = new CircularQueue(5);
        
        cqueue.insert(3);
        cqueue.insert(4);
        cqueue.insert(5);
        cqueue.insert(6);

        cqueue.display();
        System.out.println(cqueue.remove());
        cqueue.insert(133);
        cqueue.display();
    }

}
