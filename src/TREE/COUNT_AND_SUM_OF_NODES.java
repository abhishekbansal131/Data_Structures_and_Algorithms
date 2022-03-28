package TREE;
import TREE.BINARY_TREE.Binary_Tree;

/* NODE CLASS STRUCTURE & BUILDING TREE
class Node<T>{
    T data;
    Node<T> left;
    Node<T> right;

    public Node(T data) {
        this.data = data;
    }
}
static class Binary_Tree {
        int idx = -1;

        public Node<Integer> buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) return null;
            Node<Integer> newnode = new Node<>(nodes[idx]);
            newnode.left = buildTree(nodes); // creat left sub-tree
            newnode.right = buildTree(nodes); // creat right sub-tree
            return newnode; // returning root node
        }
}
 */

public class COUNT_AND_SUM_OF_NODES {
    public int count(Node<Integer> root){
        if(root == null) return 0;
        return count(root.left) + count(root.right) + 1;
    }
    public int sum(Node<Integer> root){
        if(root == null) return 0;
        return sum(root.left) + sum(root.right) + root.data;
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        COUNT_AND_SUM_OF_NODES obj = new COUNT_AND_SUM_OF_NODES();
        System.out.println(obj.count(new Binary_Tree().buildTree(nodes)));
        System.out.println(obj.sum(new Binary_Tree().buildTree(nodes)));
    }
}
