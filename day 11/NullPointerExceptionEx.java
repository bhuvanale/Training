public class NullPointerExceptionEx {

    public static void main(String[] args) {
        String str = null;

        try{
            System.out.println("Strength length: "+str.length());
        }catch(NullPointerException e){
            e.printStackTrace();
        }
    }
}