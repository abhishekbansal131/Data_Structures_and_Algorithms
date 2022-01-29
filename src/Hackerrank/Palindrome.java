package Hackerrank;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int flag=0;
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)==s.charAt(s.length()-i-1)) flag=0;
            else flag=1;
        }
        if(flag==0) System.out.println("Yes");
        else System.out.println("No");
    }
}