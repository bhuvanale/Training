import java.util.LinkedHashSet;

public class LinkedHashSetEx {

    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        System.out.println("ia empty: "+lhs.isEmpty());
        System.out.println("Size: "+lhs.size());

        lhs.add("Ferrari");
        lhs.add("Ford");
        lhs.add("BMW");
        lhs.add("Audi");
        lhs.add("Aston Martin");
        lhs.add("Tata");

        System.out.println("Linked hash set: "+lhs);
        lhs.add("Tata");
        lhs.add("Audi");
        System.out.println("Linked hash set: "+lhs);

        for (String car : lhs) {
            System.out.print(car+",");
        }
        System.out.println("\nis tata avail ? "+lhs.contains("Tata"));

        LinkedHashSet<String> lhs1 = new LinkedHashSet<>();

        lhs1.addAll(lhs);

        lhs1.add("Dodge");
        lhs1.add("Porche");
        lhs1.add("Maruthi");

        System.out.println("Linked hash set -1 : "+lhs1);

        

        
    }
}