class Area {
    double area;

    // Constructor for Square
    Area(double side) {
        area = side * side;
        System.out.println("Area of Square: " + area);
    }

    // Constructor for Rectangle
    Area(double length, double breadth) {
        area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    // Constructor for Circle
    Area(int radius) {
        area = 3.14159 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Area square = new Area(5);           // Calls square constructor
        Area rectangle = new Area(4.5, 7.2); // Calls rectangle constructor
        Area circle = new Area(3);           // Calls circle constructor
    }
}
