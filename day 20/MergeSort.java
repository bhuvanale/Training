
public class MergeSort {
    public static void main(String[] args) {
    
        int[] arr = {5,3,8,7,9,2};
      
        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Sorted array: ");
        
        for (int num : arr) {
            System.out.print(num+" ");
        }

    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid =  ( left +right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right-left+1];
        int i = left, j = mid+1;
        int k = 0;
        while (i <= mid && j <= right) {
            temp[k++]= (arr[i]<arr[j])?arr[i++]:arr[j++];//for desending order kepp > symbol
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (int i1 = 0; i1 < temp.length; i1++) {
            arr[left+i1]=temp[i1];
        }
    }
}
