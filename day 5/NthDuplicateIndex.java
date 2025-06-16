public class NthDuplicateIndex {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 3, 5, 7, 5};
        int target = 5; 
        int n = 3;     

        int count = 0;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
                if (count == n) {
                    index = i;
                    break;
                }
            }
        }

        if (index != -1) {
            System.out.println(n + "-th occurrence of " + target + " is at index: " + index);
        } else {
            System.out.println(target + " does not occur " + n + " times.");
        }
    }
}
