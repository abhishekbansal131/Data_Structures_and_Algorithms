package Queue;

//if ascii value of character in string is odd, move all those characters in left side, otherwise in right side
// "ABCDEF" -----> "ACEBDF"

class Nod{
    String data;
    Nod next;
    Nod(String data){
        this.data = data;
    }
}
public class Ques2 {
    Nod front,rear;
    public void enqueue(String data){
        Nod n = new Nod(data);
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
            Nod temp = front;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Ques2 obj = new Ques2();
        String[] arr ={"ABCDEF"};
        for (String arg : arr) {
            String str1 = "";
            String str2 = "";
            for (int j = 0; j < arg.length(); j++) {
                if (arg.charAt(j) % 2 != 0) str1 += arg.charAt(j);
                else str2 += arg.charAt(j);
            }
            obj.enqueue(str1 + str2);
        }
        obj.display();
    }
}
