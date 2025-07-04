import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read array input
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // Read number of students
        int m = scanner.nextInt();

        int n = arr.length;

        // Edge cases
        if (m == 0 || n == 0 || m > n) {
            System.out.println("Invalid input.");
            
        }

        // Sort the array using bubble sort (for learning purpose)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Find the minimum difference
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        System.out.println("Minimum difference is " + minDiff);
        scanner.close();
    }
    
}
