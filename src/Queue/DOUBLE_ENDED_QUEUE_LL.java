package Queue;

class Noode{
    int data;
    Noode next;

    public Noode(int data) {
        this.data = data;
    }
}
public class DOUBLE_ENDED_QUEUE_LL {
    Noode front, rear;
    public boolean isEmpty(){
        return front == null && rear == null;
    }
    public void Enqueue_from_front(Noode n){
        if(isEmpty()) front = rear = n;
        else {
            n.next = front;
            front = n;
        }
    }
    public void Enqueue_from_rear(Noode n){
        if(isEmpty()) front = rear = n;
        else {
            rear.next = n;
            rear = n;
        }
    }
    public void Dequeue_from_front(){
        if(isEmpty()) System.out.println("STACK UNDERFLOW");
        else {
            System.out.println("The deleted value is " + front.data + " from front end");
            front = front.next;
        }
    }
    public void Dequeue_from_rear(){
        if(isEmpty()) System.out.println("STACK UNDERFLOW");
        else {
            Noode temp = front;
            while(temp.next.next != null){
                temp = temp.next;
            }
            System.out.println("The deleted value is " + temp.next.data + " from rear end");
            rear = temp;
            rear.next = null;
        }
    }
    public void display(){
        if(isEmpty()) System.out.println("STACK IS EMPTY");
        else {
            Noode temp = front;
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        DOUBLE_ENDED_QUEUE_LL obj = new DOUBLE_ENDED_QUEUE_LL();
        obj.Enqueue_from_front(new Noode(100));
        obj.Enqueue_from_front(new Noode(200));
        obj.Enqueue_from_rear(new Noode(300));
        obj.Dequeue_from_front();
        obj.Dequeue_from_rear();
        obj.display();
    }
}
