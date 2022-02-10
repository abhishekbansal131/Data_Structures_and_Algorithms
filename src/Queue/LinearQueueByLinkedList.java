package Queue;

import java.util.Scanner;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class LinearQueueByLinkedList {
    Node head;
    public boolean isEmpty(){
        return head == null;
    }
    public void enqueue(Node n){
        if(isEmpty()) head = n;
        else{
            Node temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = n;
        }
    }
    public void dequeue(){
        if(isEmpty()) System.out.println("Queue is empty");
        else {
            head = head.next;
        }
    }
    public void display(){
        if(isEmpty()) System.out.println("Queue is empty");
        else {
            Node temp = head;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinearQueueByLinkedList obj = new LinearQueueByLinkedList();
        while(true)
        {
            System.out.println("Press 1 for ENQUEUE");
            System.out.println("Press 2 for DEQUEUE");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for exit");
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            int choice=sc.nextInt();

            switch (choice) {
                case 1 -> obj.enqueue(new Node(sc.nextInt()));
                case 2 -> obj.dequeue();
                case 3 -> obj.display();
                case 4 -> System.exit(0);
                default -> System.out.println("Wrong Choice");
            }
        }
    }
}
