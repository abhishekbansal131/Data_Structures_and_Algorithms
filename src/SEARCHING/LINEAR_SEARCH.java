package SEARCHING;

public class LINEAR_SEARCH {
    public static int search(int[] arr, int searchValue){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == searchValue) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(search(arr, 6));
    }
}