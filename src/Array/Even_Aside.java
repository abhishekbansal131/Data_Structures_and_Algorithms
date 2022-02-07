package Array;

/*Print an array that contains the exact same number as the given array, but rearrange so that all the even numbers come before all
the odd numbers. Other than that, the numbers can be in any order. You may modify and print the given array, or make a new array.

Rearrange ([3,3,2]) -> [2,3,3]
Rearrange(0,1,0,1,1,]) -> [0,0,1,1,1]
 */

import java.util.Scanner;

public class Even_Aside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        int a=0;
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                int temp = arr[i];
                arr[i] = arr[a];
                arr[a] = temp;
                a++;
            }
        }
        for(int i : arr) System.out.println(i);
    }
}
