public class ThisVariables {
    int a = 10,b=20;
    public ThisVariables(int A ,int B){
            System.out.println("a : "+a+" b : "+b);
            this.a=A;
            this.b=B;
             System.out.println("a : "+A+" b : "+B);
    }
    public static void main(String[] args) {
        ThisVariables t1 = new ThisVariables(100, 200);
    }
}

