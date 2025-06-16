import java.util.Arrays;
public class Sort{
    public static void main(String[] args) {
    int arr[]={2,6,1,4,5};
        for(int i = 0;i< arr.length-1;i++){
            for (int j = 0; j < arr.length - i - 1; j++) {
            if(arr[j]>arr[j+1]){
                int temp =arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            }
        }
         for(int i = 0;i<= arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

class ArrSort {

    public static void main(String[] args) {
        int arr[]={2,6,1,4,5};
        Arrays.sort(arr);

        for(int array:arr){
            System.out.print(array+" ");
        }
    }
}


class ReverseSort{
    public static void main(String[] args) {
    int arr[]={2,6,1,4,5};
        for(int i = 0;i< arr.length-1;i++){
            for (int j = 0; j < arr.length - i - 1; j++) {
            if(arr[j]<arr[j+1]){
                int temp =arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            }
        }
         for(int i = 0;i<= arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
