public class FirstLastDup {
    public static void main(String[] args) {
    
        int[] arr = {3, 5, 2, 3, 5, 7, 5};

        int firstDuplicate = -1;
        int lastDuplicate = -1;

        // Find first duplicate
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    firstDuplicate = arr[i];
                    break;
                }
            }
            if (firstDuplicate != -1) {
                break;
            }
        }

        // Find last duplicate
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    lastDuplicate = arr[i];
                    break;
                }
            }
            if (lastDuplicate != -1) {
                break;
            }
        }

        if (firstDuplicate != -1)
            System.out.println("First Duplicate: " + firstDuplicate);
        else
            System.out.println("No Duplicates Found (First)");

        if (lastDuplicate != -1)
            System.out.println("Last Duplicate: " + lastDuplicate);
        else
            System.out.println("No Duplicates Found (Last)");
 

    }
}
