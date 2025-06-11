public class SwapMethod3 {
    public static void main(String[] args) {
        int a=5,b=20;
        System.out.println("Before swap a:"+a);
        System.out.println("Before swap b:"+b);
        a = a ^b; 
        b =a^b; 
        a =a^b; 
        System.out.println("After swap a:"+a);
        System.out.println("After swap b:"+b);
    }
}
