public class SecondLargest {
    public static void main(String[] args) {
        int arr[ ]= {2,4,1,7,4,9,8,4,5};
        int firstlarge = Integer.MIN_VALUE;
        int secondlarge = Integer.MIN_VALUE;
        System.out.println("the given array : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>firstlarge){
                secondlarge = firstlarge;
                firstlarge = arr[i];
             
            }
            else if(arr[i] > secondlarge && arr[i]!= firstlarge){
                secondlarge = arr[i];
            }
        }
        System.out.println("second largest: "+secondlarge);

    }
}
