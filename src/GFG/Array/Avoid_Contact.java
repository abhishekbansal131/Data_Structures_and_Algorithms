package GFG.Array;

import java.util.Scanner;

//Code-chef

public class Avoid_Contact {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x!=y) System.out.println(x+y);
            else System.out.println(x+y-1);
            t--;
        }
    }
}
