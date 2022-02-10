import java.util.Scanner;

class MAX_CONSECUTIVE_ONE {
    public static int findMaxConsecutiveOnes(int[] arr) {
        int c=0,max=0;
        for (int j : arr) {
            if (j == 1) c++;
            else c = 0;
            if (c > max) max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}