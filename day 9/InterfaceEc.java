interface A{
    //abstract is optinal we can write without that from java 1.8 features
    abstract void display();
}
class B implements A{
    public void display(){
        System.out.println("implements mrthod ");
    }
}

class C implements A{
    public void display(){
        System.out.println("this is bhuvana ");
    }
}
public class InterfaceEc {
    public static void main(String[] args) {
        B b = new B();
        b.display();
        C c = new C();
        c.display();
    }
}
