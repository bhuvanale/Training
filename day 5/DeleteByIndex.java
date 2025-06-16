public class DeleteByIndex {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 3, 5, 7, 5};
        int deleteIndex = 3; 

        if (deleteIndex < 0 || deleteIndex >= arr.length) {
            System.out.println("Invalid index.");
            return;
        }

        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == deleteIndex) continue;
            newArr[j++] = arr[i];
        }

        System.out.print("Array after deleting index " + deleteIndex + ": ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
