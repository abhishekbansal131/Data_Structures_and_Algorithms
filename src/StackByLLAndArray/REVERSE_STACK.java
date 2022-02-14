package StackByLLAndArray;

import java.util.Scanner;

public class REVERSE_STACK {
    int top;
    int[] arr;
    REVERSE_STACK(int size){
        top = -1;
        arr = new int[size];
    }
    public boolean isFull(){
        return top == arr.length-1;
    }
    public void push(int data){
        if(isFull()) System.out.println("Stack is full");
        else {
            top++;
            arr[top] = data;
        }
    }
    public void traverse(){
        for (int i = top; i>=0; i--) System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        REVERSE_STACK obj1 = new REVERSE_STACK(n);
        REVERSE_STACK obj2 = new REVERSE_STACK(n);
        for(int i=0; i<n; i++) obj1.push(sc.nextInt());
        obj1.traverse();
        for (int i=0; i<n; i++) {
            obj2.push(obj1.arr[n - i - 1]);
        }
        obj2.traverse();
    }
}
