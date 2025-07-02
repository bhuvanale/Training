public class LinearSearch {
    public static void main(String[] args) {
            int arr[ ]= {2,4,1,7,4,9,4,5};
            int target = 14;
            boolean flag = false;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==target){
                    System.out.println("element found at : "+i);
                    flag = true;
                    break;
                }
    
              
            }
            if(!flag){
            System.out.println("no such element found");
            }

    }
}

class Method1{
    public static void main(String[] args) {
          int arr[ ]= {2,4,1,7,4,9,4,5};
            int target = 4;
            boolean flag = LinearSearch(arr, target);
            if(!flag){
            System.out.println("no such element found");
            }

            

    }
    public static boolean LinearSearch(int[] arr,int target){
         for (int i = 0; i < arr.length; i++) {
                if(arr[i]==target){
                    System.out.println("element found at : "+i);
                    return true;
                   
                }  
            }
        
                return false;
           
    }
}
