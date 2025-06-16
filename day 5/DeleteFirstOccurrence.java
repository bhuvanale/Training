public class DeleteFirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 3, 5, 7, 5};
        int deleteNumber = 5;

        int index = -1;

  
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == deleteNumber) {
                index = i;
                break;
            }
        }


        if (index == -1) {
            System.out.println(deleteNumber + " not found in array.");
            return;
        }


        int[] newArr = new int[arr.length - 1];


        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) continue; 
            newArr[j++] = arr[i];
        }

        System.out.print("Array after deleting first occurrence of " + deleteNumber + ": ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
