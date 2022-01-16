package Array;

/*Write a program to input the elements of a two-dimensional array. Then from this array, make two arrays one that stores all odd
elements of the two-dimensional array and the other that stores all even elements of the array.
Note:-  Resulting arrays will be of ArrayList type
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 2D array in the form of row and column");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]%2==0){
                    a1.add(arr[i][j]);
                }
                else
                    a2.add(arr[i][j]);
            }
        }

        System.out.println("Even elements array " + a1);
        System.out.println("Odd elements array " + a2);
    }
}
