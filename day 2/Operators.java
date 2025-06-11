public class Operators {
    public static void main(String[] args) {
        int a=10,b=15;
        System.out.println(a+ + + + - -b-a+a + +-b);
        System.out.println(b+ - -a+ - -a-b- - +a);
        System.out.println(b+ + -b-a-b+ + + a);
    }       
}

class Exercise{
    public static void main(String[] args) {
        int n=4,number=1234,sum=0;
        
        while (number != 0) {
            sum += number % 10;  // get last digit
            number /= 10;        // remove last digit
        }

        System.out.println("Sum of digits: " + sum);
        System.out.println("square: "+(n*n));
        System.out.println("cube: "+(n*n*n));
    }
}
