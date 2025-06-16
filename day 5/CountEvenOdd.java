public class CountEvenOdd {
    public static void main(String[] args) {
        int arr[] = {2,5,1,8,9,6};
        for(int val:arr){
            System.out.print(val+" ");
        }
        int even =0,odd=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0){
                even++;
            }
            else{
                odd++;
            }
         
        }
        System.out.println();
        System.out.println("number of even are : "+even);
        System.out.println("number of odd are : "+odd);
    }
}
