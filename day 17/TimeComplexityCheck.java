public class TimeComplexityCheck{
public static void main(String[] args) {
    int size=10;
    int[] arr = new int[size];
    long start = System.nanoTime();

    for (int i = 0; i < arr.length; i++) {
        arr[i]=i;   
    }

    long end = System.nanoTime();
    System.out.println("Execution time: "+(end-start)+"ns");
    // System.out.println("Execution time: "+(end-start)/1000+"ms");


}
}

class TimeComplexityCheck1{
public static void main(String[] args) {

    int[][] arr = new int[3][3];
    long start = System.nanoTime();

    for (int i = 0; i < arr.length; i++) {
        for(int j = 0;j<arr.length;j++){
                 arr[i][j]=j;   
        }
       
    }
    for (int i = 0; i < arr.length; i++) {
        for(int j = 0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       
    }
  
    long end = System.nanoTime();
    System.out.println("Execution time: "+(end-start)+"ns");
    System.out.println("Execution time: "+(end-start)/1000+"ms");


}
}

 class TimeComplexityBinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;


        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid; // Target found
            else if (arr[mid] < target)
                low = mid + 1; // Search right
            else
                high = mid - 1; // Search left
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 15, 20, 35, 40};
        int target = 15;
            long start = System.nanoTime();

        int result = binarySearch(arr, target);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found.");
            long end = System.nanoTime();
    System.out.println("Execution time: "+(end-start)+"ns");
    System.out.println("Execution time: "+(end-start)/1000+"ms");
    }
}
