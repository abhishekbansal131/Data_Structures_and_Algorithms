package LinkedList;

//Enter a string from user and store each character of a string in different nodes of a linked list and print the values.

import java.util.Scanner;

class Nodee{
    char data;
    Nodee next;
    Nodee(char data){
     this.data = data;
    }
}
public class Enter_each_char {
    Nodee head;
    public void insertAtLast(Nodee n){
        if(head==null) head =n;
        else {
            Nodee temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = n;
        }
    }
    public void display(){
        Nodee temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Enter_each_char obj = new Enter_each_char();
        String s = sc.next();
        for(int i=0; i<s.length(); i++){
            obj.insertAtLast(new Nodee(s.charAt(i)));
        }
        obj.display();
    }
}
