public class SpeedCheck {
    public static void main(String[] args) {
        int n = 100000;
        String str1 = "Hello";
        StringBuffer sbuffer = new StringBuffer("Hello");
        StringBuilder sbuilder = new StringBuilder("Hello");

        System.out.println(str1);

        long start = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            str1 +="!";
            
        }

        long end = System.currentTimeMillis();

        System.out.println("string executoon time: "+(end - start)+" ms");


        start = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            sbuffer.append("!");
            
        }
        end = System.currentTimeMillis();

        System.out.println("string buffer executoon time: "+(end - start)+" ms");


         start = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            sbuilder.append("!");
            
        }
        end = System.currentTimeMillis();

        System.out.println("string builder executoon time: "+(end - start)+" ms");

    }
}
