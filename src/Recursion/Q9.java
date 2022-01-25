package Recursion;

/*write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that
contains only numbers, you need to convert the string into a corresponding integer and return the answer.

Sample Input:
“2029”

Sample Output:
2029
 */

import java.util.Scanner;

public class Q9 {
    public static void value(String s, int i){
        if(i<s.length()){
            System.out.print(Integer.parseInt(String.valueOf(s.charAt(i))));
            value(s,i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numeric string");
        String s = sc.next();
        value(s,0);
    }
}
