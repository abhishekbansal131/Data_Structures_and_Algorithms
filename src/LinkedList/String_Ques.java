package LinkedList;

import java.util.Scanner;
class Nodeee {
    String No;
    Nodeee next;
    Nodeee(String No){
        this.No = No;
    }
}
class LinkedList1 {
    Nodeee head;
    public void insert(Nodeee n) {
            if (head == null) {
                head = n;
            } else {
                Nodeee i = head;
                while (i.next != null) {
                    i = i.next;
                }
                i.next = n;
            }
        }

    public void traversed()
    {
        Nodeee n = head;
        while (n!=null)
        {
            System.out.print(n.No+" ");
            n=n.next;
        }

    }

    public static void main(String[] args) {
        LinkedList1 obj=new LinkedList1();
        Scanner s=new Scanner(System.in);
        int ch=s.nextInt();
        String[] arr=new String[ch];
        for (int i = 0; i <ch ; i++) {
            arr[i]=s.next();
        }
        for (int i = 0; i < ch; i++) {
            int l = arr[i].length();
            for (int j = 0; j <l; j++) {
                if(arr[i].charAt(j)%2==0)
                {
                    arr[i] = arr[i].concat("e");                }
                else
                {
                    arr[i] = arr[i].concat("o");
                }
            }
        }
        for(String i : arr) obj.insert(new Nodeee(i));
        obj.traversed();
    }
}
