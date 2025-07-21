public class StringPermutations {

    public static void permute(char[] arr, int index) {
        if (index == arr.length) {
            System.out.println(new String(arr));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            
            permute(arr, index + 1);
            
            swap(arr, index, i);
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String input = "ABC";
        char[] arr = input.toCharArray();
        System.out.println("All permutations of the string \"" + input + "\" are:");
        permute(arr, 0);
    }
}
