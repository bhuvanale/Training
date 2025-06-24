class CustomException extends Exception{
    public CustomException(String msg){
        super(msg);
    }
}
public class CustomEx {

    public static void tokenCheck(int token) throws CustomException{
        if(token <=0){
            throw new CustomException(token + "Token is not valid");
        }else{
            System.out.println(token+" Token is a valid token");
        }
    }
    public static void main(String[] args) throws CustomException {
        
        int token = 10;
        tokenCheck(token);
    }
}
