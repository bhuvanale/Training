import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<Boolean> l = new ArrayList<Boolean>();
        l.add(true);
        l.add(false);
        l.add(false);
        l.add(null);
        System.out.println("List interface: "+l);

    }
}
