package StackByLLAndArray;

import java.util.Scanner;

public class Menu_Driven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 0 for implementing stack using ARRAY\nPress 1 for implementing stack using SINGLY LINKED LIST\nPress 2 for implementing stack using DOUBLY LINKED LIST");
        int choice = sc.nextInt();
        if(choice == 0){
            System.out.println("Enter the size of the array");
            int size = sc.nextInt();
            StackByArray obj = new StackByArray(size);
            while (true) {
                System.out.println("Press 0 for PUSH operation\nPress 1 for POP operation\nPress 2 for Traversal\nPress 3 for exit");
                int c = sc.nextInt();
                if(c==3) break;
                switch (c) {
                    case 0 -> {
                        System.out.println("Enter the data");
                        int data = sc.nextInt();
                        obj.push(data);
                        System.out.println("PUSH operation done successfully\n");
                    }
                    case 1 -> {
                        obj.pop();
                        System.out.println("POP operation done successfully\n");
                    }
                    case 2 -> obj.traverse();
                    default -> System.out.println("Please Enter a valid choice");
                }
            }
        }
        else if (choice==1){
            StackBySLL obj = new StackBySLL();
            while (true) {
                System.out.println("Press 0 for PUSH operation\nPress 1 for POP operation\nPress 2 for Traversal\nPress 3 for exit");
                int c = sc.nextInt();
                if(c==3) break;
                switch (c) {
                    case 0 -> {
                        System.out.println("Enter the data");
                        int data = sc.nextInt();
                        obj.push(data);
                        System.out.println("PUSH operation done successfully\n");
                    }
                    case 1 -> {
                        obj.pop();
                        System.out.println("POP operation done successfully\n");
                    }
                    case 2 -> obj.traverse();
                    default -> System.out.println("Please Enter a valid choice");
                }
            }
        }
        else if(choice == 2){
            StackByDLL obj = new StackByDLL();
            while (true) {
                System.out.println("Press 0 for PUSH operation\nPress 1 for POP operation\nPress 2 for Traversal\nPress 3 for exit");
                int c = sc.nextInt();
                if(c==3) break;
                switch (c) {
                    case 0 -> {
                        System.out.println("Enter the data");
                        int data = sc.nextInt();
                        obj.push(data);
                        System.out.println("PUSH operation done successfully\n");
                    }
                    case 1 -> {
                        obj.pop();
                        System.out.println("POP operation done successfully\n");
                    }
                    case 2 -> obj.display();
                    default -> System.out.println("Please Enter a valid choice");
                }
            }
        }
        else System.out.println("Invalid choice");
    }
}
