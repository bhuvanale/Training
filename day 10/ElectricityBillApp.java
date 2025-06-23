import java.util.Scanner;

// Abstract class - hides the internal logic and provides a method to calculate bill
abstract class ElectricityBill {
    protected double ratePerUnit = 7.5; // hidden from user

    // Abstract method
    public abstract double calculateBill(int units);
}

// Concrete class providing service
class BillCalculator extends ElectricityBill {

    @Override
    public double calculateBill(int units) {
        return units * ratePerUnit;
    }
}

// Main class - user interface
public class ElectricityBillApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of electricity units used:");
        int units = sc.nextInt();

        ElectricityBill bill = new BillCalculator(); // abstraction in action
        double total = bill.calculateBill(units);

        System.out.println("Total Electricity Bill: ₹" + total);
        sc.close();
    }
}
