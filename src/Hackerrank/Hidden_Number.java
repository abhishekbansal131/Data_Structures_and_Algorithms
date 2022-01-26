package Hackerrank;

/*Given an array of n integers, The task is to find another integer x .such that, if all the elements of the array are subtracted
individually from the number x, then the sum of all the differences should add to 0. If any such integer exists, print the value of x,
 else print -1.

The idea is to calculate the total sum of the array and divide it by the size of the array. If the sum of the array is perfectly
divisible by its size then the quotient obtained from this division operation will be the required hidden number.

Input Format

N is the size of array A[i] is value array

Constraints

1<=N<=10000 -10000<=A[i]<=10000

Output Format

X as integer

Sample Input 0

4
2 4 5 7
Sample Output 0

-1
Sample Input 1

3
1 2 3
Sample Output 1

2
 */

import java.util.Scanner;

public class Hidden_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i : arr){
            sum=0;
            for(int j : arr){
                sum+=(i-j);
            }
            if(sum==0){
                System.out.println(i);
                return;
            }
        }
        if(sum!=0){
            System.out.println(-1);
        }
    }
}
