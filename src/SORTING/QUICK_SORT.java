package SORTING;

public class QUICK_SORT {
    public static void quick_sort(int[] arr, int low, int high){
        if (low < high){
            int pivot = partition(arr, low, high); // It will give us the index of pivot;
            quick_sort(arr, low, pivot-1);
            quick_sort(arr, pivot+1, high);
        }
    }
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;  /// Index of smaller element and indicates the right position of pivot found so far
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Now, take pivot to the sorted position in the array (BY SWAPPING arr[i+1] & arr[high])
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i; // returning index of pivot
    }

    public static void main(String[] args) {
        int[] arr = {4,2,3,6,5,3,7};
        int n = arr.length;
        quick_sort(arr, 0, n-1);
        for(int i : arr) System.out.print(i + " ");
    }
}
