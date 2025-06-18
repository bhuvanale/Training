import java.util.Scanner;
public class SentenceRev {
   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sc = s.nextLine();
        System.out.println("the string is: "+sc);
        String rev = "";
        String arr[] = sc.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            rev += arr[i]+" ";
        }
        System.out.println("the reverse of string: "+rev);
        s.close();
    }
}


