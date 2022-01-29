package Array;

// Given an array that contains both positive and negative integers, find the product of the maximum product subarray.

import java.util.Scanner;

public class MAX_PRO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        int prod,max=0;
        for(int i=0; i<arr.length; i++){
            prod=1;
            prod *= arr[i];
            max = Math.max(max,prod);
            for(int j=i+1; j<arr.length; j++){
                prod *= arr[j];
                max = Math.max(max,prod);
            }
        }
        System.out.println(max);
    }
}
