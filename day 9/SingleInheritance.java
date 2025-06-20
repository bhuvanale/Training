class Parent{
    double money = 1000000;
    
    public void asset(){
        System.out.println("parent Asset: "+money);
    }
}

class Child extends Parent{
    double liabilities = 500000;

    public void cchildAsset(){
        System.out.println("child assets: "+(money-liabilities));
    }

}
public class SingleInheritance {
    public static void main(String[] args) {

        Parent p = new Parent();

        p.asset();

        Child ch = new Child();

        ch.cchildAsset();

        
        
        
    }
}
