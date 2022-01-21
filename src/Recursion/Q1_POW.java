package Recursion;

/*Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
Do this recursively.
Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
Sample Input 1 :
 3 4
Sample Output 1 :
81
*/

import java.util.Scanner;

public class Q1_POW {
    public static int power(int val , int p){
        if(p==0) return 1;
        return val*power(val,p-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("The value of a raise to the power b is");
        System.out.println(power(a,b));
    }
}
