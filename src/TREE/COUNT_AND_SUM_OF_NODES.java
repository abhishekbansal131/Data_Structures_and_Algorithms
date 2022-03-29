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
    public int hieght(Node<Integer> root){
        if(root == null) return 0;
        return Math.max(hieght(root.left)+1, hieght(root.right)+1);
    }
    // Approach 1 for finding diameter with O(n^2)
    public int Diameter(Node<Integer> root){
        if(root == null) return 0;
        int d1 = Diameter(root.left);
        int d2 = Diameter(root.right);
        int d3 = hieght(root.right) + hieght(root.left) + 1;
        return Math.max(d3, Math.max(d1,d2));
        //return Math.max(hieght(root.right) + hieght(root.left) +1 , Math.max(Diameter(root.left), Diameter(root.right)));
    }
    // Approach 2 for finding diameter with O(n) by finding height and diameter simultaneously using one static class
    static class TreeInfo{
        int h;
        int d;

        public TreeInfo(int h, int d) {
            this.h = h;
            this.d = d;
        }
    }
    public TreeInfo Diam2(Node<Integer> root){
        if(root == null) return new TreeInfo(0,0);
        TreeInfo left = Diam2(root.left);
        TreeInfo right = Diam2(root.right);
        int ht = Math.max(left.h, right.h) + 1;
        int d1 = left.d;
        int d2 = right.d;
        int d3 = left.h + right.h + 1;
        int d = Math.max(d3, Math.max(d1,d2));
        return new TreeInfo(ht, d);
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        COUNT_AND_SUM_OF_NODES obj = new COUNT_AND_SUM_OF_NODES();
        System.out.println(obj.count(new Binary_Tree().buildTree(nodes)));
        System.out.println(obj.sum(new Binary_Tree().buildTree(nodes)));
        System.out.println(obj.hieght(new Binary_Tree().buildTree(nodes)));
        System.out.println(obj.Diameter(new Binary_Tree().buildTree(nodes)));
        System.out.println(obj.Diam2(new Binary_Tree().buildTree(nodes)).d);
    }
}
