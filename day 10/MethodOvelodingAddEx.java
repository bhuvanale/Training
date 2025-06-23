class Addition{
    public void add(int a,int b){
        System.out.println("Addition : {int,int}"+(a+b));
    }
    public void add(int a,double b){
        System.out.println("Addition : {int,double}"+(a+b));
    }
     public void add(double a,int b){
        System.out.println("Addition : {double,int}"+(a+b));
    }
     public void add(double a,double b){
        System.out.println("Addition : {double,double}"+(a+b));
    }
}

public class MethodOvelodingAddEx {
    public static void main(String[] args) {
        Addition add = new Addition();
        add.add(10, 10);
        add.add(10, 10.0);
        add.add(10.0, 20);
        add.add(20.0, 30.0);

        

    }
}
