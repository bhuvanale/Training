public class StrREV {
    public static void main(String[] args) {
        String s ="java";

        char[] carr = s.toCharArray();
        String rev ="";

        for (int i = carr.length-1; i >=0; i--) {
            rev +=carr[i];
            
        }
        System.out.println("reverse: "+rev);
        
    }
}
