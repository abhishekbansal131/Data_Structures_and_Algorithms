package Recursion;

public class TOWER_OF_HANOI {
    public static void TOH(int n, char a, char b, char c){
        if(n==1){
            System.out.println("disk " + n + " from " + a + " to " + c);
        }
        else{
            TOH(n-1,a,c,b);
            System.out.println("disk " + n + "from " + a + "to " + c);
            TOH(n-1,b,a,c);
        }
    }

    public static void main(String[] args) {
        TOH(3,'A','B','C');
    }
}
