import java.util.Scanner;

public class StringWrapperConcat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input using String wrapper objects (Strings are reference types)
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Concatenate the two strings
        String concatenated = str1.concat(str2);

        // Convert characters at odd indices to uppercase
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < concatenated.length(); i++) {
            char ch = concatenated.charAt(i);
            if (i % 2 != 0) {
                result.append(Character.toUpperCase(ch)); // Use Character wrapper class
            } else {
                result.append(ch);
            }
        }

        // Print final result
        System.out.println("Result: " + result.toString());

        scanner.close();
    }
}
