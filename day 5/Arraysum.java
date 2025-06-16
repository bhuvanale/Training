import java.util.Scanner;

public class Arraysum {
    public static void main(String[] args) {
 
    Scanner s = new Scanner(System.in);
    int sum=0;
    System.out.println("enter size of array:");
    int n=s.nextInt();
    int arr[] = new int[n];
    System.out.println("enter the elements: ");
    for(int i=0;i<n;i++){      
        arr[i]=s.nextInt();
    }
    for(int j=0;j<n;j++){
        sum += arr[j];
    }
    System.out.println("Sum of the elements are: \n"+sum);
    s.close();
}
   
}


