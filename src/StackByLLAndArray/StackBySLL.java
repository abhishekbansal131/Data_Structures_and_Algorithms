package StackByLLAndArray;
import Nodes.Node;

public class StackBySLL {
    Node top;
    public boolean isEmpty(){
        return top == null;
    }
    public void push(int data){
        Node n = new Node();
        n.setData(data);
        n.setNext(top);
        top = n;
    }
    public void pop(){
        if(isEmpty()) System.out.println("Empty stack");
        else top = top.getNext();
    }
    public void traverse(){
        if(isEmpty()) System.out.println("Empty stack");
        else {
            Node temp = top;
            while (temp != null) {
                System.out.println(temp.getData());
                temp = temp.getNext();
            }
        }
    }
}
