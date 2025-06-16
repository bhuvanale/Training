
public class Duplicate {
    public static void main(String[] args) {
        
    
    int arr[] = {2,5,1,8,9,6,5,6,3,7,1};
    for(int i=0;i< arr.length;i++){
        for(int j= i+1;j<arr.length;j++){
            if(arr[i] == arr[j]){
                System.out.print(arr[j]+" ");
                break;
            }
        }
    }
}
}

class OnceDuplicate {
    public static void main(String[] args) {
        
    
    int arr[] = {2,5,1,8,9,6,5,6,3,7,1,1};
    int dup[] = new int[5];
    for(int i=0;i< arr.length;i++){
        for(int j= i+1;j<arr.length-1;j++){
            if(arr[i] == arr[j]){
                dup[i]=arr[j];
                break;
                
            }
            if(dup[i]!=dup[i+1]){
                System.out.println(dup[i]);
            }
        }
    }
}
}

