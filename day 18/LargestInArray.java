public class  LargestInArray{
public static void main(String[] args) {
    int arr[ ]= {2,4,1,7,4,9,4,5};
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]>max){
            max = arr[i];
        }
    }
    System.out.println(max);
}
}
