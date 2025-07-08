public class ValidParentheses {

    public static boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch; // push
            } else {
                if (top == -1) return false; // stack is empty
                char last = stack[top--]; // pop

                if ((ch == ')' && last != '(') ||
                    (ch == '}' && last != '{') ||
                    (ch == ']' && last != '[')) {
                    return false;
                }
            }
        }

        return top == -1; // stack should be empty at the end
    }

    public static void main(String[] args) {
        String input = "({[]})";
        if (isValid(input)) {
            System.out.println("The string has valid parentheses.");
        } else {
            System.out.println("The string has invalid parentheses.");
        }
    }
}
