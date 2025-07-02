public class LongestSubarray {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int k = 12;
        int start = 0,end =0,max_length=0,sum=0;
        for (end = 0; end < arr.length; end++) {
            sum += arr[end];//window expand upto lenght

            while(sum  > k){
                sum -= arr[start];//window shrink upto target
                start++;
            }
            if(sum == k){
                max_length=Math.max(max_length, end-start+1);
            }
        }
        System.out.println("max length : "+max_length);
        
    }
}
