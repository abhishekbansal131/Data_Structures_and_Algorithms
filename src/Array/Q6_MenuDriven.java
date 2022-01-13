package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q6_MenuDriven {
    int[] arr;
    public Q6_MenuDriven(){
        arr = new int[5];
        Arrays.fill(arr, Integer.MIN_VALUE);
    }
    public void insert(int value, int index){
        try{
            if(arr[index]==Integer.MIN_VALUE) {
                arr[index] = value;
                System.out.println("Insertion operation done successfully");
            }
            else{
                System.out.println("Already filled");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
    }

    public void delete(int index){
        try {
            if (arr[index] != Integer.MIN_VALUE) {
                arr[index] = Integer.MIN_VALUE;
                System.out.println("Deletion operation done successfully");
            }
            else {
                System.out.println("Already deleted");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q6_MenuDriven obj = new Q6_MenuDriven();
        System.out.println("For Insertion operation press 1, for deletion operation press 2 and for exit press 3");

        while(true) {
            int choice = sc.nextInt();
            if (choice == 1) {

                obj.insert(2, 1);
                System.out.println("After insertion the array is------->");
                for (int i : obj.arr) {
                    System.out.println(i);
                }
            }
            else if (choice == 2) {
                obj.delete(1);
                System.out.println("After deletion the array is------->");
                for (int i : obj.arr) {
                    System.out.println(i);
                }
            }
            else if(choice==3){
                System.out.println("Thank you!");
                break;
            }
            else{
                System.out.println("Invalid choice\nplease try again");
            }
        }
    }
}
