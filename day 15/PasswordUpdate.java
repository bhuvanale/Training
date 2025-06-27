import java.util.HashMap;
import java.util.Scanner;

public class PasswordUpdate {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        Scanner s = new Scanner(System.in);

        // Step 1: Read 3 users' emails and passwords
        System.out.println("Enter details for 3 users (email and password):");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter email: ");
            String mail = s.next();
            System.out.print("Enter password: ");
            String pass = s.next();
            hm.put(mail, pass);
        }

        // Step 2: Display existing users
        System.out.println("\nStored user credentials:");
        for (String key : hm.keySet()) {
            System.out.println(key + " => " + hm.get(key));
        }

        // Step 3: Update passwords
        System.out.println("\nEnter email to update password:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Email: ");
            String mail = s.next();
            if (hm.containsKey(mail)) {
                System.out.print("Enter new password: ");
                String newPass = s.next();
                hm.put(mail, newPass);
                System.out.println("Password updated for " + mail);
            } else {
                System.out.println("Email not found: " + mail);
            }
        }

        // Step 4: Display updated credentials
        System.out.println("\nUpdated user credentials:");
        for (String key : hm.keySet()) {
            System.out.println(key + " => " + hm.get(key));
        }

        s.close();
    }
}
