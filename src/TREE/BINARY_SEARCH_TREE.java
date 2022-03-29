package TREE;

/* NODE CLASS STRUCTURE & BUILDING TREE
class Node<T>{
    T data;
    Node<T> left;
    Node<T> right;

    public Node(T data) {
        this.data = data;
    }
}
 */

public class BINARY_SEARCH_TREE {
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
    public void preOrder(Node<Integer> root){
        if(root == null) return;
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        BINARY_SEARCH_TREE obj = new BINARY_SEARCH_TREE();
        BTree obj2 = new BTree();
        int[] nodes  = {15,6,18,3,10,12,5};
        Node<Integer> root = null;
        for(int i : nodes)
            root =  obj2.build_tree(root, i);
        obj.preOrder(root);
    }
}
