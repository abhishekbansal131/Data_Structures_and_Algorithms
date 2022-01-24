package Hackerrank;

/*Take an array of integers as input and print its output running sum array. We define a running sum of an array as
runningSum[i] = sum of (array[0]…array[i]).

Print the running sum.

Input Format

An integer n denoting the size of the input integer array.
n elements of integer array
Constraints

1

Output Format

Output all the n elements of the array space separated containing the resulting RUNNINGSUM of each element.

Sample Input 0

5
1 2 3 4 5
Sample Output 0

1 3 6 10 15
Explanation 0

Input array: 1,2,3,4,5 Output array: {1, 1+2, 1+2+3, 1+2+3+4, 1+2+3+4+5}

 */

import java.util.Scanner;

public class Cumulative_Sum_of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            arr1[i]=sum;
        }
        for(int i : arr1){
            System.out.print(i + " ");
        }

    }
}
