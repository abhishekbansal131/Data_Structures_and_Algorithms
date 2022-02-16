package Queue;

public class DOUBLE_ENDED_QUEUE {
    int[] arr;
    int front, rear;
    DOUBLE_ENDED_QUEUE(int size){
        arr = new int[size];
        front = rear = -1;
    }
    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public boolean isFullFromRear(){
        return rear == arr.length-1;
    }
    public boolean isFullFromFront(){
        return front == 0;
    }
    public void Enqueue_from_front(int value){
        if(isFullFromFront()) System.out.println("STACK OVERFLOW");
        else if(isEmpty()){
            front++;
            rear++;
            arr[front] = value;
        }
        else {
            front--;
            arr[front] = value;
        }
    }
    public void Enqueue_from_rear(int value){
        if(isFullFromRear()) System.out.println("STACK OVERFLOW");
        else if(isEmpty()){
            front++;
            rear++;
            arr[rear] = value;
        }
        else {
            rear++;
            arr[rear] = value;
        }
    }
    public void Dequeue_from_front(){
        if(isEmpty()) System.out.println("STACK UNDERFLOW");
        else {
            if(rear == front){
                System.out.println("The deleted value is " + arr[front] + " from front end");
                arr[front] = 0;
                front = rear = -1;
            }
            else {
                System.out.println("The deleted value is " + arr[front] + " from front end");
                arr[front] = 0;
                front++;
            }
        }
    }
    public void Dequeue_from_rear(){
        if(isEmpty()) System.out.println("STACK UNDERFLOW");
        else {
            if(rear == front){
                System.out.println("The deleted value is " + arr[rear] + " from rear end");
                arr[rear] = 0;
                front = rear = -1;
            }
            else {
                System.out.println("The deleted value is " + arr[rear] + " from rear end");
                arr[rear] = 0;
                rear--;
            }
        }
    }
    public void display(){
        if(isEmpty()) System.out.println("STACK IS EMPTY");
        else {
            for(int i=front; i<=rear; i++){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        DOUBLE_ENDED_QUEUE obj = new DOUBLE_ENDED_QUEUE(5);
        obj.Enqueue_from_rear(10);
        obj.Enqueue_from_rear(20);
        obj.Enqueue_from_rear(30);
        obj.Dequeue_from_front();
        obj.Enqueue_from_front(100);
        obj.Dequeue_from_rear();
        obj.Enqueue_from_rear(200);
        obj.display();
    }
}
