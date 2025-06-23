public class Exception {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            //User end statements
            System.out.println("problem due to operator");

        // developer end statements
        System.out.println("---------------------------------------\nStsck trace");
        e.printStackTrace();
        System.out.println("-------------------------------------------\nto string");
        System.out.println(e.toString());
        System.out.println("----------------------------------------------\nget message");
        System.out.println(e.getMessage());
        
        }
    }
}
