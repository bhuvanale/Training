import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        
 
    Scanner s = new Scanner(System.in);
    System.out.println("enter sizo of array:");
    int n=s.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
    }
    for(int j=0;j<n;j++){
        System.out.println("Arrays values are :"+arr[j]+" ");
    }
    s.close();
}
   }
