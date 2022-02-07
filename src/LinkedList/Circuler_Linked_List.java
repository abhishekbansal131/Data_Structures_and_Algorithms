package LinkedList;

class Node6{
    int data;
    Node6 next;
    public Node6(int data){
        this.data = data;
    }
}
public class Circuler_Linked_List {
    Node6 head;
    public void creatLinkedList(){
        Node6 node1 = new Node6(10);
        Node6 node2 = new Node6(20);
        Node6 node3 = new Node6(30);
        Node6 node4 = new Node6(40);
        Node6 node5 = new Node6(60);

        head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = head;
    }
    public void insert_at_begin(Node6 n){
        if(head==null){
            head = n;
            n.next = n;
        }
        else{
            n.next = head;
            Node6 temp = head;
            while(temp.next != head) temp = temp.next;
            temp.next = n;
            head = n;
        }
    }
    public void insert_at_end(Node6 n){
        if(head == null) {
            head = n;
            n.next = n;
        }
        else{
            Node6 temp = head;
            while(temp.next != head) temp = temp.next;
            n.next = head;
            temp.next = n;
        }
    }
    public void insert_at_any(Node6 n, int pos){
        if(pos == 1) insert_at_begin(n);
        else if(pos == length()) insert_at_end(n);
        else {
            Node6 temp = head;
            for(int i=0; i<pos-2; i++){
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
        }
    }
    public void delete_at_end(){
        if (head == null) System.out.println("Empty linked list");
        else {
            Node6 temp = head;
            while(temp.next != head){
                temp = temp.next;
                if(temp.next.next == head) break;
            }
            temp.next = head;
        }
    }
    public void delete_from_begin(){
        if (head == null) System.out.println("Empty linked list");
        else {
            Node6 temp = head;
            while(temp.next != head) temp = temp.next;
            temp.next = head.next;
            head = head.next;
        }
    }
    public void delete_from_any(int pos){
        if(pos == 1) delete_from_begin();
        else if(pos == length()) delete_at_end();
        else {
            Node6 temp = head;
            for(int i=0 ;i<pos-2; i++) temp = temp.next;
            temp.next = temp.next.next;
        }
    }
    public int length(){
        if(head == null) return 0;
        else {
            int c=1;
            Node6 temp = head;
            while(temp.next!=head){
                c++;
                temp = temp.next;
            }
            return c;
        }
    }
    public void display(){
        if(head==null) System.out.println("Empty linked list");
        else {
            Node6 temp = head;
            while(temp.next!=head){
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }


    public static void main(String[] args) {
        Circuler_Linked_List obj = new Circuler_Linked_List();
        obj.creatLinkedList();
        obj.insert_at_end(new Node6(100));
        obj.insert_at_begin(new Node6(12));
        obj.insert_at_any(new Node6(45),3);
        obj.delete_at_end();
        obj.delete_from_begin();
        obj.delete_from_any(3);
        obj.display();
        System.out.println(obj.length());
    }
}