package Recursion;

//print all values from 0 to 100 in lexicographical order

public class Lexicographical {
    public static void lexica(int initial, int end){
        if(initial>end) return; //BASE CONDITION
        System.out.println(initial);
        int i=0;
        if(initial==0) i=1;  // WHILE INITIAL IS 0, WE WILL ADD VALUE FROM 1 TO 9 (i.e. total 9 values) OTHERWISE, 0 TO 9 (10 values)
        while(i<10){
            lexica(initial*10 + i,end);
            i++;
        }
    }

    public static void main(String[] args) {
        lexica(0,100);
    }
}
