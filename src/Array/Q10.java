package Array;

/*Write a Java class, Flower, that has three instance variables of type String, int, and float, which respectively represent the name
 of the flower, its number of petals, and price. Your class must include a constructor method that initialises each variable to an
 appropriate value, and your class should include methods for setting the value of each type, and getting the value of each type.
  Create an array of 5 Flower objects and print the value.
 */

import java.util.Scanner;

public class Q10 {
    String name;
    int petals;
    float price;

    Q10(String name, int petals, float price){
        this.name=name;
        this.petals=petals;
        this.price=price;
    }

    // Using getter setter method

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getPetals() {
//        return petals;
//    }
//
//    public void setPetals(int petals) {
//        this.petals = petals;
//    }
//
//    public float getPrice() {
//        return price;
//    }
//
//    public void setPrice(float price) {
//        this.price = price;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q10[] arr = new Q10[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = new Q10(sc.next(),sc.nextInt(), sc.nextFloat());
        }
        for (Q10 i : arr) {
            System.out.println(i.name + " " + i.petals + " " + i.price);
        }

        //USING GETTER AND SETTER METHOD
//        for(int i=0; i<arr.length; i++){
//            arr[i].setName(sc.next());
//            arr[i].setPetals(sc.nextInt());
//            arr[i].setPrice(sc.nextFloat());
//        }
//        for(Q10 i : arr){
//            System.out.println(i.getName() + " " + i.getPetals() + " " + i.getPrice());
//        }
    }
}
