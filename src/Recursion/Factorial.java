package Recursion;

import java.util.Scanner;

public class Factorial {

    // Using Head Recursion

//    public static int fac(int n){
//        if(n==0 || n==1){
//            return 1;
//        }
//        return n*fac(n-1);
//    }

    // Using Tail Recursion

    public static void fac(int n, int sum){
        if(n==0 || n==1){
            System.out.println(sum);
            return;
        }
        fac(n-1,sum*n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
//      System.out.println(fac(n));  // For head recursion
        fac(n,1);
    }
}
