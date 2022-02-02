package LinkedList;

import java.util.Scanner;

class Node1{
    int data;
    Node1 next;
    public Node1(int data) {
        this.data = data;
    }
}

public class LL_Oper {
    Node1 head;
    public void creatLinkedList(){
        Node1 node1 = new Node1(10);
        Node1 node2 = new Node1(20);
        Node1 node3 = new Node1(30);
        Node1 node4 = new Node1(40);
        Node1 node5 = new Node1(60);

        head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
    }
    public void insert_at_last(Node1 n){
        if(head==null) head =n;
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
        if(pos==1) insert_at_begin(n);
        else {
            Node1 temp = head;
            for (int i = 0; i < pos - 2; i++) {
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
        }
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
            while (temp.next!=null){
                temp = temp.next;
                if(temp.next.next == null) break;
            }
            temp.next = null;
        }
    }

    public void delete_from_any(int pos){
        if(pos==1) delete_from_begin();
        else {
            Node1 temp = head;
            for (int i = 0; i < pos - 2; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
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
        Scanner sc = new Scanner(System.in);
        LL_Oper obj = new LL_Oper();
        obj.creatLinkedList();
        while(true){
            System.out.println("""
                    PRESS 1 FOR INSERTION AT BEGIN, 2 FOR INSERTION AT END AND 3 FOR INSERTION AT ANY SPECIFIC POSITION.
                    PRESS 4 FOR DELETION FROM BEGIN, 5 FOR DELETION AT END AND 6 FOR DELETION FOR ANY SPECIFIC POSITION.
                    press 7 for exit""");
            int choice = sc.nextInt();
            if(choice==1){
                System.out.println("What value do you want to insert?\nEnter the value");
                int data = sc.nextInt();
                obj.insert_at_begin(new Node1(data));
            }
            else if(choice==2){
                System.out.println("What value do you want to insert?\nEnter the value");
                int data = sc.nextInt();
                obj.insert_at_last(new Node1(data));
            }
            else if(choice==3){
                System.out.println("What value do you want to insert?\nEnter the value");
                int data = sc.nextInt();
                System.out.println("Enter the specific location");
                int p = sc.nextInt();
                obj.insert_at_any(new Node1(data),p);
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
