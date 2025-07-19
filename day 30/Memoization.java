import java.util.Arrays;

public class Memoization{
    static int memeo[];
    public static int fib(int n){
        if(n<=1)
        return n;
        if(memeo[n] != -1){
            return memeo[n];
        }
        memeo[n]=fib(n-1)+fib(n-2);
        return memeo[n];
    }
    public static void main(String[] args) {
        int n=5;
        memeo = new int[n+1];
        Arrays.fill(memeo,-1);
        System.out.println(fib(n));
        //0 1 1 2 3 - so op is 5

    }
}