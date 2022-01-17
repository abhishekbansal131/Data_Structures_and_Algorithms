package Array;

/*Create an application that store a sequence of high score entries(with name and score) for a video game in an array. */


import java.util.Scanner;

public class GameEntry {
    private final int score;
    private final String name;
    public GameEntry(int score, String name) {
        this.score = score;
        this.name = name;
    }
    public int getScore() { return score; }
    public String getName() { return name; }
    @Override
    public String toString() {
        return "("+score + ", "+ name+ ")";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of entries in the arrays");
        int n = sc.nextInt();
        System.out.println("Enter the entries");
        GameEntry[] arr = new GameEntry[n];
        for (int i=0; i<n; i++) {
            arr[i] = new GameEntry(sc.nextInt(),sc.next());
        }
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i!=j){
                    if(arr[i].getScore() > arr[j].getScore()){
                        GameEntry temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        System.out.println("After arranging in sequence of high score the entries are--->");
        for(GameEntry i : arr){
            System.out.print(i.toString() + " ");
        }
    }
}

