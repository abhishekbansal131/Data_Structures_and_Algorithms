package Recursion;

/* Write a program to find and return the sum of all elements of the array. Do this recursively.

Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7
 */

import java.util.Scanner;

public class Q4_Array_Sum {
    public static void sum(int[] arr,int sum, int n){
        if(n==0) {
            System.out.println(sum);
            return;
        }
        sum(arr, sum + arr[n - 1], n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sum(arr,0,n);
    }
}
