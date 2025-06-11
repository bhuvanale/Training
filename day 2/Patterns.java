public class Patterns {
    //right ange triangle
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
class InvertedTri{
    //inverted right ange triangle
    public static void main(String[] args) {
        int n=4;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}


class Kpattern{
    public static void main(String[] args) {
        int n=4;
         for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class ButterflyPattern{
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            //upper triangle
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
//space     
            int space = 2*(n-i);
            for(int j=1;j<= space ;j++){
                System.out.print(" ");
            }

             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
//space
              int space = 2*(n-i);
            for(int j=1;j<= space;j++){
                System.out.print(" ");
            }

             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



class Xpattern{
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}