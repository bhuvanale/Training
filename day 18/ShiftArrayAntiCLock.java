public class ShiftArrayAntiCLock {
    // F anti-clockwise (left) 
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; 

        // Step 1: Reverse first k elements
        reverse(arr, 0, k - 1);
        // Step 2: Reverse remaining elements
        reverse(arr, k, n - 1);
        // Step 3: Reverse entire array
        reverse(arr, 0, n - 1);
    }

    // Helper function to reverse part of array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        rotateArray(arr, k); // Left rotate by 2

        // Print rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
