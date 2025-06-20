class Data{
    int a = 100,b = 20;
}
class Basic extends Data{
    public void add(){
        System.out.println("Addition: "+(a+b));
    }
}
class Shape extends Data{
    public void area(){
        System.out.println("area: "+(a*b));
    }
}
public class HierarchialInheritance {
    public static void main(String[] args) {
    Basic b = new Basic();
    Shape s = new Shape();
    b.add();
    s.area();

    }
}
