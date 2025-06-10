public class Table1 {
    
    public static void main(String[] args) {
        int n=15;
        System.out.println("----------------------------------------");
        System.out.println("| S.No\t| Name\t| Roll No |");
        System.out.println("----------------------------------------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
            if(j==1||j==n){
                System.out.print("|");
            }
            else{
                System.out.print(" ");
            }
            System.out.print(" ");
        }
            System.out.println();
        }
        System.out.println("----------------------------------------");


    }
}
