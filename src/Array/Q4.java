package Array;

/*Q. Write a program to remove consecutive duplicate elements in an array.

Input values

10 10 30 30 40 50 50 50 9 45

Output

10 30 40 50 9 45*/

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<size-1; i++){
            if (arr[i] != arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
        System.out.println(arr[size-1]);
    }
}
