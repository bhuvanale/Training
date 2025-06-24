class ut extends Thread{
        public void run(){
            for(int i =1;i<=5;i++){
                System.out.println("user thread - "+i);
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
}


public class SleepEx {
    public static void main(String[] args) {
        ut  u = new ut();
        u.run();
    }
}
