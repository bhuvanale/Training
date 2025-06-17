public class UpperLowerSum {
    public static void main(String[] args) {
           int[][] arr ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int uppersum = 0;
        int lowersum = 0;

        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr.length; j++) {
               if(j>=i){
                uppersum += arr[i][j];
               }
               if(i>=j){
                lowersum +=arr[i][j];
               }
            } 
        }

        System.out.println("upper sum : "+uppersum);
        System.out.println("lower sum : "+lowersum);
    }
}
