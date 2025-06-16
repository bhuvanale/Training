public class Frequency {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 2, 1, 4};
        int[] freq = new int[101]; // assuming numbers are in 0–100

        System.out.print("Duplicates: ");
        for (int num : arr) {
            freq[num]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] >1) {
                System.out.print(i + " ");
            }
        }
    }
}
