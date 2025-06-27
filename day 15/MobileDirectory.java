import java.util.*;

public class MobileDirectory {
    public static void main(String[] args) {
        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);

        // Step 1: Add entries
        System.out.print("Enter number of contacts to add: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter mobile number: ");
            String number = sc.next();
            phoneBook.put(name, number);
        }

        // Step 2: Display full directory
        System.out.println("\nMobile Directory:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Step 3: Update an existing contact
        System.out.print("\nEnter name to update number: ");
        String updateName = sc.next();
        if (phoneBook.containsKey(updateName)) {
            System.out.print("Enter new mobile number: ");
            String newNumber = sc.next();
            phoneBook.put(updateName, newNumber);
            System.out.println("Updated successfully.");
        } else {
            System.out.println("Contact not found.");
        }

        // Step 4: Display first and last entry
        if (!phoneBook.isEmpty()) {
            String firstKey = phoneBook.keySet().iterator().next();
            String lastKey = null;
            for (String key : phoneBook.keySet()) {
                lastKey = key;
            }

            System.out.println("\nFirst Entry: " + firstKey + " => " + phoneBook.get(firstKey));
            System.out.println("Last Entry: " + lastKey + " => " + phoneBook.get(lastKey));
        } else {
            System.out.println("Directory is empty.");
        }

        sc.close();
    }
}
