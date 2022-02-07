package LinkedList;

import java.util.ArrayList;
import java.util.Scanner;

class Node9<T>{
    T data;
    Node9<T> next;
    public Node9(T data){
        this.data = data;
    }
}
public class Palindrome {
    Node9<Integer> head;
    public void creatLinkedlist(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Node9<Integer>> a = new ArrayList<>();
        int i=0;
        while(true){
            int data = sc.nextInt();
            if(data == -1) break;
            a.add(new Node9<>(data));
            if(i>0) a.get(i-1).next = a.get(i);
            i++;
        }
        if(a.size()!=0) head = a.get(0);
    }
    public ArrayList<Integer> rev(){
        ArrayList<Integer> a = new ArrayList<>();
        Node9<Integer> temp = head;
        while(temp != null){
            a.add(temp.data);
            temp = temp.next;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0) {
            Palindrome obj1 = new Palindrome();
            obj1.creatLinkedlist();
            int flag=0;
            for(int i=0; i<obj1.rev().size()/2; i++){
                if(obj1.rev().get(i)==obj1.rev().get(obj1.rev().size()-i-1)) flag=1;
                else{
                    flag = 0;
                    break;
                }
            }
            if(flag==1) System.out.println("Palindrome");
            else System.out.println("Not palindrome");
            t--;
        }
    }
}
