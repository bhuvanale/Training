import java.util.Scanner;

public class SentenceLength {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sc = s.nextLine();
        System.out.println("the string is: "+sc);

        String arr[] = sc.split(" ");
        System.out.println("string length: "+arr.length);
        s.close();
    }
}
