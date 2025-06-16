public class SumEquals {

    public static void main(String[] args) {
        int arr[] = {2,5,1,8,9,6};
        int sum = 7;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]+arr[j] == sum){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
            
        }

    }
}
