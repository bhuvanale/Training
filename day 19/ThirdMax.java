import java.util.Scanner;

public class ThirdMax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input: space-separated integers (e.g., 10 20 30 40)
        String[] input = scanner.nextLine().split(" ");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        // Initialize first, second, third max with Integer.MIN_VALUE
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            // Skip duplicates
            if (num == first || num == second || num == third)
                continue;

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }

        if (third != Integer.MIN_VALUE) {
            System.out.println("Third maximum number: " + third);
        } else {
            System.out.println("Third max not found. Maximum number is: " + first);
        }

        scanner.close();
    }
}

    

