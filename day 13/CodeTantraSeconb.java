import java.util.Scanner;

public class CodeTantraSeconb {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);

        String s1 = s.next();
        String s2 = s.next();

        System.out.println(s1.length()+" "+s2.length());
        System.out.println(s1+s2);

        StringBuffer sb1 = new StringBuffer(s1);


        StringBuffer sb2 = new StringBuffer(s2);



        char firstCharS1 = s1.charAt(0);
        char firstCharS2 = s2.charAt(0);

        sb1.setCharAt(0, firstCharS2);
        sb2.setCharAt(0, firstCharS1);
        System.out.println(sb1+"."+sb2);

        s.close();

    }
}
