import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> s  = new Stack<>();

        System.out.println("is stack empty: "+s.isEmpty());
        System.out.println("Stack Capacity: "+s.capacity());
        System.out.println("stack size: "+s.size());

        s.add(10);
        s.push(20);
        s.add(30);
        s.push(40);

        System.out.println("Stcak: "+s);
        System.out.println("is stack empty: "+s.isEmpty());
        System.out.println("Stack Capacity: "+s.capacity());
        System.out.println("stack size: "+s.size());

        s.pop();
        System.out.println("peek element : "+s.peek());
        System.out.println("Search of 30 from top: "+s.search(30));
        System.out.println("Search of 10 from top: "+s.search(10));
        System.out.println("Search of 40 from top: "+s.search(40));


    }
}
