public class BinarySearchIter{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int tar = 9;
        int mid,low=0,high=arr.length-1;
        while(low<=high) {
            mid = (low+high)/2;
            if(arr[mid]==tar){
                System.out.println("element "+tar+" found at position: "+mid);
                return;
            }
            else if(arr[mid]>tar){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        System.out.println("element not found");
    }

}

 class BinarySearchRecur {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int tar = 7;

        int result = binarySearch(arr, 0, arr.length - 1, tar);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element " + tar + " found at position: " + result);
        }
    }

    // Recursive binary search method
    public static int binarySearch(int[] arr, int low, int high, int tar) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == tar) {
            return mid;
        } else if (arr[mid] > tar) {
            return binarySearch(arr, low, mid - 1, tar);
        } else {
            return binarySearch(arr, mid + 1, high, tar);
        }
    }
}
