import java.util.Scanner;

public class SqrtWithoutFun {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);   
    int x = s.nextInt();
    if (x < 2){
    System.out.println(x);
    } 
    int low = 1;
    int high = x / 2;
    int ans =0;

    while (low <= high) {
        int mid = low + (high - low) / 2;
        long square = (long) mid * mid;

        if (square == x) {
            ans = mid;
            break;
        } else if (square < x) {
            ans =mid;
            low = mid + 1;
        } else {
            high = mid - 1;
        }
           
    }
 System.out.println(ans);

    s.close();
    }
}