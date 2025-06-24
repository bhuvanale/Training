public class IllegalArgumentEx {

    public static void checkAge(int age){
        if(age <= 0){
            throw new IllegalArgumentException("\nInvalid age \nage cannot be negative");
        }else{
            System.out.println("age is valid");
        }
    }
    public static void main(String[] args) {
        int age = -10;
        checkAge(age);
    }
}
