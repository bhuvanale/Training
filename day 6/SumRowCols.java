public class SumRowCols {

    public static void main(String[] args) {
        int[][] arr ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
    

        for (int i = 0; i < arr.length; i++) {
                int sum = 0;
            for (int j = 0; j < arr.length; j++) {
             
                      sum += arr[i][j];
                
                
            }
             System.out.println("sum of "+ i +" row : "+sum);   
        }

        //  for (int j = 0; j < arr[0].length; j++) {
        //     int sum = 0;
        //     for (int i = 0; i < arr.length; i++) {
        //         sum += arr[i][j];
        //     }
        //     System.out.println("Sum of column " + j + ": " + sum);
        // } it also works
       for (int i = 0; i < arr.length; i++) {
                int sum = 0;
            for (int j = 0; j < arr.length; j++) {
             
                      sum += arr[j][i];
                
                
            }
             System.out.println("sum of "+ i +" col : "+sum);   
        }
    }
}

