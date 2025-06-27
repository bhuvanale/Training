import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>(); 
            System.out.println("is queue empty ? "+q.isEmpty());
            System.out.println("size of queue: "+q.size());
            q.add(10);
            q.offer(20);
            q.add(30);
            q.offer(40);
            System.out.println("Queue : "+q);
            q.add(100);
            q.add(20);
            System.out.println("Queue : "+q);
            q.poll();
            q.poll();
            System.out.println("Queue : "+q);
            System.out.println("peek element: "+q.peek());
            System.out.println("does q contains 40 : "+q.contains(40));
        
    }
}