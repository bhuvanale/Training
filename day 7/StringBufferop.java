public class StringBufferop {
    public static void main(String[] args) {
        String str = "radha";

        StringBuffer sb = new StringBuffer(str);

        String outster = sb.reverse().toString();

        System.out.println("reverse of string: "+outster);

        if(outster == str){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
