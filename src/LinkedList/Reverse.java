package LinkedList;

class Node10<T>{
    T data;
    Node10<T> next;
    public Node10(T data){
        this.data = data;
    }
}
public class Reverse {
    Node10<Integer> head;
    public void insertAtLAst(Node10<Integer> n){
        if(head == null) head = n;
        else{
            Node10<Integer> temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = n;
        }
    }
    // Iterative Approach
    public void rev(){
        Node10<Integer> temp = head, prev = null, n;
        while(temp != null){
            n = temp.next;
            temp.next = prev;
            prev = temp;
            temp = n;
        }
        head = prev;
    }
    //RECURSIVE APPROACH TO REVERSE A LINKED LIST
    public Node10<Integer> rev2(Node10<Integer> head){
        if(head == null) return head;
        if (head.next == null) return head;
        Node10<Integer> n = rev2(head.next);
        head.next.next = head;
        head.next = null;
        return n;
    }
    public void display(){
        //rev2(head);
        if(head == null) System.out.println("EMPTY");
        else {
            Node10<Integer> temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Reverse obj = new Reverse();
        obj.insertAtLAst(new Node10<>(1));
        obj.insertAtLAst(new Node10<>(2));
        obj.insertAtLAst(new Node10<>(3));
        obj.insertAtLAst(new Node10<>(4));
        obj.insertAtLAst(new Node10<>(5));
        //obj.rev();
        obj.head = obj.rev2(obj.head);
        obj.display();
    }
}
