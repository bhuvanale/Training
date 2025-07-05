import java.util.*;

public class EqualArrayCost {

    public static long totalCost(int[] nums, int[] cost, int target) {
        long total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += 1L * Math.abs(nums[i] - target) * cost[i];
        }
        return total;
    }

    public static int minCost(int[] nums, int[] cost) {
        int low = Arrays.stream(nums).min().getAsInt();
        int high = Arrays.stream(nums).max().getAsInt();

        long minTotalCost = Long.MAX_VALUE;

        while (low < high) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;

            long cost1 = totalCost(nums, cost, mid1);
            long cost2 = totalCost(nums, cost, mid2);

            minTotalCost = Math.min(cost1, cost2);

            if (cost1 < cost2) {
                high = mid2 - 1;
            } else {
                low = mid1 + 1;
            }
        }

        return (int) totalCost(nums, cost, low);
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5};
        int[] cost = {10, 100, 1000};

        System.out.println("Minimum cost to make all elements equal: " + minCost(nums, cost));
    }
}
