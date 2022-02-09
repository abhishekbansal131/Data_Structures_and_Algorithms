package Queue;

import java.util.Scanner;

public class CircularQueueBYArray {
    int head, tail;
    int[] arr;
    CircularQueueBYArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        arr = new int[sc.nextInt()];
    }
    public boolean isFull(){
        for(int i : arr){
            if(i==0) return false;
        }
        return true;
    }
    public boolean isEmpty(){
        for(int i : arr){
            if(i!=0) return false;
        }
        return true;
    }
    public void enqueue(int data){
        if(isFull()) System.out.println("Stack is full");
        else {
            if(tail == arr.length) tail = 0;
            arr[tail] = data;
            tail++;
        }
    }
    public void dequeue(){
        if(isEmpty()) System.out.println("Empty stack");
        else {
            if (head == arr.length) head = 0;
            arr[head] = 0;
            head++;
        }
    }
    public void display(){
        for(int i : arr){
            if(i==0) System.out.print("   ");
            else System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueueBYArray obj = new CircularQueueBYArray();
        obj.enqueue(10);     // LET SIZE OF ARRAY = 10
        obj.display();            // 10
        obj.enqueue(20);
        obj.display();            // 10 20
        obj.enqueue(30);
        obj.display();            // 10 20 30
        obj.enqueue(10);     // STACK IS FULL
        obj.dequeue();
        obj.display();            //    20 30
        obj.enqueue(40);
        obj.display();            // 40 20 30
        obj.dequeue();
        obj.display();            // 40    30
        obj.dequeue();
        obj.display();            // 40
        obj.dequeue();            // NO ELEMENT WILL REMAIN IN STACK
        obj.display();
        obj.dequeue();            // STACK IS EMPTY
    }
}
