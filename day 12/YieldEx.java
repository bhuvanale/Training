
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

public class YieldEx {
    public static void main(String[] args) {
        UserThread1 u1 = new UserThread1();
        UserThread2 u2 = new UserThread2();

        u1.start();
        u2.start();
        for (int i = 0; i < 5; i++) {
            //Thread.currentThread().yield();
            System.out.println("main thread - "+i);
            
        }

        
    }
}
