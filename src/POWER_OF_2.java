import java.util.Scanner;

class POWER_OF_2 {
    public static boolean isPowerOfTwo(int n) {
        while(n!=0){
            if(n==1) return true;
            if(n%2 != 0) return false;
            n = n/2;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPowerOfTwo(sc.nextInt()));
    }
}