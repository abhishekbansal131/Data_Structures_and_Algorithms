// SORTING THE STRING ACCORDING TO THE FREQUENCY OF EACH CHARACTER

class Fre{
    char a;
    int count;

    public Fre(char a, int count) {
        this.a = a;
        this.count = count;
    }
}
public class STRING_SORT_USING_FREQUENCY {
    public static void main(String[] args) {
        String s = "aniruddacharya";
        int c=0;
        Fre[] arr = new Fre[s.length()];
        for(int i=0; i<s.length(); i++){
            for (int j= 0; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    c++;
                }
            }
            arr[i] = new Fre(s.charAt(i),c);
            c=0;
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i].count > arr[j].count){
                    Fre temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(Fre i : arr){
            System.out.print(i.a);
        }
    }
}
