public class FillZeros {
    public static void main(String[] args) {
        int[][] arr = {
            {0, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n =arr.length;
        int m = arr[0].length;
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
            
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               if(row[i] || col[j] ){
                arr[i][j] = 0;
               }
            }
            
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

            
            
        }

    }
}
