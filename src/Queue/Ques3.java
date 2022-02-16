package Queue;

//Given a numeric string, find sum of sums of that string
//"12345" ---> (1+2+3+4+5) + (2+3+4+5) + (3+4+5) + (4+5) + (5) = 55

class Nod10{
    String data;
    Nod10 next;
    Nod10(String data){
        this.data = data;
    }
}
public class Ques3 {
    Nod10 front,rear;
    public void enqueue(String data){
        Nod10 n = new Nod10(data);
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
            Nod10 temp = front;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Ques3 obj = new Ques3();
            for (String arg : args) {
                int k = 0, sum = 0;
                for (int j = 0; j < arg.length(); j++) {
                    sum += Integer.parseInt(String.valueOf(arg.charAt(j)));
                    if (j == arg.length() - 1) {j = k++;}
                }
                obj.enqueue(String.valueOf(sum));
            obj.display();
        }
    }
}
