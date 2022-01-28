package Array;

//Find if there is a subarray with 0 sum.

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        int s;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                System.out.println("true");
                return;
            }
            else {
                s = 0;
                s += arr[i];
                for (int j = i + 1; j < arr.length; j++) {
                    s += arr[j];
                    if (s == 0) {
                        System.out.println("true");
                        return;
                    }
                }
            }
        }
        System.out.println("false");
    }
}


