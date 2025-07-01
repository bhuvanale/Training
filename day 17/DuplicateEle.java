import java.util.Arrays;

public class DuplicateEle {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        // clean memeory
        runtime.gc();

        double before = runtime.totalMemory()-runtime.freeMemory();
            long start = System.nanoTime();

        int[] arr = {2,4,1,6,2,4,8,5,6,9};
        Arrays.sort(arr);
        boolean isvisited[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(isvisited[i]==true)continue;
            
            for(int j =i+1;j<arr.length;j++){
                      int count = 0;

                if(arr[i]==arr[j]){
                    count++;
                    isvisited[j]=true;
                }
            
            if(count>=1)
            System.out.println(arr[i]);
            }
        }
            long end = System.nanoTime();
    System.out.println("Execution time: "+(end-start)+"ns");
        double after  = runtime.totalMemory()-runtime.freeMemory();
        System.out.println("space occupied: "+(after-before)+"bytes");
    }
}
