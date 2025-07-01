import java.util.Arrays;

public class TwoPointerCheckSum {
    public static void main(String[] args) {
        
        int[] arr = {1,2,4,6,5,3};
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        int sum=0;
        int k=7;
        while (start<end) {
            sum=arr[start]+arr[end];
            if(sum ==k ){
                System.out.println(arr[start]+" "+arr[end]);
               end--;
            }
            else if(sum<k){
                start++;
            }
            else{
                end--;
            }
        }

    }
}
