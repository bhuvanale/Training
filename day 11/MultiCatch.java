public class MultiCatch {
    public static void main(String[] args) {
        
        Object obj = "123";

        try{
            System.out.println(obj);
        }
        catch(ArithmeticException e){
            e.printStackTrace();;
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
