class PyramidHollow {
    public static void main(String[] args) {
        int n = 4; // height of the pyramid

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}

//       * 
//     *   * 
//   *       * 
// * * * * * * * 


public class PyramidHallow2 {
        public static void main(String[] args) {
            int n=4;
              for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if(i==n||j==1){
                         System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
               
            }

            for(int j=2;j<=i;j++){

                if(i==j||i==n){
                        System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
            
        }
    
}