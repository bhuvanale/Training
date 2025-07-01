public class TwoPointerPalindromeCheck {
    public static void main(String[] args) {
        String str = "liril";
        int start = 0;
        int end = str.length()-1;
        boolean ispal = true;
        while (start<end) {
            if(str.charAt(start)!=str.charAt(end)){
                ispal=false;
                break;
            }
                start++;
                end--;
            
        }
            if(ispal){
                      System.out.println(str+" is palindrome ");
            }
            else{
                      System.out.println(str+" not palindrome");

            }

    }
}
