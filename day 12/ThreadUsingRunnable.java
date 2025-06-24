class AppThread implements Runnable{
    public void run(){
        System.out.println("App thread");
    }
  }
  
  
  
public class ThreadUsingRunnable{
    public static void main(String[] args) {
        AppThread a = new AppThread();
        Thread t = new Thread(a);

        t.start();
    }

}