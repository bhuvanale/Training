import java.util.Scanner;

public class SumOrigin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt();
        int sum =0;
        int j =1;
        for(int i =0;i<=n;i++){
            
            if(i>=10){
               
                sum +=j;
                j++;
            }
            else{
                sum +=i;
            }
        }
        System.out.println(sum);
        s.close();
    }
}
