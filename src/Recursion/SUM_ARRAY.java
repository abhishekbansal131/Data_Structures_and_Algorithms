package Recursion;

/*Write a recursive method for computing the sum of all the elements of an array. Start with an algorithm in English,
then translate this algorithm into code. Trace your method on the example of the following array with 3 elements: 2, 0, and 1.
 */

import java.util.Scanner;

public class SUM_ARRAY {
    public static int sum(int[] arr, int i, int sum){
        if(i==arr.length) return sum;
        else sum += arr[i];
        return sum(arr,i+1,sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr,0,0));
    }
}
