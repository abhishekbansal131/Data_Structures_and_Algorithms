package Array;

/*There is a company that manufactures three types of products. In this company, there are 5 salesmen. Each
 salesman is supposed to sell three products. Write a program to print

(i) The total no of sales by each salesman and

(ii) total sales of each item.

The structure of the class Company is as follows:-

class Company
{
	int products[];
}

HInt:-
Company salesman[]= new Company[5];

Output :-
Enter the sales of 3 items sold by salesman 1: 23 23 45
Enter the sales of 3 items sold by salesman 2: 34 45 63
Enter the sales of 3 items sold by salesman 3: 36 33 43
Enter the sales of 3 items sold by salesman 4: 33 52 35
Enter the sales of 3 items sold by salesman 5: 32 45 64
Total Sales By Salesman 1 = 91
Total Sales By Salesman 2 = 142
Total Sales By Salesman 3 = 112
Total Sales By Salesman 4 = 120
Total Sales By Salesman 5 = 141
Total sales of item 1 = 158
Total sales of item 2 = 198
Total sales of item 3 = 250 */

import java.util.Scanner;

public class Q2 {
    int[] products;
}
class Sales{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q2[] sals = new Q2[5];
        for (int i = 0; i < sals.length; i++) {
            sals[i] = new Q2();
            sals[i].products = new int[3];
            System.out.println("Enter the sales of 3 items sold by salesman" + " " + (i + 1));
            for (int j = 0; j < sals[i].products.length; j++) {
                sals[i].products[j] = sc.nextInt();
            }
        }
        for (Q2 i : sals) {
            System.out.print("Enter the sales of 3 items sold by salesman : ");
            for (int j : i.products) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        int sum;
        for (Q2 i : sals) {
            sum = 0;
            for (int j : i.products) {
                sum += j;
            }
            System.out.println("Total Sales By Salesman" + " " + sum);
        }
        for (int i = 0; i < 3; i++) {
            sum=0;
            for (int j = 0; j < 5; j++) {
                sum += sals[j].products[i];
            }
            System.out.println("Total sales of item" + " " + (i+1) + " " + sum);
        }
    }
}
