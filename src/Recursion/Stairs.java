package Recursion;

import java.util.Scanner;

public class Stairs {
    public static int ways(int n){
        if(n<0) return 0;
        if(n==0) return 1;
        return ways(n-1) + ways(n-2) + ways(n-3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs");
        int n = sc.nextInt();
        System.out.println(ways(n));
    }
}
