package Hackerrank;

/*Alina joined the company last week. She receives the company mails in bulk, and it is very hectic to go through each and every mail.
She wants to filter out the emails that are related to Human Resources(HR) Department. So help her make the list of the designations
that are related to HR.


Write a program that accepts designations in a String array. Check the given array elements containing "HR" and display the total
number of elements that contains "HR" and display the elements in the upper case. If no elements contains "HR" then return "-1" as
output.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Designation_challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        ArrayList<String> a = new ArrayList<>();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] =sc.next();
        }
        for(int i=0; i<n; i++){
            if(arr[i].contains("HR")){
                c++;
                a.add(arr[i]);
            }
        }
        if(c==0) {
            System.out.println(-1);
            return;
        }
        System.out.println(c);
        for (String s : a) {
            System.out.println(s.toUpperCase());
        }
    }
}
