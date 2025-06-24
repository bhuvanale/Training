public class ClassCastEx {
    public static void main(String[] args) {
        
        Object obj = "123";

        try{
            int i = (int)obj;
            System.out.println(i);
        }
        catch(ClassCastException e){
            e.printStackTrace();
        }
    }
}
