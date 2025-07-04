import java.util.Scanner;

public class MeanMedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: space-separated integers
        String[] input = scanner.nextLine().split(" ");
        int[] nums = new int[input.length];
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        // ---- Mean ----
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        double mean = sum / n;
        System.out.println("Mean: " + mean);

        // ---- Median ----
        // First, sort the array (using simple bubble sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        double median;
        if (n % 2 == 0) {
            median = (nums[n / 2 - 1] + nums[n / 2]) / 2.0;
        } else {
            median = nums[n / 2];
        }

        System.out.println("Median: " + median);

        scanner.close();
    }
}
