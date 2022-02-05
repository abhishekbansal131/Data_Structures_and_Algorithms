package Hackerrank;

//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

import java.util.Arrays;
import java.util.Scanner;

public class Calculate_Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr1 = new int[a+b];
        for(int i=0; i<a; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0; i<b; i++){
            arr1[a +i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        if(arr1.length%2==0){
            System.out.println((double)(arr1[arr1.length/2] + arr1[(arr1.length/2) -1])/2);
        }
        else{
            System.out.println((double)(arr1[arr1.length/2]));
        }
    }
}
