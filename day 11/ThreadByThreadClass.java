class MyThread extends Thread{
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.println("My Thread - "+i);
        }
    }
}


public class ThreadByThreadClass {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        for (int i = 0; i <= 5; i++) {
            System.out.println("My Thread (inside main)- "+i);
        }

    }
}