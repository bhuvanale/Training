import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorUpdateExample {
    public static void main(String[] args) {
        // Create an ArrayList with Indian names
        ArrayList<String> names = new ArrayList<>();
        names.add("Aarav");
        names.add("Bhuvana");
        names.add("Chirag");
        names.add("Deepika");

        // Get the ListIterator
        ListIterator<String> iterator = names.listIterator();

        // Update "Chirag" to "Charan"
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equals("Chirag")) {
                iterator.set("Charan"); // replaces the last element returned by next()
            }
        }

        // Display the updated list
        System.out.println("Updated list:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
