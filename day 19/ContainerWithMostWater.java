import java.util.Scanner;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: space-separated heights (e.g., 1 8 6 2 5 4 8 3 7)
        String[] input = scanner.nextLine().split(" ");
        int[] height = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            height[i] = Integer.parseInt(input[i]);
        }

        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = h * width;

            if (area > maxArea) {
                maxArea = area;
            }

            // Move the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Maximum water that can be contained is: " + maxArea);

        scanner.close();
    }
}
