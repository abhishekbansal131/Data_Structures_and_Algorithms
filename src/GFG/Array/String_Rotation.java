package GFG.Array;

import java.util.Scanner;

/*Given a string s1 and a string s2, write a snippet to say whether s2 is a rotation of s1?
(e.g. given s1 = ABCD and s2 = CDAB, return true, given s1 = ABCD, and s2 = ACBD , return false) */

public class String_Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int[] arr = new int[s1.length()];
        for(int i=0; i< s1.length(); i++){
            if(s2.contains(Character.toString(s1.charAt(i)))){
                arr[i] = s1.indexOf(s1.charAt(i)) - s2.indexOf(s1.charAt(i));
            }
        }
        int c=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]==arr[i+1]) c++;
        }
        if(c>=3) System.out.println("Yes");
        else System.out.println("No");
    }
}
