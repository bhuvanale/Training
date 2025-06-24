class UserThread extends Thread{
    public void run(){
        System.out.println("user thread");
    }
}


public class ThreadPriority {
    public static void main(String[] args) {
        UserThread u = new UserThread();
        System.out.println("main thread priority: "+Thread.currentThread().getPriority());
        System.out.println("user thread priority: "+u.getPriority());

        u.setPriority(10);
        Thread.currentThread().setPriority(3);

        u.start();;

        System.out.println("new priorities:::");
        System.out.println("main thread priority: "+Thread.currentThread().getPriority());
        System.out.println("user thread priority: "+u.getPriority());
    }
}
