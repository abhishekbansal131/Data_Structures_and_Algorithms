package LinkedList;

class Node123{
    int coeff, exp;
    Node123 next;

    public Node123(int coeff, int exp) {
        this.coeff = coeff;
        this.exp = exp;
    }
}
public class POLYNOMIAL_ADDITION {
    Node123 head;
    public boolean isEmpty(){
        return head == null;
    }
    public void insert(Node123 n){
        if(isEmpty()) head = n;
        else {
            Node123 temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = n;
        }
    }
    public int count(){
        int c=0;
        if(isEmpty()) System.out.println("EMPTY LINKED LIST");
        else {
            Node123 temp = head;
            while(temp != null){
                c++;
                temp = temp.next;
            }
        }
        return c;
    }
    public void sort(){
        if(isEmpty()) System.out.println("EMPTY LINKED LIST");
        else {
            Node123 temp1 = head, temp2;
            int temp3, temp4;
            while(temp1 != null){
                temp2 = temp1.next;
                while(temp2 != null){
                    if(temp1.exp < temp2.exp){
                        temp3 = temp1.exp;      temp4 = temp1.coeff;
                        temp1.exp = temp2.exp;  temp1.coeff = temp2.coeff;
                        temp2.exp = temp3;      temp2.coeff = temp4;
                    }
                    temp2 = temp2.next;
                }
                temp1 = temp1.next;
            }
        }
    }
    public void display(){
        if(isEmpty()) System.out.println("EMPTY LINKED LIST");
        else {
            Node123 temp = head;
            while(temp!=null){
                System.out.print(temp.coeff + "x^" + temp.exp);
                if(temp.next != null) System.out.print(" + ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        POLYNOMIAL_ADDITION obj1 = new POLYNOMIAL_ADDITION(); // 1st Polynomial
        POLYNOMIAL_ADDITION obj2 = new POLYNOMIAL_ADDITION(); // 2nd Polynomial
        POLYNOMIAL_ADDITION obj3 = new POLYNOMIAL_ADDITION(); // RESULTANT POLYNOMIAL
        obj1.insert(new Node123(3,2));
        obj1.insert(new Node123(4,1));
        obj1.insert(new Node123(5,3));
        obj2.insert(new Node123(-8,1));
        obj2.insert(new Node123(-5,3));
        obj2.insert(new Node123(6,2));
        obj1.sort();
        obj2.sort();
        obj1.display();
        Node123 temp1 = obj1.head;
        Node123 temp2 = obj2.head;
        while(temp1 != null && temp2 != null){
            if(obj1.count() == obj2.count()) {
                if (temp1.exp == temp2.exp) {
                    obj3.insert(new Node123(temp1.coeff + temp2.coeff, temp1.exp));
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                } else if (temp1.exp > temp2.exp) {
                    obj3.insert(new Node123(temp1.coeff, temp1.exp));
                    temp1 = temp1.next;
                } else {
                    obj3.insert(new Node123(temp2.coeff, temp2.exp));
                    temp2 = temp2.next;
                }
            }
            else if(obj1.count() > obj2.count()){
                while(temp1 != null){
                    if(temp2.exp == temp1.exp) {
                        obj3.insert(new Node123(temp1.coeff + temp2.coeff,temp1.exp));
                        if(temp2.next != null) temp2 = temp2.next;
                    }
                    else {
                        obj3.insert(new Node123(temp1.coeff , temp1.exp));
                    }
                    temp1 = temp1.next;
                }
                temp2 = null;
            }
            else {
                while(temp2 != null){
                    if(temp1.exp == temp2.exp) {
                        obj3.insert(new Node123(temp2.coeff + temp1.coeff,temp2.exp));
                        if(temp1.next != null) temp1 = temp1.next;
                    }
                    else {
                        obj3.insert(new Node123(temp2.coeff , temp2.exp));
                    }
                    temp2 = temp2.next;
                }
                temp1 = null;
            }
        }
        obj3.display();
    }
}
