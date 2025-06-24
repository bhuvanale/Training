class UserThread1 extends Thread{
    public void run(){
        System.out.println("user thread 1 ");
    }
}
class UserThread2 extends Thread{
    public void run(){
        System.out.println("user thread 2 ");
    }
}

public class SetGetNameTHread {
    public static void main(String[] args) {
        UserThread1 u1 = new UserThread1();
        UserThread2 u2 = new UserThread2();


        System.out.println("names created by JVM:");

        System.out.println("main thread name: "+Thread.currentThread().getName());
        System.out.println("user thread 1 name: "+u1.getName());
        System.out.println("user thread 2 name: "+u2.getName());


        Thread.currentThread().setName("Home page");
        u1.setName("Bus Thread - 1");
        u2.setName("Seat - 1");

        System.out.println("after seeting names: ");
        System.out.println("main thread name: "+Thread.currentThread().getName());
        System.out.println("user thread 1 name: "+u1.getName());
        System.out.println("user thread 2 name: "+u2.getName());



        
    }
}
