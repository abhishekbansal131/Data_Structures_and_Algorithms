package LinkedList;

class Nod{
    int data;
    Nod next, prev;

    public Nod(int data) {
        this.data = data;
    }
}
public class Doubly_Circuler_LL {
    Nod head;
    public void creat_Linked_List(){
        Nod n1 = new Nod(10);
        Nod n2 = new Nod(20);
        Nod n3 = new Nod(30);
        Nod n4 = new Nod(40);
        Nod n5 = new Nod(50);
        head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = head;
        n1.prev = n5;
        n2.prev = n1;
        n3.prev = n2;
        n4.prev = n3;
        n5.prev = n4;
    }
    public void insert_At_begin(Nod n){
        if(head == null){
            head = n;
            head.next = n;
            head.prev = n;
        }
        else {
            n.next = head;
            n.prev = head.prev;
            head.prev.next = n;
            head.prev = n;
            head = n;
        }
    }
    public void insert_at_end(Nod n){
        if(head == null) insert_At_begin(n);
        else {
            head.prev.next = n;
            n.prev = head.prev;
            n.next = head;
            head.prev = n;
        }
    }
    public void insert_at_any(Nod n, int pos){
        if(pos==1) insert_At_begin(n);
        else {
            Nod temp = head;
            for (int i=0; i<pos-2; i++){
                temp = temp.next;
            }
            n.prev = temp;
            n.next = temp.next;
            temp.next.prev = n;
            temp.next = n;
        }
    }
    public void delete_from_begin(){
        if(head == null) System.out.println("Empty");
        else {
            head.next.prev = head.prev;
            head.prev.next = head.next;
            head = head.next;
        }
    }
    public void delete_from_end(){
        if(head == null) System.out.println("Empty");
        else {
            head.prev.prev.next = head;
            head.prev = head.prev.prev;
        }
    }
    public void delete_from_any(int pos){
        if(pos == 1) delete_from_begin();
        else {
            Nod temp = head;
            for(int i=0; i<pos-2; i++) temp = temp.next;
            temp.next.next.prev = temp.next.prev;
            temp.next = temp.next.next;
        }
    }
    public void display(){
        if(head == null) System.out.println("Empty");
        else {
            Nod temp = head;
            while(temp.next!=head){
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    public static void main(String[] args) {
        Doubly_Circuler_LL obj = new Doubly_Circuler_LL();
        obj.creat_Linked_List();
        obj.insert_At_begin(new Nod(100));
        obj.insert_at_end(new Nod(1000));
        obj.delete_from_begin();
        obj.delete_from_end();
        obj.insert_at_any(new Nod(500),3);
        obj.delete_from_any(5);
        obj.display();
    }
}
