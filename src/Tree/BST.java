package Tree;

public class BST {
    class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }

    }
    private Node root;

    public BST(){

    }

    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
        
    }

    public void insert(int value){
        root = insert(root, value);
    }

    public Node insert(Node node,int value){
        if(node==null){
            return new Node(value);
        }
        if(value<node.value){
            node.left = insert(node.left, value);
        }else if(value> node.value){
            node.right = insert(node.right, value);
        }

        node.height = Math.max(height(node.left), height(node.right)) +1;
        return node;

        
    }

    public void display(){
        display(root , "Root Node: ");
    }

    private void display(Node node, String details){
        if(node==null){
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left , "This is left child of node " +node.getValue() +" : ");
        display(node.right, "This is right child of node " + node.getValue() + " :");
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node== null){
            return true;
        }

        return Math.abs(height(node.left)- height(node.right)) <=  1 && balanced(node.left) && balanced(node.right);
    }

    public void populate(int[] nums){
        for(int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }

    public void populatedSorted(int[] nums){
        populatedSorted(nums, 0, nums.length);
    }

    private void populatedSorted(int[] nums, int start, int end){
         if(start>=end){
            return;
         }

         int mid = (start + end)/2;

         this.insert(nums[mid]);

         populatedSorted(nums, start, mid);
         populatedSorted(nums, mid+1, end);

    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.value + "root");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value+ "root");
        inOrder(root.right);

    }

    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node){
        if(node==null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value+"root");
    }

    public static void main(String[] args){
        BST tree = new BST();
        int[] nums = {10,12,13,15,20};
        tree.populatedSorted(nums);
        tree.display();
      

    }

}
