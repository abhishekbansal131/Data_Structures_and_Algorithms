package SORTING;

public class INSERTION_SORT {
    public static void main(String[] args) {
        int[] arr = {2,1,7,5,3,9};
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i;
            while (j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
        for(int i : arr) System.out.print(i + " ");
    }
}
