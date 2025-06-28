import java.util.Scanner;

public class RemoveIndexFromArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        System.out.print("Enter number of temperature values: ");
        int n = sc.nextInt();
        int[] temp = new int[n];

        // Read temperature values
        System.out.println("Enter the temperature values:");
        for (int i = 0; i < n; i++) {
            temp[i] = sc.nextInt();
        }

        // Read index to remove
        System.out.print("Enter the index to remove: ");
        int index = sc.nextInt();

        // Check if index is valid
        if (index < 0 || index >= n) {
            System.out.println("Invalid Input");
        } else {
            System.out.print("Array after removing index " + index + ": [");
            boolean first = true;
            for (int i = 0; i < n; i++) {
                if (i != index) {
                    if (!first) {
                        System.out.print(", ");
                    }
                    System.out.print(temp[i]);
                    first = false;
                }
            }
            System.out.println("]");
        }

        sc.close();
    }
}
