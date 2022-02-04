package Recursion;

import java.util.Scanner;

public class Decimal_to_binary {
    static String s = "";
    public static String DTB(int n){
        if(n==0) return s;
        int rem = n%2;
        s += String.valueOf(rem);
        return DTB(n/2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        for(int i=DTB(sc.nextInt()).length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }
}
