package Tree;



import java.util.LinkedList;

import java.util.Queue;


public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(){

    }

    public TreeNode(int value){
        this.value = value;
    }

    public TreeNode(int value, TreeNode left, TreeNode right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    class FindSuccesor{
        public TreeNode findsuccessor(TreeNode root, int key){
            if(root==null){
                return null;

            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while(!queue.isEmpty()){
                int levelSize = queue.size();
                    TreeNode CurrentNode = queue.poll();

                    if(CurrentNode.left != null){
                        queue.offer(CurrentNode.left);
                    }
                    if(CurrentNode.right != null){
                        queue.offer(CurrentNode.right);
                    }
                    if(CurrentNode.value == key){
                        break;
                    }
                }

                return queue.peek();

           
            }

        
    }
}
