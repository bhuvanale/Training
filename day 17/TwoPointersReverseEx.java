public class TwoPointersReverseEx {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
        boolean first= true;
        for (int i : arr) {
            if(!first){
                System.out.print(", ");
            }
            System.out.print(i);
            first=false;
        }
    }
}
