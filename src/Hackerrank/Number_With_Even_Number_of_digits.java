package Hackerrank;

/*Take an integer n and then an array of size n. Print how many of them contain an even number of digits.

Input Format

Take an integer n denoting the size of the input array
Take n integers of the array
Constraints

<= n <= 500
<= array[i] <= 10^5
Output Format

Print the number of elements with even number of digits.

Sample Input 0

5
11 222 3 4 5555
Sample Output 0

2
 */

import java.util.Scanner;

public class Number_With_Even_Number_of_digits {
    public int count(int n){
        int c=0;
        while(n!=0){
            c++;
            n=n/10;
        }
        return c;
    }

    public static void main(String[] args) {
        Number_With_Even_Number_of_digits obj = new Number_With_Even_Number_of_digits();
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int c=0;
        for(int i : arr){
            if(obj.count(i)%2==0){
                c++;
            }
        }
        System.out.println(c);
    }
}
