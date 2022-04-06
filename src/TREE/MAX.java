package TREE;
import TREE.BINARY_SEARCH_TREE.BTree;

/* NODE CLASS STRUCTURE & BUILDING TREE
class Node<T>{
    T data;
    Node<T> left;
    Node<T> right;

    public Node(T data) {
        this.data = data;
    }
}
// BUILDING OF BINARY SEARCH TREE
static class BTree{
        public Node<Integer> build_tree(Node<Integer> n, int val){
            if(n == null){
                return new Node<>(val);
            }
            if(val < n.data) n.left = build_tree(n.left, val);
            else n.right = build_tree(n.right, val);
            return n;
        }
    }
 */

public class MAX {
    int m;
    public void max(Node<Integer> root){
        if(root == null) return;
        max(root.right);
        int k = root.data;
        root.data = m;
        m += k;
        max(root.left);
    }

    public static void main(String[] args) {
        BTree obj2 = new BTree();
        int[] nodes  = {30,20,40,50,35};
        Node<Integer> root = null;
        for(int i : nodes)
            root =  obj2.build_tree(root, i);
        MAX obj = new MAX();
        obj.max(root);
        new BINARY_SEARCH_TREE().preOrder(root);
    }
}
