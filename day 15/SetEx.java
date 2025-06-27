import java.util.HashSet;

public class SetEx {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
           hs.add(10); 
           hs.add(20);
           hs.add(30);
           hs.add(40);
   
        System.out.println("Hash set : "+hs);
        hs.add(null);

        System.out.println("Hash set : "+hs);
        hs.remove(2);
        System.out.println("Hash set : "+hs);

        System.out.println("is 40 contains: "+hs.contains(40));

        hs.clear();

        System.out.println("Hash set : "+hs);

    }
}
