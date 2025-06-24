class Table {
    synchronized 
    
    public void printTable(int n){
        for (int i = 1; i <=5; i++) {
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}

class user1 extends Thread{
    Table t1;
    public user1(Table t1){
            this.t1=t1;
    }
    public void run(){
        t1.printTable(7);
    }
}

class user2 extends Thread{
    Table t2;
     public user2(Table t2){
            this.t2=t2;
    }
    public void run(){
        t2.printTable(6);
    }
}


public class TableEx{
    public static void main(String[] args) {
        Table t1 = new Table();

        user1 u1 = new user1(t1);
        user2 u2 = new user2(t1);

        u1.start();;
        u2.start();;
    }
}
