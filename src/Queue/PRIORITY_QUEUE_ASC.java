package Queue;

class Nodei{
    int data, priority;
    Nodei next;

    public Nodei(int data, int priority) {
        this.data = data;
        this.priority = priority;
    }
}
public class PRIORITY_QUEUE_ASC {
    Nodei front, rear;
    public void enqueue(Nodei n){
        if(front == null){
            front = rear = n;
        }
        else{
            if(rear.priority < n.priority){
                rear.next = n;
                rear = n;
            }
            else if(front.priority > n.priority){
                n.next = front;
                front = n;
            }
            else {
                Nodei temp = front;
                while(temp.next != null){
                    if(temp.next.priority >= n.priority) {
                        n.next = temp.next;
                        temp.next = n;
                        break;
                    }
                    temp = temp.next;
                }
            }
        }
    }
    public void display(){
        if(front == null && rear == null) System.out.println("EMPTY QUEUE");
        else {
            Nodei temp = front;
            while(temp!=null){
                System.out.println(temp.data + "   " + temp.priority);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        PRIORITY_QUEUE_ASC obj = new PRIORITY_QUEUE_ASC();
        obj.enqueue(new Nodei(10,3));
        obj.enqueue(new Nodei(20,8));
        obj.enqueue(new Nodei(30,1));
        obj.enqueue(new Nodei(40,7));
        obj.enqueue(new Nodei(60,3));
        obj.enqueue(new Nodei(80,2));
        obj.display();
    }
}
