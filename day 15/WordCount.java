import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        String str = "this is this is class for class";
        String s[]  = str.split(" ");
        for(String str1:s){
            if(hm.containsKey(str1)){
                hm.put(str1, hm.get(str1)+1);
            }
            else{
                hm.put(str1,1);
            }

        }
        System.out.println(hm);

    }
}
