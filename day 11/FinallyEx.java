public class FinallyEx {
    public static void main(String[] args) {
        String str = null;
        Object obj = "123";

        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException ae){
            ae.printStackTrace();
        }
        finally{
            System.out.println("Arithmetic operaton is done");
        }
        try {
            System.out.println(str.length());
        } catch (NullPointerException ne) {
            ne.printStackTrace();
        }
        finally{
            System.out.println("null pointer exception is done");
        }

        try{
            int i = (int)obj;
            System.out.println(i);
        }
        catch(ClassCastException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("class cast exception done");
        }
    }
}
