import java.util.*;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 9};

        int[] merged = mergeArrays(arr1, arr2);

        System.out.println("Merged Array: " + Arrays.toString(merged));
    }

    static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] result = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // Copy remaining elements from arr1 (if any)
        while (i < n1) {
            result[k++] = arr1[i++];
        }

        // Copy remaining elements from arr2 (if any)
        while (j < n2) {
            result[k++] = arr2[j++];
        }

        return result;
    }
}
