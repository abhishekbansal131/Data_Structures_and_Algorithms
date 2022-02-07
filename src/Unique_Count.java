import java.util.Scanner;

public class Unique_Count {
    public int count(int input1){
        char[] arr = String.valueOf(input1).toCharArray();
        int c=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]) arr[j]=0;
            }
        }
        for(int i : arr){
            if(i!=0) c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new Unique_Count().count(sc.nextInt()));
    }
}
