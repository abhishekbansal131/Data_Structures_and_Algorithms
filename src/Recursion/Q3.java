package Recursion;

/*Write a program to find out and return the number of digits present in a number recursively.

        Sample Input 1 :
        156
        Sample Output 1 :
        3
        Sample Input 2 :
        7
        Sample Output 2 :
        1
 */

import java.util.Scanner;

public class Q3 {
    public static void count(int n, int c){
        if(n==0) {
            System.out.println(c);
            return;
        }
        count(n/10,c+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        count(n,0);
    }
}
