package Recursion;

/* Write a program to print numbers from 1 to n in increasing order recursively.

Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6 */

import java.util.Scanner;

public class Q2 {
    public static void Inc(int n, int i){
        if(i<=n) {
            System.out.print(i + " ");
            Inc(n, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        Inc(n,1);
    }
}
