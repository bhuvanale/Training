public class SwapMethod1{
    public static void main(String[] args) {
        int a=5,b = 10;
        System.out.println("Before swap a:"+a);
        System.out.println("Before swap b:"+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After swap a:"+a);
        System.out.println("After swap b:"+b);
    }
}

