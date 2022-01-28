package GFG.Array;

/*Inversion Count for an array indicates – how far (or close) the array is from being sorted. If the array is already sorted,
then the inversion count is 0, but if the array is sorted in the reverse order, the inversion count is the maximum.
 */

public class COUNT_INVERSION {
    public static void main(String[] args) {
        int[] arr = {8,4,2,1};
        int c=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
