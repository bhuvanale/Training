import java.util.*;

public class AllSubsets {

    public static void generateSubsets(int[] arr, int index, ArrayList<Integer> current) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }
   
        generateSubsets(arr, index + 1, current);

        current.add(arr[index]); 

        generateSubsets(arr, index + 1, current);

        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
         System.out.println("All subsets:");
        generateSubsets(arr, 0, new ArrayList<>()); 
        
    }
}
