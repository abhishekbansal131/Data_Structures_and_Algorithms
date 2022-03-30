package TREE;

import java.util.Scanner;

public class TREE_BY_ARRAY {
    int[] arr;
    int lastusedindex;

    public TREE_BY_ARRAY(int size) {
        arr = new int[size + 1];
        lastusedindex = 0;
    }
    public void insert(int val){
        if(lastusedindex > arr.length-1) return;
        lastusedindex++;
        arr[lastusedindex] = val;
    }
    public void preorder(int idx){
        if(idx > lastusedindex) return;
        System.out.print(arr[idx] + " ");
        preorder(idx * 2);
        preorder((2 * idx) + 1);
    }
    // FOR DELETION, WE HAVE TO SEARCH THAT NODE AND THAT REPLACE THAT NODE BY LAST NODE
    public int search(int val){
        for(int i=1; i<=lastusedindex; i++) {
            if(arr[i] == val) return i;
        }
        return -1;
    }
    public void delete(int val){
        int idx = search(val);
        if(idx == -1) return;
        arr[idx] = arr[lastusedindex];
        lastusedindex--;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TREE_BY_ARRAY obj = new TREE_BY_ARRAY(7);
        for(int i = 1; i < obj.arr.length; i++){
            obj.insert(sc.nextInt());
        }
        obj.preorder(1);
        obj.delete(20);
        System.out.println();
        obj.preorder(1);
    }
}