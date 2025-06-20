public class ThisConstructor {

    public ThisConstructor() {
        this("Hello from constructor with parameter");
        System.out.println("This is the default constructor");
    }

    public ThisConstructor(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        ThisConstructor obj = new ThisConstructor();
        
    }
}
