public class SearchInSortedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,9,1,2,3};
        int tar = 89;
        int mid,low=0,high=arr.length-1;
        while(low<=high) {
            mid = (low+high)/2;
            if(arr[mid]==tar){
                System.out.println("element "+tar+" found at position: "+mid);
                return;
            }

            if(arr[low]<arr[mid]){
                if(arr[low]<tar && tar < arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(arr[mid]<tar && tar <arr[high]){
                    low=mid+1;

                }
                else{
                    high=mid-1;
                }
            }
    }
    System.out.println("no match found");
}
}