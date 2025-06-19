import java.util.Arrays;

public class StringBuilderAnagram {
        public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        // Step 1: Check lengths
        if (str1.length() != str2.length()) {
            System.out.println("Given strings are not anagram");
            return;
        }

        // Step 2: Convert strings to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Step 3: Sort the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 4: Use StringBuffer to convert sorted arrays back to strings
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();

        for (char c : arr1) {
            sb1.append(c);
        }

        for (char c : arr2) {
            sb2.append(c);
        }

        // Step 5: Compare sorted strings
        if (sb1.toString().equals(sb2.toString())) {
            System.out.println("This is an anagram");
        } else {
            System.out.println("Given strings are not anagram");
        }
    }
}


