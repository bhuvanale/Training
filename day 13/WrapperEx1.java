import java.util.Scanner;

class Addition {
    public void add(int a, int b) {
        System.out.println("Sum of int + int: " + (a + b));
    }

    public void add(int a, double b) {
        System.out.println("Sum of int + double: " + (a + b));
    }

    public void add(double a, int b) {
        System.out.println("Sum of double + int: " + (a + b));
    }

    public void add(double a, double b) {
        System.out.println("Sum of double + double: " + (a + b));
    }
}

public class WrapperEx1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Addition add = new Addition();

        System.out.print("Enter first number: ");
        String str1 = s.next();
        System.out.print("Enter second number: ");
        String str2 = s.next();

        boolean isInt1 = str1.matches("-?\\d+");
        boolean isInt2 = str2.matches("-?\\d+");

        if (isInt1 && isInt2) {
            // Both inputs are integers
            Integer i1 = Integer.valueOf(str1);
            Integer i2 = Integer.valueOf(str2);
            add.add(i1, i2);
        } else if (isInt1 && !isInt2) {
            // First input is int, second is double
            Integer i1 = Integer.valueOf(str1);
            Double d2 = Double.valueOf(str2);
            add.add(i1, d2);
        } else if (!isInt1 && isInt2) {
            // First input is double, second is int
            Double d1 = Double.valueOf(str1);
            Integer i2 = Integer.valueOf(str2);
            add.add(d1, i2);
        } else {
            // Both inputs are double
            Double d1 = Double.valueOf(str1);
            Double d2 = Double.valueOf(str2);
            add.add(d1, d2);
        }

        s.close();
    }
}
