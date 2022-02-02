package LinkedList;

import java.util.Scanner;

class Node2{
    int data;
    Node2 next, pre;
    public Node2(int data) {
        this.data = data;
    }
}
public class DoublyLikedList {
    Node2 head;
    public void creat_DLL(){
        Node2 n1 = new Node2(10);
        Node2 n2 = new Node2(20);
        Node2 n3 = new Node2(30);
        Node2 n4 = new Node2(40);
        head = n1;
        n1.next =n2;
        n2.next=n3;
        n3.next=n4;
        n2.pre = n1;
        n3.pre = n2;
        n4.pre = n3;
    }
    public void insert_at_end(Node2 n){
        if(head==null) head = n;
        else{
            Node2 temp = head;
            while(temp.next!=null) temp=temp.next;
            temp.next = n;
            n.pre = temp;
        }
    }
    public void insert_at_begin(Node2 n){
        n.next = head;
        head.pre = n;
        head = n;
    }
    public void insert_at_any(Node2 n, int pos){
        if(pos==1) insert_at_begin(n);
        else{
            Node2 temp = head;
            for(int i=0; i<pos-2; i++) temp = temp.next;
            n.next = temp.next;
            n.pre = temp;
            temp.next = n;
        }
    }
    public void delete_from_begin(){
        head.next.pre = null;
        head = head.next;
    }

    public void delete_from_end(){
        Node2 temp = head;
        while(temp.next != null){
            temp = temp.next;
            if(temp.next.next==null) break;
        }

        temp.next =null;
    }
    public void delete_from_any(int pos){
        if(pos==1) delete_from_begin();
        else{
            Node2 temp = head;
            for(int i=0; i<pos-2; i++){
                temp = temp.next;
            }
            temp.next.pre = temp;
            temp.next = temp.next.next;
        }
    }

    public void display(){
        if(head == null) System.out.println("Empty linked List");
        else{
            Node2 temp = head;
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLikedList obj = new DoublyLikedList();
        obj.creat_DLL();
        while(true){
            System.out.println("""
                    PRESS 1 FOR INSERTION AT BEGIN, 2 FOR INSERTION AT END AND 3 FOR INSERTION AT ANY SPECIFIC POSITION.
                    PRESS 4 FOR DELETION FROM BEGIN, 5 FOR DELETION AT END AND 6 FOR DELETION FOR ANY SPECIFIC POSITION.
                    press 7 for exit""");
            int choice = sc.nextInt();
            if(choice==1){
                System.out.println("What value do you want to insert?\nEnter the value");
                int data = sc.nextInt();
                obj.insert_at_begin(new Node2(data));
            }
            else if(choice==2){
                System.out.println("What value do you want to insert?\nEnter the value");
                int data = sc.nextInt();
                obj.insert_at_end(new Node2(data));
            }
            else if(choice==3){
                System.out.println("What value do you want to insert?\nEnter the value");
                int data = sc.nextInt();
                System.out.println("Enter the specific location");
                int p = sc.nextInt();
                obj.insert_at_any(new Node2(data),p);
            }
            else if(choice==4) obj.delete_from_begin();
            else if(choice==5) obj.delete_from_end();
            else if(choice==6){
                System.out.println("Enter the position of node which you want to delete");
                int p = sc.nextInt();
                obj.delete_from_any(p);
            }
            else if(choice==7){
                System.out.println("Thank you");
                break;
            }
            else System.out.println("please enter valid choice");
            obj.display();
        }

    }
}
