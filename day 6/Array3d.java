import java.util.Scanner;;;;;;

public class Array3d {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int n = s.nextInt();
        System.out.println("enter the number of cols: ");
        int m = s.nextInt();
        System.out.println("enter the width: ");
        int w = s.nextInt();
        System.out.println("enter the array values:");
        int arr[][][] = new int[n][m][w];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for(int k =0;k < w;k++){
                         arr[i][j][k]=s.nextInt();
                }
            }
        }
        System.out.println("the array elents are: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                     for(int k =0;k < w;k++){
                System.out.print(arr[i][j][k]+" ");
                
            }
            System.out.println();
        }
       System.out.println();
        }

         s.close();
    }   
}

