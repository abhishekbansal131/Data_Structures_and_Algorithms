package Array;

/*Consider an array MARKS[4][5] which stores the marks obtained by 4 students in 5 subjects. Now write a program to
(a) find the average marks obtained in each subject.
(b) find the average marks obtained by every student.
(c) find the number of students who have scored below 50 in their average.
 (d) display the scores obtained by every student.
*/

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<4; i++){
            System.out.println("Enter the marks of " + (i+1) + " student out of 100"  );
            for(int j=0; j<5; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum,c=0;
        System.out.println("The average marks obtained in each subject are------->");
        for(int i=0; i<5; i++){
            sum=0;
            for(int j=0; j<4; j++){
                sum+=arr[j][i];
            }
            System.out.println((double) sum/4);
        }
        System.out.println("The average marks obtained by every student are--------->");
        for(int i=0; i<4; i++){
            sum=0;
            for(int j=0; j<5; j++){
                sum+=arr[i][j];
            }
            System.out.println((double) sum/5);
            if((sum/5) < 50){
                c++;
            }
        }
        System.out.println("The number of students who have scored below 50 in their average are " + c);

        for(int i=0; i<4; i++){
            System.out.println("The marks of " + (i+1) + " student out of 100"  );
            for(int j=0; j<5; j++){
                System.out.print("In subject " + (j+1) + " ");
                System.out.println(arr[i][j]);
            }
        }
    }
}
