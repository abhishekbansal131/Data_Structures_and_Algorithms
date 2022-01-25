package Recursion;

/*  Given an input string S and two characters char1 and char2, you need to replace every occurrence of character c1 with character
c2 in the given string. Do this recursively.

Sample Input :
abaca
a x
Sample Output :
xbxcd
*/

import java.util.Scanner;

public class Q7 {
    public static String replace(char[] s, char a, char b, int i){
        if(i<s.length) {
            if (s[i] == a) {
                s[i] = b;
            }
            replace(s,a, b,i+1);
        }
        return new String(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.next();
        System.out.println("Enter the two characters");
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        char[] c = s.toCharArray();
        System.out.println(replace(c,a,b,0));
    }
}
