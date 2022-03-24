package Queue;

import java.util.Scanner;

/*Q. Reverse the First K Elements in the Queue

        For a given queue containing all integer data, reverse the first K elements.
        You have been required to make the desired change in the input queue itself.




        Input Format :
        The first line of input would contain two integers N and K, separated by a single space. They denote the total number of elements in the queue and the count with which the elements need to be reversed respectively.

        The second line of input contains N integers separated by a single space, representing the order in which the elements are enqueued into the queue.
        Output Format:
        The only line of output prints the updated order in which the queue elements are dequeued, all of them separated by a single space.
        Note:
        You are not required to print the expected output explicitly, it has already been taken care of. Just make the changes in the input queue itself.
        Contraints :
        1 <= N <= 10^6
        1 <= K <= N
        -2^31 <= data <= 2^31 - 1

        Sample Input 1:
        5 3
        1 2 3 4 5
        Sample Output 1:
        3 2 1 4 5
        Sample Input 2:
        7 7
        3 4 2 5 6 7 8
        Sample Output 2:
        8 7 6 5 2 4 3
 */

class Nodp{
    int data;
    Nodp next;

    public Nodp(int data) {
        this.data = data;
    }
}
public class Reverse_k_elements {
    Nodp front, rear;
    Nodp top;
    public void insert(Nodp n){
        if(front == null && rear == null){
            front = rear = n;
        }
        else{
            rear.next = n;
            rear = rear.next;
        }
    }
    public void push(Nodp n){
        if(top == null) top = n;
        else{
            n.next = top;
            top = n;
        }
    }
    public void dequeue(){
        if(front == null && rear == null){

        }
        else{
            front = front.next;
        }
    }
    public int pop(){
        if(top == null){return 0;}
        else {
            int a = top.data;
            top = top.next;
            return a;
        }
    }
    public void display(int k){
        Nodp temp = front;
        for(int i=0; i<k; i++){
            push(new Nodp(temp.data));
            temp = temp.next;
        }
        for(int i=0; i<k; i++){
            System.out.print(pop() + " ");
            dequeue();
        }
        Nodp tem = front;
        while(tem != null){
            System.out.print(tem.data + " ");
            tem = tem.next;
        }
    }

    public static void main(String[] args) {
        Reverse_k_elements obj = new Reverse_k_elements();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i=0; i<n; i++){
            obj.insert(new Nodp(sc.nextInt()));
        }
        obj.display(k);

    }
}
