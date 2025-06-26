import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking radius input as a Double wrapper class object
        System.out.print("Enter the radius of the circle: ");
        Double radius = scanner.nextDouble();  // Autoboxing happens here

        // Calculating area using the formula: π * r^2
        Double area = Math.PI * Math.pow(radius, 2);  // radius is a wrapper object

        // Displaying the result
        System.out.println("Area of the circle is: " + area);
        scanner.close();
    }
}
