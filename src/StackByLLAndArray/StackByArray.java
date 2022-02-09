package StackByLLAndArray;

public class StackByArray {
    int top;
    int[] arr;
    public StackByArray(int size){
        arr = new int[size];
        top = -1;
    }
    public boolean isFull(){
        return top == arr.length-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void push(int data){
        if(isFull()) System.out.println("Stack Overflow");
        else{
            top++;
            arr[top] = data;
        }
    }
    public void pop(){
        if(isEmpty()) System.out.println("Stack Underflow");
        else {
            arr[top] = 0;
            top--;
        }
    }
    public void traverse(){
        if(isEmpty()) System.out.println("Stack is Empty");
        else {
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}
