public class SpaceComplexity {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        // clean memeory
        runtime.gc();

        double before = runtime.totalMemory()-runtime.freeMemory();

        int size=10;
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;   
        }

        double after  = runtime.totalMemory()-runtime.freeMemory();
        System.out.println("space occupied: "+(after-before)+"bytes");
        System.out.println("space occupied: "+(after-before)/1024+"kbs");
        System.out.println("space occupied: "+(after-before)/(1024*1024)+"mbs");
        System.out.println("space of app: "+runtime.totalMemory()/(1024*1024)+"mbs");

    }
}
