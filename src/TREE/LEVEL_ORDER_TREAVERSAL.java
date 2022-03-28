package TREE;
import TREE.BINARY_TREE.Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LEVEL_ORDER_TREAVERSAL {
    public void levelOrder(Node<Integer> root){
        if(root == null) return;
        Queue<Node<Integer>> a = new LinkedList<>();
        a.add(root);
        a.add(null);
        while(!a.isEmpty()){
            Node<Integer> currNode = a.remove();
            if(currNode == null){
                System.out.println();
                if(a.isEmpty()){
                   break;
                }
                else {
                    a.add(null);
                }
            }
            else {
                System.out.print(currNode.data + " ");
                if(currNode.left != null) a.add(currNode.left);
                if(currNode.right != null) a.add(currNode.right);
            }
        }
    }
    public static void main(String[] args) {
        LEVEL_ORDER_TREAVERSAL obj = new LEVEL_ORDER_TREAVERSAL();
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        obj.levelOrder(new Binary_Tree().buildTree(nodes));
    }
}
