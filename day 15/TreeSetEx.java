import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(8);
        ts.add(15);
        ts.add(2);
        ts.add(17);
        ts.add(23);
        System.out.println("Tree Set : "+ts);
        System.out.println("obj higher than 15 "+ts.higher(15));
        System.out.println("obj lower than 2: "+ts.lower(2));
        System.out.println("obj lower than 4: "+ts.lower(4));
        System.out.println("First obj : "+ts.first());
        System.out.println("last obj : "+ts.last());
        ts.remove(17);
        System.out.println("Tree Set : "+ts);
        System.out.println("is 17 contains ? "+ts.contains(17));
        ts.clear();
        System.out.println("Tree Set : "+ts);

    }
}
