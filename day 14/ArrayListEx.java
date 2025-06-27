import java.util.ArrayList;
public class ArrayListEx{
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();    
        System.out.println("Size of ArrayList: "+a1.size());
        a1.add(10);
        a1.add("one");
        a1.add(true);
        a1.add(10.5);
        a1.add('@');
        System.out.println(a1);
        System.out.println("Size of ArrayList: "+a1.size());
        System.out.println("is @ avail? : "+a1.contains('@'));
        a1.add(null);
        a1.add(2000);
        a1.add(null);
        System.out.println("arraylist : "+a1);

        a1.remove(4);//based on index
        System.out.println("arraylist : "+a1);

        a1.remove(null);//remove first occurunce
        System.out.println("arraylist : "+a1);

        a1.set(2, 16);
        System.out.println("arraylist : "+a1);//updates the element at that index
        a1.add(2, 7);
        System.out.println("arraylist : "+a1);//add a element at that index


       ArrayList a2 = new ArrayList();

       a2.add("one");
       a2.add(10);

       System.out.println("arraylist 1: "+a2);
        a2.addAll(1,a1);//takes elements from 1 index
        
       System.out.println("arraylist 1: "+a2);
       System.out.println("does a2 contains all a1: "+a2.containsAll(a1));

       a2.remove(0);
       a2.remove("one");
       System.out.println("arraylist 1: "+a2);
       a2.removeAll(a1);
       System.out.println("arraylist 1: "+a2);

    }
}