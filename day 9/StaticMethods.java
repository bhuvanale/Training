public class StaticMethods {

    public static void mysort(int[] array){
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if(array[i]<array[j]){
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
    }
        public static void main(String[] args) {
            int arr[] = {4,1,7,3,9};
            System.out.println("the array values before sort");

            for(int arr1:arr){
                System.out.print(arr1+" ");
            }

            mysort(arr);

            System.out.println("\nthe array values after sort");

            for(int arr1:arr){
                System.out.print(arr1+" ");
            }
        }
    
}

