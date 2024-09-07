package Tree;

public class SegmentTree {
    private static class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public SegmentTree(int[] arr){
        // Create a tree using this array
        this.root = constructTree(arr, 0, arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end){
        if(start == end){
            // Leaf node
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        // Create new node with the current interval
        Node node = new Node(start, end);
        int mid = (start + end) / 2;

        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid+1, end);

        node.data = node.left.data + node.right.data;

        return node;
    }

    public void display(){
        display(this.root);
    }

    private void display(Node node){
        if(node == null){
            return;
        }

        String str = "";

        if(node.left != null){
            str += "Interval = [" + node.left.startInterval + "-" + node.left.endInterval + "] and data : " + node.left.data + " => ";
        } else {
            str += "No left child => ";
        }

        str += "Interval = [" + node.startInterval + "-" + node.endInterval + "] and data : " + node.data + " <= ";

        if(node.right != null){
            str += "Interval = [" + node.right.startInterval + "-" + node.right.endInterval + "] and data : " + node.right.data + " => ";
        } else {
            str += "No right child";
        }

        System.out.println(str);

        // Recurse for left and right children
        display(node.left);
        display(node.right);
    }

    // Query method to get the sum in a given range
    public int query(int qsi, int qei){
        return this.query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei){
        if(node == null){
            return 0;
        }

        if(node.startInterval >= qsi && node.endInterval <= qei){
            // Node is completely inside the query range
            return node.data;
        } else if(node.endInterval < qsi || node.startInterval > qei){
            // Node is completely outside the query range
            return 0;
        } else {
            // Partial overlap of the node interval with the query range
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

    // Update method to update the value at a specific index
    public void update(int index, int value){
        this.update(this.root, index, value);
    }

    private int update(Node node, int index, int value){
        if(node.startInterval == node.endInterval){
            // Leaf node
            node.data = value;
            return node.data;
        }

        int mid = (node.startInterval + node.endInterval) / 2;

        if(index <= mid){
            update(node.left, index, value);
        } else {
            update(node.right, index, value);
        }

        node.data = node.left.data + node.right.data;
        return node.data;
    }

    public static void main(String[] args){
        int[] arr = {3,8,6,7,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);
        tree.display();

        System.out.println("Query result for range [2, 5]: " + tree.query(2, 5));
        tree.update(4, 10);
        System.out.println("After updating index 4 to 10:");
        tree.display();
    }
}
