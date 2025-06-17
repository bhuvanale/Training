import java.util.Scanner;

public class matrix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of rows: ");

         int n = s.nextInt();
        
         System.out.println("enter the number of cols: ");

         int m = s.nextInt();
        System.out.println("enter the array values:");
         int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=s.nextInt();
                
            }
        }
        System.out.println("the array elents are: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
        }
        s.close();
    }
}





 class Foreachmatrix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of rows: ");

         int n = s.nextInt();
        
         System.out.println("enter the number of cols: ");

         int m = s.nextInt();
        System.out.println("enter the array values:");
         int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=s.nextInt();
                
            }
        }
        System.out.println("the array elents are: ");
        
        for (int[] arr1 : arr) {
            for (int arr2 : arr1) {
                System.out.print(arr2 +" ");
            }
            System.out.println();
        }
        s.close();
    }
}