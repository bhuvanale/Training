public class N_queens {
    static int n =4;

    public static void quuensPlace(int[][]board,int row){
        if(row==n){
            printBoard(board);
            return;
        }
        for(int col = 0;col<n;col++){
            if(isSafe(board,row,col)){
                board[row][col] = 1;
                quuensPlace(board, row+1);
                board[row][col] =0;//failed or backtrack
            }
        }
    }
    public static boolean isSafe(int[][]board,int row,int col){
        for(int i=0;i<row;i++){
            if(board[i][col] == 1){
                return false;
            }

        }
        //left diagonal
        for(int i=row-1,j=col-1;i>=0 && j>= 0;i--,j--){
            if(board[i][j] == 1){
                return false;
            }

        }
        for(int i=row-1,j=col+1;i>=0 && j< n;i--,j++){
            if(board[i][j] == 1){
                return false;
            }
            
        }
        return true;
    }
    public static void printBoard(int[][] board){
        for(int[] rows:board){
            for(int col:rows){
                System.out.print((col == 1)? 'Q' : '.');
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] board = new int[n][n];
        quuensPlace(board, 0);
    }
}
