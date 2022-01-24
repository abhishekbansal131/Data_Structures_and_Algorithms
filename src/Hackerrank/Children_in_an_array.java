package Hackerrank;

/*From the given set of values in the array, the children inside the array is the element which is the smallest among all the
elements present in the right of it and the rightmost element is always a child.

        If we have 3 elements with same value ie for eg - [3,3,3] then the rightmost will be considered as child.

        Input Format

        An integer n, denoting number of elements An array of size n

        Constraints

        1

        Output Format

        Output all the n elements of the array space separated containing the Children in the arrays.

        Sample Input 0

        6
        2 5 3 4 17 16

        Sample Output 0

        2 3 4 16
 */

import java.util.Scanner;

public class Children_in_an_array {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int c;
        for(int i=0; i<n; i++){
            c=0;
            for(int j=i+1; j<n; j++){
                if(arr[i]<=arr[j]){
                    c++;
                }
            }
            if(c==n-i-1){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
