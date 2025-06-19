public class SumConstructor {

    int a,b;

    public SumConstructor(int a,int b){
        this.a = a;
        this.b = b;
    }
    public int add(){
        return a+b;
    }
    public static void main(String[] args) {
        SumConstructor s = new SumConstructor(10, 20);
        System.out.println("Addition: "+s.add());
    }
}
