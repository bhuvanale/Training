// Base class
class Data {
    int a = 100, b = 20;
}

// First subclass
class Basic extends Data {
    public void add() {
        System.out.println("Addition: " + (a + b));
    }
}

// Second subclass
class Shape extends Data {
    public void area() {
        System.out.println("Area: " + (a * b));
    }
}

// Interface (to simulate multiple inheritance)
interface Compute {
    void show();
}

// Subclass extending Basic and using Shape through composition and implementing interface
class Result extends Basic implements Compute {
    Shape s = new Shape(); // composition used for Shape

    public void show() {
        System.out.println("In Compute Interface - show method");
        add();      // method from Basic
        s.area();   // method from Shape via object
    }
}

// Main class
public class HybridInheritance {
    public static void main(String[] args) {
        Result r = new Result();
        r.show();
    }
}
