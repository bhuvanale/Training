public class QueueUsingArray {

    int size;
    int front, rear;
    int[] queue;

    public QueueUsingArray(int size) {
        this.size = size;
        front = -1;
        rear = -1;
        queue = new int[size];
    }

    public boolean isEmpty() {
        if(front == -1 || front > rear){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public void enqueue(int value) {
        if (rear == size-1) {
            System.out.println("Queue is overflow...");
            return;
        }
        if(front == -1){
            front = 0;

        }
        queue[++rear] = value;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is underflow...");
            return;
        }
        System.out.println("Dequeued: " + queue[front++]);
        
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        } 

            System.out.println("Front element: " + queue[front]);
        
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " | ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.peek();

        q.dequeue();
        q.display();

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); 
        q.display();
    }
}
