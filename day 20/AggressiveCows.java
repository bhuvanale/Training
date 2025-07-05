import java.util.Arrays;

public class AggressiveCows {

    public static boolean canPlaceCows(int[] stalls, int cows, int minDist) {
        int count = 1;  // First cow is placed at first stall
        int lastPosition = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= minDist) {
                count++;
                lastPosition = stalls[i];

                if (count == cows) return true;
            }
        }
        return false;
    }

    public static int aggressiveCows(int[] stalls, int cows) {
        Arrays.sort(stalls); // Sort the stall positions
        int n = stalls.length;
        int low = 1;  // Minimum possible distance
        int high = stalls[n - 1] - stalls[0]; // Maximum possible distance
        int result = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (canPlaceCows(stalls, cows, mid)) {
                result = mid;     // Try for a bigger distance
                low = mid + 1;
            } else {
                high = mid - 1;   // Try for a smaller distance
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] stalls = {1, 2, 8, 4, 9};
        int cows = 3;

        int maxMinDist = aggressiveCows(stalls, cows);
        System.out.println("Largest minimum distance: " + maxMinDist);
    }
}
