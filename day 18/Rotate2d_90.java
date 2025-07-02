public class Rotate2d_90 {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int n = arr.length;     // Rows
        int m = arr[0].length;  // Columns

        int[][] rotated = new int[m][n];

        for (int i = 0; i < n; i++) {       // rows in original
            for (int j = 0; j < m; j++) {   // cols in original
                rotated[j][n - 1 - i] = arr[i][j];
            }
        }

        // Print rotated matrix
        for (int[] row : rotated) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}



 class Rotate2d_90m2 {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int n = arr.length;     // Rows
        int m = arr[0].length;  // Columns

        // Create a new array with transposed dimensions (m x n)
        int[][] rotated = new int[m][n];

        // 90-degree clockwise rotation logic
        for (int i = 0; i < n; i++) {       // rows in original
            for (int j = 0; j < m; j++) {   // cols in original
                rotated[j][n - 1 - i] = arr[i][j];
            }
        }

        // Print rotated matrix
        for (int[] row : rotated) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
