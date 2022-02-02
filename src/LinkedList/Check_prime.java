package LinkedList;

class Node3{
    int data;
    Node3 next;
    public Node3(int data) {
        this.data = data;
    }
}

public class Check_prime {
    Node3 head;
    public boolean isPrime(int n){
        int flag=0;
        if(n==0 || n==1) return false;
        else if(n==2) return true;
        else {
            for(int i=2; i<n; i++){
                flag=0;
                if(n%i==0){
                    break;
                }
                else flag=1;
            }
        }
        return flag == 1;
    }
    public void creatLinkedList(){
        Node3 n1 = new Node3(10);
        Node3 n2 = new Node3(7);
        Node3 n3 = new Node3(3);
        Node3 n4 = new Node3(40);
        head = n1;
        n1.next =n2;
        n2.next=n3;
        n3.next=n4;
    }
    public void insert_at_last(Node3 n){
        if(head==null) head =n;
        else {
            Node3 temp =head;
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    public void display() {
        if (head == null) System.out.println("Empty linked List");
        else {
            Node3 temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Check_prime obj = new Check_prime();
        Check_prime obj2 = new Check_prime();
        obj.creatLinkedList();
        Node3 temp = obj.head;
        while(temp!=null){
            if(obj.isPrime(temp.data)){
                obj2.insert_at_last(new Node3(temp.data));
            }
            temp = temp.next;
        }
        obj2.display();
    }
}
