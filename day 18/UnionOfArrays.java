import java.util.HashSet;

public class UnionOfArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,1,2,3,4};
        int arr2[] ={5,3,2,7,8,6};

        HashSet<Integer> hs = new HashSet<>();

        for (int arr : arr1)  hs.add(arr);
        for (int arr : arr2)  hs.add(arr);
        
        System.out.println("union set: "+hs);
    }
}
