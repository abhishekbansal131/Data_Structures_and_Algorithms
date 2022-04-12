package TREE;

import java.util.Scanner;

class Node1{
    int data, bf, h;
    Node1 left, right;
    public Node1(int data) {
        this.data = data;
    }
}
public class AVL_TREE {
    public static void update_height_and_balancing_factor(Node1 root){
        int lh = -1;
        int rh = -1;
        if(root.left != null) lh = root.left.h;
        if(root.right != null) rh = root.right.h;
        root.bf = lh - rh;
        root.h = Math.max(lh, rh) + 1;
    }
    public static Node1 rightRotation(Node1 A){
        Node1 B = A.left;
        Node1 B_right = B.right;
        B.right = A;
        A.left = B_right;
        update_height_and_balancing_factor(A);
        update_height_and_balancing_factor(B);
        return B;
    }
    public static Node1 leftRotation(Node1 A){
        Node1 B = A.right;
        Node1 B_left = B.left;
        B.left = A;
        A.right = B_left;
        update_height_and_balancing_factor(A);
        update_height_and_balancing_factor(B);
        return B;
    }
    public static Node1 getRotation(Node1 root){
        update_height_and_balancing_factor(root);
        if(root.bf == 2){
            if(root.left.bf == 1) return rightRotation(root);
            else {
                root.left = leftRotation(root.left);
                return rightRotation(root);
            }
        }
        else if(root.bf == -2){
            if(root.right.bf == -1) return leftRotation(root);
            else {
                root.right = rightRotation(root.right);
                return leftRotation(root);
            }
        }
        return root;
    }
    public static Node1 insert(Node1 root, Node1 n){
        if(root == null) return n;
        else if(n.data < root.data){
            if(root.left == null) root.left = n;
            else  root.left = insert(root.left, n);
        }
        else if(n.data > root.data){
            if(root.right == null) root.right = n;
            else root.right = insert(root.right, n);
        }
        root = getRotation(root);
        return root;
    }
    public static void display(Node1 root){
        if(root== null)
        {
            return;
        }
        String str ="";
        str += root.left!= null?root.left.data+" " : ".";
        str+="< -"+ root.data+"->";
        str+=  root.right!= null?root.right.data+" " : ".";
        System.out.println(str);
        display(root.left);
        display(root.right);
    }
    public static void pre(Node1 root){
        if(root == null) return;
        System.out.println(root.data);
        pre(root.left);
        pre(root.right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node1 root = null;
        for(int i=0; i<6; i++){
            root = insert(root, new Node1(sc.nextInt()));
        }
        System.out.println("display data");
        pre(root);
        display(root);
    }
}
