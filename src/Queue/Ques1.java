package Queue;

//Given a string, break it from its mid-point and then reverse the portion of left side and right side of mid-point.
// "AYUSH" ----> "YAUHS"

class Nod11{
    String data;
    Nod11 next;
    Nod11(String data){
        this.data = data;
    }
}
public class Ques1 {
    Nod11 front,rear;
    public void enqueue(String data){
        Nod11 n = new Nod11(data);
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
            Nod11 temp = front;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Ques1 obj = new Ques1();
        for (String arg : args) {
            int a = arg.length() / 2;
            StringBuilder s1 = new StringBuilder();
            StringBuilder s2 = new StringBuilder();
            StringBuilder s3 = new StringBuilder();
            for (int j = 0; j < arg.length(); j++) {
                if (j < a) s1.append(arg.charAt(j));
                else if (j > a) s3.append(arg.charAt(j));
                else s2.append(arg.charAt(j));
            }
            obj.enqueue(s1.reverse() + s2.toString() + s3.reverse());
        }
        obj.display();
    }
}
