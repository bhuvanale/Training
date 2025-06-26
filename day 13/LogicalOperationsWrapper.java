public class LogicalOperationsWrapper {
    public static void main(String[] args) {
        // Creating Boolean wrapper class objects
        Boolean a = Boolean.TRUE;   // Autoboxing: true -> Boolean object
        Boolean b = Boolean.FALSE;

        // Logical AND
        Boolean andResult = a && b;

        // Logical OR
        Boolean orResult = a || b;

        // Logical NOT
        Boolean notA = !a;
        Boolean notB = !b;

        // Displaying the results
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a AND b = " + andResult);
        System.out.println("a OR b = " + orResult);
        System.out.println("NOT a = " + notA);
        System.out.println("NOT b = " + notB);
    }
}
