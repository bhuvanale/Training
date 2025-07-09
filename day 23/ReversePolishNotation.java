import java.util.Stack;

public class ReversePolishNotation {

    public static int evalRPN(String[] token){
            Stack <Integer> stack = new Stack<>();

            for(String tok:token){
                if(isOperator(tok)){

                    int b = stack.pop();
                    int a = stack.pop();
                    int res = operate(a,b,tok);
                    stack.push(res);

                }
                else{
                    stack.push(Integer.parseInt(tok));
                }
            }
            return stack.peek();
    }

    public static boolean isOperator(String tok){
        return tok.equals("+")||tok.equals("-")||tok.equals("*")||tok.equals("/");
    }

    public static int operate(int a,int b,String tok){
        switch (tok) {
            case "+":return a+b; 
            case "-":return a-b; 
            case "*":return a*b; 
            case "/":
            if(b == 0){
                System.out.println("division by zero.");
                return -1;
            }
            return a/b;
            default: return -1; 
        }
    }
    public static void main(String[] args) {
        
        String exp = "2 3 * 4 ";

        String[] token = exp.trim().split("\\s+");

        System.out.println("RPN Value: "+evalRPN(token));
    }
}
