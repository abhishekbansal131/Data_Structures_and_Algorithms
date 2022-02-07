package LinkedList;

/*Print ith Node

For a given a singly linked list of integers and a position 'i', print the node data at the 'i-th' position.
 Note :
Assume that the Indexing for the singly linked list always starts from 0.

If the given position 'i',  is greater than the length of the given singly linked list, then don't print anything.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the singly linked list separated by a single space.

The second line contains the value of 'i'. It denotes the position in the given singly linked list.
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
Output format :
For each test case, print the node data at the 'i-th' position of the linked list(if exists).

Output for every test case will be printed in a separate line.
 Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
i  >= 0
Time Limit: 1sec
Sample Input 1 :
1
3 4 5 2 6 1 9 -1
3
Sample Output 1 :
2
Sample Input 2 :
2
3 4 5 2 6 1 9 -1
0
9 8 4 0 7 8 -1
3
Sample Output 2 :
3
0
 */

import java.util.ArrayList;
import java.util.Scanner;

class Node5<T>{
    T data;
    Node5<T> next;

    public Node5(T data) {
        this.data = data;
    }
}

public class Print_ith_Node {
    Node5<Integer> head;
    public void creatLinkedlist(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Node5<Integer>> a = new ArrayList<>();
        int i=0;
        while(true){
            int data = sc.nextInt();
            if(data == -1) break;
            a.add(new Node5<>(data));
            if(i>0) a.get(i-1).next = a.get(i);
            i++;
        }
        if(a.size()!=0) head = a.get(0);
    }
    public void search(int i){
        Node5<Integer> temp = head;
        int c=0;
        while(temp!=null){
            if(c==i){
                System.out.println(temp.data);
                return;
            }
            c++;
            temp = temp.next;
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            Print_ith_Node obj = new Print_ith_Node();
            obj.creatLinkedlist();
            obj.search(sc.nextInt());
            t--;
        }
    }
}
