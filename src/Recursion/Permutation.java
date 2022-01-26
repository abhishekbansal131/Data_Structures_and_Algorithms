package Recursion;

import java.util.Scanner;

public class Permutation {
    public static void perm(String s,String res){
        if(s.length()==0) {  //BASE CONDITION
            System.out.println(res + " ");
            return;
        }
        for(int i=0 ;i<s.length(); i++){
//            char c = s.charAt(i); //FIXING THE FIRST CHARACTER
//            String a = s.substring(0,i) + s.substring(i+1); //SHOWS THE REMAINING STRING AFTER FIXING THE CHARACTER
//            perm(a,res+c);

            perm(s.substring(0,i) + s.substring(i+1), res + s.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ONE STRING");
        String s = sc.next();
        perm(s,"");
    }
}
