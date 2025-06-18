import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();

        char[] carr = s.toCharArray();
        String rev ="";

        for (int i = carr.length-1; i >=0; i--) {
            rev +=carr[i];
            
        }
        if(rev.equals(s)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        sc.close();
    }
}


