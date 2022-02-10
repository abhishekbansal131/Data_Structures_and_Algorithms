/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class THE_BLOCK_GAME
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            while(n!=0){
                a.add(n%10);
                n /= 10;
            }
            int c=0;
            for(int i=0; i<a.size(); i++){
                if(a.get(i) == a.get(a.size()-i-1)) c++;
            }
            if(c==a.size()) System.out.println("wins");
            else System.out.println("loses");
            t--;
        }
    }
}
