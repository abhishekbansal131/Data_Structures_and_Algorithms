package GFG.Array;

import java.util.Scanner;

public class Remove_duplicates {
    static String removeDups(String S) {
        StringBuilder s1= new StringBuilder();
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            String s=String.valueOf(c);
            if(!s1.toString().contains(s)) {
                s1.append(s);
            }
        }
        return (s1.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(removeDups(sc.next()));
    }
}
