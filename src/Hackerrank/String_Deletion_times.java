package Hackerrank;

/*Paxton has been given strings containing only two letters X and Y. He has to reduce each string such that there are no
matching adjacent characters present in the string. For that, he can delete zero or more characters.

Paxton has to tell how many minimum deletions are required for each string.

Example

"XXYYX" can be reduced to "XYX" by deleting X at 0 index and Y at 2 index. Total deletions = 2.

"YYYY" can be reduced to "Y" by deleting Y at 0,1,2 index. Total deletions = 3.
 */

import java.util.Scanner;

public class String_Deletion_times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c=0;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                c++;
            }
        }
        System.out.println(c);
    }
}
