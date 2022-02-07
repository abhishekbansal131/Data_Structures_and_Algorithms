package LinkedList;

/* For a given singly linked list of integers, find and return its length. Do it using an iterative method.
        Input format :
        The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases
        follow.

        First and the only line of each test case or query contains elements of the singly linked list separated by a single space.
        Remember/Consider :
        While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a
        list element.
        Output format :
        For each test case, print the length of the linked list.

        Output for every test case will be printed in a separate line.
        Constraints :
        1 <= t <= 10^2
        0 <= N <= 10^5
        Time Limit: 1 sec
        Sample Input 1 :
        1
        3 4 5 2 6 1 9 -1
        Sample Output 1 :
        7
        Sample Input 2 :
        2
        10 76 39 -3 2 9 -23 9 -1
        -1
        Sample Output 2 :
        8
        0
 */

import java.util.ArrayList;
import java.util.Scanner;

class Node4<T>{
    T data;
    Node4<T> next;

    public Node4(T data) {
        this.data = data;
    }
}
public class Length {
    Node4<Integer> head;
    public int count(){
        int c=0;
        if(head==null) return 0;
        else {
            Node4<Integer> temp = head;
            while(temp!=null){
                c++;
                temp= temp.next;
            }
        }
        return c;
    }
    public void creatLinkedlist(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Node4<Integer>> a = new ArrayList<>();
        int i=0;
        while(true){
            int data = sc.nextInt();
            if(data == -1) break;
            a.add(new Node4<>(data));
            if(i>0) a.get(i-1).next = a.get(i);
            i++;
        }
        if(a.size()!=0) head = a.get(0);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t!=0){
            Length obj = new Length();
            obj.creatLinkedlist();
            System.out.println(obj.count());
            t--;
        }
    }
}
