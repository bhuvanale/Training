
class PeekEle {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        
        int low=0,high=arr.length-1;
    

        while (low < high) {
            int mid = (low+high) / 2;

            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(arr[low]);
    }
}
