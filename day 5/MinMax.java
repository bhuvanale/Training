public class MinMax {
    public static void main(String[] args) {
          int arr[]={1,2,3,4,5};

          int max=arr[0],min=arr[0];

          for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
          }
          System.out.println("max value: "+max);
          System.out.println("min value: "+min);
    }
}
