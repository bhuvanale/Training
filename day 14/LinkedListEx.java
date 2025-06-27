import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        System.out.println("Linked list : "+l1.size());
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(null);
        System.out.println("List - 1 : "+l1);
        l1.addFirst(100);//Always stores at 0 index
        System.out.println("List - 1 : "+l1);
        l1.addFirst(200);
        l1.addLast(300);
        System.out.println("List - 1 : "+l1);
        System.out.println("get first : "+l1.getFirst());
        System.out.println("get last : "+l1.getLast());
        l1.remove(3);
        System.out.println("List - 1 : "+l1);
        l1.removeFirst();
        System.out.println("List - 1 : "+l1);
        l1.removeLast();
        System.out.println("List - 1 : "+l1);
        

    }
}
