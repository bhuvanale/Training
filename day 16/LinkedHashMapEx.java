import java.util.LinkedHashMap;
public class LinkedHashMapEx{
    public static void main(String[] args) {
        LinkedHashMap <Integer,String> lhm = new LinkedHashMap<>();
        lhm.put(101, "kanha");
        lhm.put(102, "radha");
        lhm.put(103, "kishore");
        lhm.put(104, "kishori");
        System.out.println("Linked Hash Map: "+lhm);

        System.out.println("find 120 key data  : "+lhm.get(102));
        System.out.println("is 107 avail: "+lhm.containsKey(107));
        System.out.println("is kanha avail ? "+lhm.containsValue("kanha"));

        if(lhm.containsValue("kishori")){
            lhm.put(104, "shree ji");
        }else{
            System.out.println("Sorry id not found");
        }
        System.out.println("Employee Details: "+lhm);

    }
}