package Hackerrank;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) arr[i] = sc.nextInt();
        for(int i= a-1; i>=0; i--) System.out.print(arr[i] + " ");
        for(int i=a; i<arr.length; i++) System.out.print(arr[i] + " ");
    }
}
