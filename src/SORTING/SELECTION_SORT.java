package SORTING;

/*arr[] = 64 25 12 22 11

// Find the minimum element in arr[0...4]
// and place it at beginning
        11 25 12 22 64

// Find the minimum element in arr[1...4]
// and place it at beginning of arr[1...4]
        11 12 25 22 64

// Find the minimum element in arr[2...4]
// and place it at beginning of arr[2...4]
        11 12 22 25 64

// Find the minimum element in arr[3...4]
// and place it at beginning of arr[3...4]
        11 12 22 25 64
*/

import java.util.Scanner;

public class SELECTION_SORT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int index;
        for(int i=0; i<size; i++) arr[i] = sc.nextInt();
        for (int i=0; i<size-1; i++){
            index = i;
            for(int j=i+1; j<size; j++){
                if(arr[j]<arr[index]) {index = j;}
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int i: arr) System.out.println(i);
    }
}
