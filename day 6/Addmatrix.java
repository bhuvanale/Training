public class Addmatrix {
    
    public static void main(String[] args) {
        int[][] arr1 ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] arr2 ={
            {9,8,7},
            {6,5,4},
            {3,2,1}
        };
        System.out.println("matrix Adiition::");

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
            }
            System.out.println();
        }
    }

}
