import java.math.BigInteger;
import java.util.Scanner;

public class Abc {

    public BigInteger fac(int n)
    {
        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= n; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }

    public int zero(BigInteger n){
        int c=0;
        while(n.intValue() != 0){
            BigInteger rem = n.remainder(BigInteger.valueOf(10));
            if(rem.equals(BigInteger.valueOf(0))){
                c++;
            }
            else
                break;
            n=n.divide(BigInteger.valueOf(10));
        }
        return c;
    }

    public static void main(String[] args) {
        Abc obj = new Abc();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        for(int i=1; i!=0; i++){
            if(obj.zero(obj.fac(i))==a){
                System.out.println(i);
                break;
            }
        }
    }
}
