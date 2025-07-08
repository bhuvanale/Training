public class NextGreaterElement {

    public static void printNextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] stack = new int[n];
        int top = -1;
        int[] result = new int[n];

        // Initialize result with -1
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            // While stack is not empty and current element is greater than element at index stored in stack
            while (top != -1 && arr[i] > arr[stack[top]]) {
                int index = stack[top--]; // pop index
                result[index] = arr[i];   // update result for that index
            }
            stack[++top] = i; // push current index
        }

        // Print result
        System.out.println("Element -> Next Greater Element");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " -> " + result[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        printNextGreaterElements(arr);
    }
}
