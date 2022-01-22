package Recursion;

/*Create an array of 5 elements with values {1,2,4,2,6}.search value 2 in the given array and print the first occurrence(index) of
search value. Do it recursively

The prototype of the method is as follows
public static int find(int arr[ ], int currentIndex, int search_value)
{
	// set of statements;
}
*/

import java.util.Scanner;

public class Q5 {
    public static void find(int[] arr, int currentIndex, int search_value){
        if(currentIndex<arr.length) {
            if (arr[currentIndex] == search_value) {
                System.out.println(currentIndex);
                return;
            }
            find(arr,currentIndex+1,search_value);
        }
        else {
            System.out.println("Value not found");
        }
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
        System.out.println("Enter the value you want to search");
        int value = sc.nextInt();
        find(arr,0,value);
    }
}
