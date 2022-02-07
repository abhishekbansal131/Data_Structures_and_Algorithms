package LinkedList;

/*In a sorted linked list (elements are sorted in ascending order), eliminate duplicates from the given linked list, such that output
linked list contains only unique elements.
*/

import java.util.ArrayList;
import java.util.Scanner;

class Node7<T>{
    T data;
    Node7<T> next;
    public Node7(T data){
        this.data = data;
    }
}
public class Remove_Duplicates {
    Node7<Integer> head;
    public void creatLinkedlist(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Node7<Integer>> a = new ArrayList<>();
        int i=0;
        while(true){
            int data = sc.nextInt();
            if(data == -1) break;
            a.add(new Node7<>(data));
            if(i>0) a.get(i-1).next = a.get(i);
            i++;
        }
        if(a.size()!=0) head = a.get(0);
    }
    public void remove_dup(){
        Node7<Integer> temp = head;
        while(temp.next !=null){
            if(temp.data  != temp.next.data){
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0) {
            Remove_Duplicates obj = new Remove_Duplicates();
            obj.creatLinkedlist();
            obj.remove_dup();
            t--;
        }
    }
}
