import java.util.Arrays;

public class TwoPointerDuplicateRemove {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 5, 4, 3, 2};
        Arrays.sort(arr); 

        int start = 0;
        int end = 1;

        System.out.println("Unique elements:");

        while (end < arr.length) {
            if (arr[start] != arr[end]) {
                System.out.print(arr[start] + " ");
                start = end;
            }
            end++;
        }

        System.out.print(arr[start]);
    }
}
