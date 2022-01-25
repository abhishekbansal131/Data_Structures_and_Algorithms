package Recursion;

/* In a string S, remove consecutive duplicates from it recursively.

Sample Input 1 :
aabccba
Sample Output 1 :
abcba
 */

import java.util.Scanner;

public class Q8 {
    public static void Duplicate(char[] arr, int i){
        if(i<arr.length-1){
            if(arr[i]!=arr[i+1]){
                System.out.print(arr[i]);
            }
            Duplicate(arr,i+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        char[] arr = s.toCharArray();
        Duplicate(arr,0);
        System.out.print(arr[arr.length-1]);
    }
}
