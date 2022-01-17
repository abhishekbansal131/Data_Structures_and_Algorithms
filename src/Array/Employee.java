package Array;

/*Q. Write a program to create a class (Employee) with the information given below.

1. emp_id
2. name
	1. first_name
	2. last_name
3. address
    1. area
    2. city
    3. state
4. salary
5. designation

Read and print the data by creating  Employee array*/

import java.util.Scanner;

class Name{
    String first_name,last_name;

    Name(String first_name, String last_name){
        this.first_name=first_name;
        this.last_name=last_name;
    }
}

class Address{
    String area,city,state;

    public Address(String area, String city, String state) {
        this.area = area;
        this.city = city;
        this.state = state;
    }
}
public class Employee {
    int emp_id;
    Name name;
    Address address;
    int salary;
    String designation;

    public Employee(int emp_id, Name name, Address address, int salary, String designation) {
        this.emp_id = emp_id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.designation = designation;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int n = sc.nextInt();
        Employee[] arr = new Employee[n];
        System.out.println("Enter the details of each Employee in the following sequence\nFirst Enter the Employee id\nEnter the first name\nEnter the last name\nEnter the area\nEnter the city\nEnter the state\nEnter the salary\nEnter the designation\n");
        for(int i=0; i<n; i++){
            System.out.println("Enter the details of " + (i+1) + " Employee");
            arr[i] = new Employee(sc.nextInt(), new Name(sc.next(),sc.next()), new Address(sc.next(),sc.next(),sc.next()), sc.nextInt(), sc.next());
        }
        System.out.println();
        System.out.println("The details of employee are given below\n");
        for(Employee i : arr){
            System.out.println("Employee ID :- " + i.emp_id + "\nEmployee name :- " + i.name.first_name + " " + i.name.last_name + "\nEmployee Address :- " + i.address.area + " " + i.address.city + " " + i.address.state + "\nEmployee Salary :- " + i.salary + "\nEmployee designation :- " + i.designation + "\n");
        }
    }
}
