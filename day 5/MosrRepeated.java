public class MosrRepeated {
 
    public static void main(String[] args) {
        
    int arr[] = {1,2,1,2,3};
    int maxcount =0;
    int mostrepeat = arr[0];
  
    for (int i = 0; i < arr.length;i++) {
    int count =0;
    for (int j = 0; j < arr.length; j++) {
        if(arr[i]==arr[j]){
            count++;
        }
     
    }
       if(count==1){
            System.out.println(arr[i]);
        }

        if(count>maxcount){
            maxcount = count;
            mostrepeat =arr[i];
        }
    }
    System.out.println("most repeated: "+mostrepeat);
   
}
}


