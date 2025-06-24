public class StringIndexOutOfBoundsEx {
    public static void main(String[] args) {
        
        String s = "hello";

        try{
            System.out.println("index of 1 :"+s.charAt(1));
            System.out.println("index of 7: "+s.charAt(7));
        }
        catch(StringIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
