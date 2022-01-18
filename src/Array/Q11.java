package Array;

/*Mr Raman is having two unsorted arrays with names arr1 and arr2. They can be of any size.
They may contain duplicate values also. Raman wants for each element in arr1[ ] to count elements greater than or equal to it in
array arr2[].


Example

Imagine the size of both the arrays are 5

arr1[]  values  {3,4,1,2,2}
arr2[] values  {1,2,1,3,1}

Output :
1,0,5,2,2
*/

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array 1");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array 1");
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of array 2");
        int m = sc.nextInt();
        System.out.println("Enter the elements of the array 2");
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int c;
        for (int i : arr1) {
            c=0;
            for(int j : arr2){
                if(i<=j){
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
