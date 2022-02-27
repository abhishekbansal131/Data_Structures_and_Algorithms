package StackByLLAndArray;

import java.util.Scanner;

class Node{
    char data;
    Node next;

    public Node(char data) {
        this.data = data;
    }
}
class BB {
    Node top;
    public boolean isEmpty(){
        return top == null;
    }
    public void push(char d){
        Node n = new Node(d);
        if(top != null) n.next = top;
        top = n;
    }
    public void pop(){
        if(isEmpty()) System.out.println(("Stack overflow"));
        else top = top.next;
    }
    public char peek(){
        return top.data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BB obj = new BB();
        String s = sc.next();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') obj.push(s.charAt(i));
            else if(!obj.isEmpty() && ((s.charAt(i)==']' && obj.peek() == '[') || (s.charAt(i)=='}' && obj.peek() == '{') || (s.charAt(i)==')' && obj.peek() == '('))) obj.pop();
            else obj.push(s.charAt(i));
        }
        if(obj.isEmpty()) System.out.println("Balanced");
        else System.out.println("Not balanced");
    }
}

