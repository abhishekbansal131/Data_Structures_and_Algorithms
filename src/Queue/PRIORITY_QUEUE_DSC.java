package Queue;

class Nodeiii<T>{
    T data, priority;
    Nodeiii<T> next;

    public Nodeiii(T data, T priority) {
        this.data = data;
        this.priority = priority;
    }
}
public class PRIORITY_QUEUE_DSC {
    Nodeiii<Integer> front, rear;
    public void enqueue(Nodeiii<Integer> n){
        if(front == null){
            front = rear = n;
        }
        else{
            if(rear.priority > n.priority){
                rear.next = n;
                rear = n;
            }
            else if(front.priority < n.priority){
                n.next = front;
                front = n;
            }
            else {
                Nodeiii<Integer> temp = front;
                while(temp.next != null){
                    if(temp.next.priority <= n.priority) {
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
            Nodeiii<Integer> temp = front;
            while(temp!=null){
                System.out.println(temp.data + "   " + temp.priority);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        PRIORITY_QUEUE_DSC obj = new PRIORITY_QUEUE_DSC();
        obj.enqueue(new Nodeiii<>(10,3));
        obj.enqueue(new Nodeiii<>(20,8));
        obj.enqueue(new Nodeiii<>(30,1));
        obj.enqueue(new Nodeiii<>(40,0));
        obj.enqueue(new Nodeiii<>(60,3));
        obj.enqueue(new Nodeiii<>(80,2));
        obj.display();
    }
}

