public class ThisMethod {

    public void method1(){
        System.out.println("this is method 1");
    }
     public void method2(){
        System.out.println("this is method 2");
        this.method1();
    }

    public static void main(String[] args) {
        ThisMethod t1 = new ThisMethod();
        t1.method2();
    }
}
