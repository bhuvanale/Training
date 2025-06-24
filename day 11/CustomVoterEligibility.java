import java.util.Scanner;

class CustomException extends Exception{
    public CustomException(String msg){
        super(msg);
    }
}

public class CustomVoterEligibility {

    public static void AgeCheck(int age) throws CustomException{
        if(age  <0 || age >100){
            throw new CustomException(age + " age is not  valid");
        }
            if(age<18){
                throw new CustomException(age +" not eligible to vote");
            }
            else{
                 System.out.println(age +" eligible to vote");
            }
    }
    public static void main(String[] args) throws CustomException {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        AgeCheck(age);

        s.close();
    }
}


