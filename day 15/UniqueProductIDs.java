import java.util.HashSet;
import java.util.Scanner;

public class UniqueProductIDs {
    public static void main(String[] args) {
        HashSet<String> productIds = new HashSet<>();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter how many product IDs you want to enter: ");
        int n = s.nextInt();

        System.out.println("Enter product IDs:");
        for (int i = 0; i < n; i++) {
            String id = s.next();
            productIds.add(id);
        }

        System.out.println("\nUnique Product IDs:");
        for (String id : productIds) {
            System.out.println(id);
        }

        s.close();
    }
}
