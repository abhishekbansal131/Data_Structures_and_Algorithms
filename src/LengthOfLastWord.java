import java.util.Scanner;

class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int c=0;
        int n = s.length()-1;
        for(int i=n; i>=0; i--){
            if(Character.toString(s.charAt(n)).equals(" ")) n = n-1;
            else{
                if(Character.toString(s.charAt(i)).equals(" ")) break;
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(lengthOfLastWord(sc.nextLine()));
    }
}