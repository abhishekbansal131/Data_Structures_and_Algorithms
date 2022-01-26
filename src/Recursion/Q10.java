package Recursion;

/*Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated
using the following rules:
        a. The string begins with an 'a'
        b. Each 'a' is followed by nothing or an 'a' or "bb"
        c. Each "bb" is followed by nothing or an 'a'
        If all the rules are followed by the given string, return true otherwise return false.

        Sample Input 1 :
        abb
        Sample Output 1 :
        true
        Sample Input 2 :
        baba
        Sample Output 2 :
        false
 */

import java.util.Scanner;

public class Q10 {
    public static boolean Seq(String str)
    {
        if(str.length()==0) return true;
        if(str.length()==1){
            return str.charAt(0) == 'a';
        }
        if(str.charAt(0)=='a'){
            return Seq(str.substring(1));
        }
        else if(str.charAt(0)=='b' && str.charAt(1)=='b'){
            return Seq(str.substring(2));
        }
        else return false;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(Seq(str));
    }
}
