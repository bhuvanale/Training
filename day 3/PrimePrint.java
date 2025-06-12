

public class PrimePrint {
    public static void main(String[] args) {
        int n = 500;
       
        for(int i=2; i <=n ; i++){
            boolean isp =true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j == 0) {
                    isp =false;
                    break;
                }
                }
                if(isp){
                    System.out.print(i+" ");
                }
           
        }
        
    }
}


class PrimeCheck{
    public static void main(String[] args) {
        int n = 7;
        if(n<=1){
            System.out.println("not a prime");
         
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0)
            {
                System.out.println("not prime");
             
            }
            else
            {
            System.out.println("prime number");
            }
        }
        
    }
}

