package Queue;

import java.util.Scanner;

class Node7{
    int data, count;
    Node7 next;

    public Node7(int data, int count) {
        this.data = data;
        this.count = count;
    }
}
public class Prime {
    public static boolean isPrime(int n){
        int flag = 0;
        if(n==0 || n==1) return false;
        else if(n == 2) return true;
        else {
            for(int i=2; i<n; i++){
                flag = 0;
                if(n%i == 0){
                    return false;
                }
                else {
                    flag = 1;
                }
            }
        }
        return flag == 1;
    }
    Node7 front, rear;
    public void insert(Node7 n){
        if(front == null && rear == null) front = rear = n;
        else if(front.next == null){
            if(n.data > front.data){
                n.next = front;
                front = n;
            }
            else {
                rear.next = n;
                rear = n;
            }
        }
        else if(n.data > front.data){
            n.next = front;
            front = n;
        }
        else if(n.data < rear.data){
            rear.next = n;
            rear = n;
        }
        else {
            Node7 temp = front;
            while (temp.next != null){
                if(n.data > temp.next.data){
                    n.next = temp.next;
                    temp.next = n;
                    break;
                }
                temp = temp.next;
            }
        }
    }
    public void display(){
        Node7 temp = front;
        while(temp != null){
            System.out.println(temp.data + "    " + temp.count);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Prime obj = new Prime();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<arr.length; i++) arr[i]= sc.nextInt();
        int c=0, sum=0;
        for(int i=0; i<arr.length; i++){
           if(isPrime(arr[i])){
               sum += arr[i];
               c++;
               if(i != arr.length -1) {
                   if (!isPrime(arr[i + 1])) {
                       obj.insert(new Node7(sum, c));
                       sum = 0;
                       c = 0;
                   }
               }
               if(i == arr.length -1 && isPrime(arr[i])){
                   obj.insert(new Node7(arr[i],1));
               }
           }
        }
        obj.display();
    }

}
