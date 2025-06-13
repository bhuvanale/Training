public class Solidpatterns {
    //solid star
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= n; j++) {
                System.out.print("* ");
        }
        System.out.println();
        }
    }
}


class Numpattern{
       public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= n; j++) {
                System.out.print(i+" ");
        }
        System.out.println();
        }
    }
}

class Numpattern1{
       public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= n; j++) {
                System.out.print(j+" ");
        }
        System.out.println();
        }
    }
}

class Numpattern2{
       public static void main(String[] args) {
        int n=4;
        for (int i = n; i >= 1; i--) {
             for (int j = 1; j <= n; j++) {
                System.out.print(i+" ");
        }
        System.out.println();
        }
    }
}