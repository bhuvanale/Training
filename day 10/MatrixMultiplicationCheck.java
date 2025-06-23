public class MatrixMultiplicationCheck {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2}
            
        };
        int[][] B = {
            {5, 6},
            {6, 7}
            // Only 1 row, so B has size 1x3 → incompatible with A's column count (2)
        };

        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        // Check if multiplication is possible
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible.");
            System.out.println("Columns of A: " + colsA + " != Rows of B: " + rowsB);
        } else {
            int[][] C = new int[rowsA][colsB];

            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    for (int k = 0; k < colsA; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            // Print Result
            System.out.println("Resultant Matrix:");
            for (int[] row : C) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }
}
