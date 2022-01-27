package Recursion;

import java.util.Scanner;

public class Subsequence_in_string {
    public static void subseq(String s, String res){
        if(s.length()==0){
            System.out.println(res);
            return;
        }
        subseq(s.substring(1),res+s.charAt(0));
        subseq(s.substring(1),res + "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String s = sc.next();
        System.out.println(" ");
        subseq(s,"");
    }
}
