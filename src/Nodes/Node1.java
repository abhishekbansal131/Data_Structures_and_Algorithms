package Nodes;

public class Node1 {
    private int data;
    private Node1 next, prev;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node1 getNext() {
        return next;
    }

    public void setNext(Node1 next) {
        this.next = next;
    }

    public Node1 getPrev() {
        return prev;
    }

    public void setPrev(Node1 prev) {
        this.prev = prev;
    }
}
