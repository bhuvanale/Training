import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        int len1 =str1.length();
        int len2 = str2.length();
        
        if(!(len1 == len2)){
            System.out.println("given string is not anagram");
            return;
        }

        char carr1[]=str1.toCharArray();
        char carr2[]=str2.toCharArray();
        
        Arrays.sort(carr1);
        Arrays.sort(carr2);

        for (int i = 0; i < carr1.length; i++) {
            if(carr1[i] != carr2[i]){
                System.out.println("given string is not anagram");
                return;
            }
            
        }
        System.out.println("this is an anagram");
    }
}
