package Array;

/* Write a short Java function that takes an array of int values  as an argument and determines if there is a pair of numbers in the
 array whose product is odd.
 */

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array-->");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("pair of numbers in the array whose product is odd are");
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n ; j++) {
                if((arr[i]*arr[j])%2==1){
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }

        }
    }
}
