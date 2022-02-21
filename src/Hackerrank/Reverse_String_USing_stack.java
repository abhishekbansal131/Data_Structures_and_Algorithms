package Hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_String_USing_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> a = new Stack<>();
        String s = sc.next();
        for(int i=0; i<s.length(); i++) a.push(s.charAt(i));
        for(int i=0; i<s.length(); i++){
            System.out.print(a.pop());
        }
    }
}
