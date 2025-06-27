import java.util.ArrayList;

public class CloneArrayListEx {
    public static void main(String[] args) {
        ArrayList <Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        System.out.println("Array List - 1 : "+a1);

        ArrayList <Integer> a2 = (ArrayList<Integer>)a1.clone();

        System.out.println("Array List - 2 : "+a2);
        a2.remove(0);
        a2.remove(a2.size()-1);

        System.out.println("Array List - 2 : "+a2);


    }
}
