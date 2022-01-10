package Array;

/* Create an array of 10 students and print the record of those students who got the highest marks and who got
minimum marks. The structure of student class is as follows
class Student
{
	private int rollno;
	private int marks
	private String name;
}
// create constructor or getter and setter methods as per need*/

import java.net.Socket;
import java.util.Scanner;

class Student{
    private int rollno;
    private int marks;
    private String name;
    Student(int rollno, String name, int marks){
        this.rollno=rollno;
        this.marks=marks;
        this.name=name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[10];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter the detail for Student");
            System.out.println("Enter Roll No");
            int r = sc.nextInt();
            System.out.println("Enter the name");
            sc.next();
            String n = sc.nextLine();
            System.out.println("Enter the marks");
            int m = sc.nextInt();
            arr[i] = new Student(r,n,m);
        }
        int max=0,min=0;
        for(Student i : arr){
            if(i.marks>max){
                max=i.marks;
            }
            if(i.marks<min){
                min=i.marks;
            }
        }
        for(Student i : arr){
            if(i.marks==max){
                System.out.println("Student who got highest marks details are given below");
                System.out.println(i.rollno +" "+ i.marks +" "+ i.name);
            }
            if(i.marks==min){
                System.out.println("Student who got highest marks details are given below");
                System.out.println(i.rollno +" "+ i.marks +" "+ i.name);
            }
        }
    }
}
