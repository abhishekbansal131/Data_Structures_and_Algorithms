/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class THE_LEAD_GAME
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> b1 = new ArrayList<>();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i=0; i<n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(i==0){
                if(x[i] > y[i]){
                    a1.add(x[i]-y[i]);
                }
                else b1.add(y[i]-x[i]);
            }
            else{
                x[i] += x[i-1];
                y[i] += y[i-1];
                if(x[i] > y[i]){
                    a1.add(x[i]-y[i]);
                }
                else b1.add(y[i]-x[i]);
            }
        }

        int sum1=0, sum2=0;
        for(Integer i : a1){
            if(i>sum1) sum1 = i;
        }
        for(Integer i : b1){
            if(i>sum2) sum2 = i;
        }

        if(sum1>sum2){
            System.out.print(1 + " " + sum1);
        }
        else System.out.print(2 + " " + sum2);
    }
}
