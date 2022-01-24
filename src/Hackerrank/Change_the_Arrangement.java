package Hackerrank;

/*There are N students in a classroom, and they are seated in a linear order. The teacher plans to change the seating arrangement of
all the students in such a way that each student sits on the new bench every day. For example, student sitting at first bench moves to
 the second bench

        Input Format

        An integer N denoting number of students An array arr[n]

        Constraints

        1

        Output Format

        An array displaying the required seating arrangement

        Sample Input 0
        6
        James Logan Mason Jacob Lucas Ethan

        Sample Output 0
        Ethan James Logan Mason Jacob Lucas
 */

import java.util.Scanner;

public class Change_the_Arrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }
        System.out.print(arr[n-1] + " ");
        for(int i=0; i<n-1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
