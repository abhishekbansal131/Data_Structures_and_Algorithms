package Array;

/*Mr. Bean is very good at Mathematics. He was given a number n and was told to find out number of trailing zeroes in n! (Factorial) .
 Can you help him?


Sample Input
5
Sample Output
1
Explanation
5! (Factorial) is 120, so there is one trailing zero. */

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int fac=1,c=0;
        for(int i=1; i<=n; i++){
            fac*=i;
        }
        while(fac!=0){
            int rem = fac%10;
            if(rem == 0){
                c++;
            }
            else{
                break;
            }
            fac/=10;
        }
        System.out.println("No. of trailing zeroes are " + c);
    }
}
