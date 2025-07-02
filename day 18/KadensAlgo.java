public class KadensAlgo {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int max_sum = Integer.MIN_VALUE,currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum+arr[i]);
            max_sum = Math.max(max_sum,currentSum);
        }
        System.out.println(max_sum);
    }
}
