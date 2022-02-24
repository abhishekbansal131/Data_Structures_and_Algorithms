package StackByLLAndArray;

import java.util.Scanner;

class Node0{
    char data;
    Node0 next;
    public Node0(char data) {
        this.data = data;
    }
}
public class PALINDROME {
    Node0 top;
    public boolean isEmpty(){
        return top == null;
    }
    public void push(Node0 n){
        if (!isEmpty()) {
            n.next = top;
        }
        top = n;
    }
    public char pop(){
        char a = top.data;
        top = top.next;
        return a;
    }
    public void display(){
        if(isEmpty()) System.out.println("STACK IS EMPTY");
        else {
            Node0 temp = top;
            while(temp != null) {
                System.out.print(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        PALINDROME obj = new PALINDROME();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder s1 = new StringBuilder();
        for(int i=0; i<s.length(); i++) obj.push(new Node0(s.charAt(i)));
        for(int i=0; i<s.length(); i++) s1.append(obj.pop());
        if(s1.toString().equals(s)) System.out.println("PALINDROME");
        else System.out.println("NOT  PALINDROME");
    }
}
