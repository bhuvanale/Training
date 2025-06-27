import java.util.HashMap;

public class CharCount {
    public static void main(String[] args) {
        HashMap<Character, Integer> hm = new HashMap<>();

        String str = "this is this is class for class";

        for (char ch : str.toCharArray()) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }

        System.out.println(hm);
    }
}
