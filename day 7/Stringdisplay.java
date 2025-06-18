import java.util.Scanner;

public class Stringdisplay {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        // System.out.println("enter a string:");
        // String s1 = s.next();
        // System.out.println("next menthod: "+s1);
        // System.out.println("enter a string:");
        String s2 = s.nextLine();
        System.out.println("next line method: "+s2);;
        s.close();
    }
}