public class Numpyramid {
// ----------------------------------------triangle patterns------------------------------------------
    public static void main(String[] args) {
        int n=4;
        for(int i =n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}


class Rightangle{
    public static void main(String[] args) {
        int n=4;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}


class Rightanglestar{
    public static void main(String[] args) {
        int n=4;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



class Floydtangle{
    public static void main(String[] args) {
        int n=4,count=1;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}

class Floydtanglereverse{
    public static void main(String[] args) {
        int n=4,count=1;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(count==10){
                    count=0;
                    System.out.print(count+" ");
                    break;
                }
                System.out.print(count+" ");
                count++;
                
            }
            System.out.println();
        }
    }
}


class RightanglestarHallow{
    public static void main(String[] args) {
        int n=4;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==j||j==1||i==n){
                         System.out.print("* ");
                }
                else{
                     System.out.print("  ");
                }
               
            }
            System.out.println();
        }
    }
}

class RightanglestarHallowInverted{
    public static void main(String[] args) {
        int n=4;
        for(int i =n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(i==j||j==1||i==n){
                         System.out.print("* ");
                }
                else{
                     System.out.print("  ");
                }
               
            }
            System.out.println();
        }
    }
}


class Zeroonepattern{
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}


class Leftangle{
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }

            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



class Triangle{
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}


class Pyramid {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <= n; i++){

            for (int j = 1; j <=(n-i);j++) {
                System.out.print("  ");
                
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                
            }
            for(int j=2;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        } 
    }
    
}




class InvertedPyramid {
    public static void main(String[] args) {
        int n=4;
        for (int i = n; i >= 1; i--){

            for (int j = 1; j <=(n-i);j++) {
                System.out.print("  ");
                
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                
            }
            for(int j=2;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        } 
    }
    
}


class Diamond{
    public static void main(String[] args) {
        int n=4;

        //upper diamond
        for (int i = 1; i <= n; i++){
                //left angle triangle
            for (int j = 1; j <=(n-i);j++) {
                System.out.print("  ");
                
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                
            }
            //right angle triangle
            for(int j=2;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //again inverted diamond
            for (int i = n-1; i >= 1; i--)
            {
                //left angle triangle
            for (int j = 1; j <=(n-i);j++) 
            {
                System.out.print("  ");
                
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                
            }
            //right angle triangle
            for(int j=2;j<=i;j++){
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
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


 class Butterfly{
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<= 2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

         for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<= 2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
 }


class Hourglass{
    public static void main(String[] args) {
        int n=4;
        for(int i=n;i>=1;i--){
            
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
     
    }
}


class Palindromepyramid{
    public static void main(String[] args){
        int n =5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j =i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}