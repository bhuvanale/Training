
import java.util.Scanner;;
public class CoddeTantraSecondMe {

    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        String str = s.next();

        char carr[] = str.toCharArray();

        boolean isVisited[] = new boolean[carr.length];

        for (int i = 0; i < carr.length; i++) {

            if(isVisited[i]) continue;
            int count =1;

            for (int j = i+1; j < carr.length; j++) {
                if(carr[i]==carr[j]){
                    count++;
                    isVisited[j] = true;
                }
            }
            System.out.println(carr[i] + " : "+count);
            
        }
        s.close();
    }
}