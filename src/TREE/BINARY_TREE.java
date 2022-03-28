package TREE;

class Node<T>{
    T data;
    Node<T> left;
    Node<T> right;

    public Node(T data) {
        this.data = data;
    }
}
public class BINARY_TREE {
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
    public void preorder(Node<Integer> root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public void inorder(Node<Integer> root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public void postorder(Node<Integer> root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        BINARY_TREE obj = new BINARY_TREE();
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; // -1 is representing null here
        obj.preorder(new Binary_Tree().buildTree(nodes));
        System.out.println();
        obj.inorder(new Binary_Tree().buildTree(nodes));
        System.out.println();
        obj.postorder(new Binary_Tree().buildTree(nodes));
    }
}
