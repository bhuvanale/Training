import java.util.TreeMap;
import java.util.Map;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Character,String> t = new TreeMap<>();
        t.put('H', "Hyd");
        t.put('V', "Vig");
        t.put('T', "Tir");
        t.put('U', "UP");
        System.out.println("Cities : "+t);

        System.out.println("hihest ksy than N : "+t.higherKey('N'));
        System.out.println("lower Key than C : "+t.lowerKey('C'));
        System.out.println("is C avail : "+t.containsKey('C'));
        System.out.println("is tiupati avail ? : "+t.containsValue("Tir"));
        System.out.println("Keys: ");
        for(Map.Entry<Character,String> keys:t.entrySet()){
            System.out.print(keys.getKey()+",");
        }
        System.out.println("\nvalues: ");
        for(Map.Entry<Character,String> vals:t.entrySet()){
            System.out.print(vals.getValue()+",");
        }
    }
}
