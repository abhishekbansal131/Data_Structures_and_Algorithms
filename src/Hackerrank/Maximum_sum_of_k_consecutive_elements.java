package Hackerrank;

/*You are given an array of integers and an integer k, your task is to calculate the maximum sum of 'k' consecutive elements in that
 array. If the size of array is less than k then print -1.


Input Format

An integer n denoting number of elements
An integer k
n elements of the array
Constraints

1
1
Output Format

An integer which is the maximum sum of 'k' consecutive elements of the array. If the size of array is less than k then print -1.

Sample Input 0

9
4
1 3 5 7 9 6 4 2 0
Sample Output 0

27
Explanation 0

1+3+5+7=16 3+5+7+9=24 5+7+9+6=27 (maximum) 7+9+6+4=26 9+6+4+2=21 6+4+2+0=12

Answer=27 which is maximum

Sample Input 1

3
5
1 2 3
Sample Output 1

-1
Explanation 1

Since n=3 (size of the array) k=5 which is larger than size of the array (n=3)

So the output is -1
 */

import java.util.Scanner;

public class Maximum_sum_of_k_consecutive_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum,max=0;
        if(n>k){
            for(int i=0; i<n-k+1; i++){
                sum=0;
                for(int j=0; j<k; j++){
                    sum += arr[i+j];
                }
                if(sum>max)
                    max=sum;
            }
            System.out.println(max);
        }
        else{
            System.out.println(-1);}
    }
}
