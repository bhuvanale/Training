import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");
        hm.put(4, null);
        hm.put(null, null);

        System.out.println("Hash map: "+hm);

        System.out.print("Keys: ");
        for(Map.Entry<Integer,String> entry:hm.entrySet()){
            System.out.print(entry.getKey()+",");
        }
        System.out.print("\nValues: ");
        for(Map.Entry<Integer,String> entry:hm.entrySet()){
            System.out.print(entry.getValue()+",");
        }
        System.out.println("\nkey 4 avail ? "+hm.containsKey(4));
        System.out.println("is two value avail? "+hm.containsValue("two"));

        hm.remove(null);
        hm.put(23, "hi");

        System.out.println("Hash map: "+hm);

    }
}
