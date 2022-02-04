package Recursion;

// Design a method that returns true if element n is a member of given array  and false if not  by using the recursion

import java.util.Scanner;

public class Check_element {
    public static boolean check(int[] arr, int n, int i){
        if(i==arr.length) return false;
        if(arr[i] == n) return true;
        return check(arr,n,i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter the elements of array");
        for(int i=0; i<arr.length; i++) arr[i] = sc.nextInt();
        System.out.println("Enter the element you want to search");
        int n = sc.nextInt();
        System.out.println(check(arr,n,0));
    }
}
