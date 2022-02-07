package LinkedList;

import java.util.ArrayList;
import java.util.Scanner;

class Node8<T>{
    T data;
    Node8<T> next;
    public Node8(T data){
        this.data = data;
    }
}
public class MidPoint {
    Node8<Integer> head;
    public void creatLinkedlist(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Node8<Integer>> a = new ArrayList<>();
        int i=0;
        while(true){
            int data = sc.nextInt();
            if(data == -1) break;
            a.add(new Node8<>(data));
            if(i>0) a.get(i-1).next = a.get(i);
            i++;
        }
        if(a.size()!=0) head = a.get(0);
    }
    public int count(){
        int c=0;
        if(head==null) return 0;
        else {
            Node8<Integer> temp = head;
            while(temp!=null){
                c++;
                temp= temp.next;
            }
        }
        return c;
    }
    public void midNode(){
        int m = count()/2;
        if(count()%2==0) m--;
        Node8<Integer> temp = head;
        for(int i=0; i<m; i++) temp = temp.next;
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0) {
            MidPoint obj = new MidPoint();
            obj.creatLinkedlist();
            obj.midNode();
            t--;
        }
    }
}

