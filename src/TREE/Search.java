package TREE;
import TREE.BINARY_SEARCH_TREE.BTree;

import java.util.ArrayList;
import java.util.Collections;

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

public class Search {
    public boolean search(Node<Integer> root, int val){
        if(root == null) return false;
        if(root.data == val) return true;
        if(val<root.data) {
            return search(root.left, val);
        }
        else return search(root.right, val);
    }
    ArrayList<Integer> a = new ArrayList<>();
    public boolean path(Node<Integer> root, int val){
        if(root == null) return false;
        if(root.data == val){
            a.add(root.data);
            return true;
        }
        a.add(root.data);
        if(val<root.data) {
            return path(root.left, val);
        }
        else return path(root.right, val);
    }
    public static void main(String[] args) {
        BTree obj2 = new BTree();
        int[] nodes  = {15,6,18,3,10,12,5};
        Node<Integer> root = null;
        for(int i : nodes)
            root =  obj2.build_tree(root, i);
        Search obj3 = new Search();
        System.out.println(obj3.search(root, 4));
        if(obj3.path(root,10)) {
            Collections.reverse(obj3.a);
            System.out.println(obj3.a);
        }
        else System.out.println("Element not found");
    }
}
