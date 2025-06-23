
abstract class Shape{
    int len,wid;
    abstract void data(int l,int w);//an incomplete method

    public void display(){
        System.out.println("Area of shape : "+(len*wid));
    }

}

class Square extends Shape{
    public void data(int l,int w){
        System.out.println("Area of square");
            len = l;
            wid =w;

    }
}
class Rectangle extends Shape{
    public void data(int l,int w){
        System.out.println("Area of rectangle");

        len =l;
        wid =w;
    }
}
public class Abstraction{
    public static void main(String[] args) {
        Square s = new Square();
        s.data(10, 10);
        s.display();

        Rectangle r = new Rectangle();
        r.data(12, 10);
        r.display();
    }
}