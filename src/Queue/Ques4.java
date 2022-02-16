package Queue;

// given a numeric string, check whether the number is step number or not.
//A number is called stepping number if all adjacent digits have an absolute difference of 1. 321 is a Stepping Number while 421 is not.

class Nod111{
    boolean data;
    Nod111 next;
    Nod111(boolean data){
        this.data = data;
    }
}
public class Ques4 {
    Nod111 front,rear;
    public void enqueue(boolean data){
        Nod111 n = new Nod111(data);
        if(front == null && rear == null){
            front = rear = n;
        }
        else {
            rear.next = n;
            rear = rear.next;
        }
    }
    public void display(){
        if(front == null && rear == null) System.out.println("Empty queue");
        else {
            Nod111 temp = front;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Ques4 obj = new Ques4();
        for (String arg : args) {
            int c = 0;
            for (int j = 0; j < arg.length()-1; j++) {
                int i = Integer.parseInt(String.valueOf(arg.charAt(j + 1))) - Integer.parseInt(String.valueOf(arg.charAt(j)));
                if (i == 1 || i == -1) c++;
            }
            obj.enqueue(c == arg.length() - 1);
        }
    }
}
