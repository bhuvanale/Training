import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector <Integer> v = new Vector<>();
        System.out.println("initial capacity: "+v.capacity());

        System.out.println("vector size "+v.size());
        for (int i = 1; i <=10; i++) {
            v.add(i);
        }
        System.out.println("vector elements: "+v);
        System.out.println("initial capacity: "+v.capacity());
        System.out.println("vector size "+v.size());
        v.add(11);
        System.out.println();
        System.out.println("vector elements: "+v);
        System.out.println("initial capacity: "+v.capacity());
        System.out.println("vector size "+v.size());

        System.out.println("vector first and last obj : "+v.firstElement()+" "+v.lastElement());

        v.removeAllElements();
        System.out.println("vector elements: "+v);
        System.out.println("initial capacity: "+v.capacity());
        System.out.println("vector size "+v.size());        



    }
}
