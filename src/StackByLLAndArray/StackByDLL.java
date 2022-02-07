package StackByLLAndArray;
import Nodes.Node1;

public class StackByDLL {
    Node1 top;
    public boolean isEmpty() {
        return top == null;
    }
    public void push(int data){
        Node1 n = new Node1();
        n.setData(data);
        if(isEmpty()){
            top = n;
        }
        else {
            n.setNext(top);
            top.setPrev(n);
            top = n;
        }
    }
    public void pop(){
        if(isEmpty()) System.out.println("Empty Stack");
        else {
            if(top.getNext() == null) top = null;
            else {
                top.getNext().setPrev(null);
                top = top.getNext();
            }
        }
    }
    public void display(){
        if(top == null) System.out.println("Empty stack");
        else {
            Node1 temp = top;
            while(temp != null){
                System.out.println(temp.getData());
                temp = temp.getNext();
            }
        }
    }

}
