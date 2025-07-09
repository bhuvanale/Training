public class CicularQueueUsingArray {

    int []queue;
    int front,rear,size;

    public CicularQueueUsingArray(int size){
        this.size=size;
        queue = new int[size];
        front = rear = -1;
    }

    public boolean isEmpty(){
       return front == -1;
    }

    public boolean isFull(){
        return front == (rear+1)%size;
    }

    public void enqueue(int val){
        if(isFull()){
            System.out.println("Queue is full.....");
            return;
        }
        if(isEmpty()){
            front = rear = 0;
        } else{
            rear = (rear+1)%size;
        }
        queue[rear]=val;
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty......");
        }

        System.out.println(queue[front]+" Deleted......");

        if(front == rear){
            front = rear = -1;
        }
        else{
            front= (front+1)%size;
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty.......");
        }

        int i =front;
        System.out.println("Queue elements are : ");
        while (true) {
            System.out.print(queue[i]+" ");

            if(i==rear) break;

            i = (i+1)%size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        CicularQueueUsingArray cq = new CicularQueueUsingArray(4);

        System.out.println("is queue empty: "+cq.isEmpty());

        cq.enqueue(10);

        cq.enqueue(20);

        cq.enqueue(30);

        cq.enqueue(40);

        cq.enqueue(50);

        cq.display();;

        cq.dequeue();

        cq.dequeue();

        cq.display();;

        cq.enqueue(50);

        cq.enqueue(60);

        cq.display();

    }

}