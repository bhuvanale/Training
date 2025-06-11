public class SwapMethod2 {
    public static void main(String[] args) {
        int a=5,b=15;
        System.out.println("Before swap a:"+a);
        System.out.println("Before swap b:"+b);
        a = a+b; //5+15=20
        b =a-b; // 20-15=5
        a =a-b; //20-5=15
        System.out.println("After swap a:"+a);
        System.out.println("After swap b:"+b);
    }
    }

