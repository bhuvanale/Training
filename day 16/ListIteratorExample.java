import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Add Indian names to the ArrayList
        names.add("Aarav");
        names.add("Bhuvana");
        names.add("Chirag");
        names.add("Deepika");
        names.add("Eshwar");

        // Get the ListIterator
        ListIterator<String> iterator = names.listIterator();

        // Iterate through the ArrayList using ListIterator (forward direction)
        System.out.println("Forward iteration:");
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Iterate in reverse using ListIterator (backward direction)
        System.out.println("\nBackward iteration:");
        while (iterator.hasPrevious()) {
            String name = iterator.previous();
            System.out.println(name);
        }
    }
}
