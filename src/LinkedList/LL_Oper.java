package LinkedList;

class Node1{
    int data;
    Node1 next;
    public Node1(int data) {
        this.data = data;
    }
}

public class LL_Oper {
    Node1 head;
    public void insert_at_last(Node1 n){
        if(head==null){
            head = n;
        }
        else {
            Node1 temp =head;
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    public void insert_at_begin(Node1 n){
        n.next = head;
        head = n;
    }

    public void insert_at_any(Node1 n, int pos){
        Node1 temp = head;
        for(int i=0; i<pos-2; i++){
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
    }

    public void delete_from_begin(){
        if(head == null) System.out.println("Empty linked list");
        else {
            head = head.next;
        }
    }

    public void delete_from_end(){
        if(head == null) System.out.println("Empty linked list");
        else{
            Node1 temp = head;
            while (temp!=null){
                temp = temp.next;
                if(temp.next.next == null) break;
            }
            temp.next = null;
        }
    }

    public void delete_from_any(int pos){
        Node1 temp = head;
        for(int i=0; i<pos-2; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void display(){
        if(head == null) System.out.println("Empty linked List");
        else{
            Node1 temp = head;
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {
        LL_Oper obj = new LL_Oper();
        Node1 node1 = new Node1(10);
        Node1 node2 = new Node1(20);
        Node1 node3 = new Node1(30);
        Node1 node4 = new Node1(40);
        obj.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        //obj.insert_at_last(new Node1(7));
        //obj.insert_at_begin(new Node1(1));
        //obj.delete_from_begin();
        //obj.insert_at_any(new Node1(100),3);
        //obj.delete_from_any(3);
        obj.display();
    }
}
