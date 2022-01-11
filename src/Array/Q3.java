package Array;

/*Write a program to find whether the array of integers contains a duplicate number. if yes print the location where duplicate numbers
are found.*/

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
