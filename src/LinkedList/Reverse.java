package LinkedList;

import java.util.ArrayList;
import java.util.Scanner;

class Node10<T>{
    T data;
    Node10<T> next;
    public Node10(T data){
        this.data = data;
    }
}
public class Reverse {
    Node10<Integer> head;
    public void creatLinkedlist(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Node10<Integer>> a = new ArrayList<>();
        int i=0;
        while(true){
            int data = sc.nextInt();
            if(data == -1) break;
            a.add(new Node10<>(data));
            if(i>0) a.get(i-1).next = a.get(i);
            i++;
        }
        if(a.size()!=0) head = a.get(0);
    }
    public void rev(){
        Node10<Integer> temp = head;
        ArrayList<Integer> a = new ArrayList<>();
        while(temp!=null){
            a.add(temp.data);
            temp = temp.next;
        }
        for(int i=a.size()-1; i>=0; i--){
            System.out.println(a.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0) {
            Reverse obj = new Reverse();
            obj.creatLinkedlist();
            obj.rev();
            t--;
        }
    }
}
