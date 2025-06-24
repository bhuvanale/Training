import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        String str = s.next();

        char carr[] = str.toCharArray();

        boolean visited[] = new boolean[carr.length];

        for(int i = 0;i<carr.length;i++){
            if(visited[i]) continue;

            int count = 0;
            for (int j = 0; j < carr.length; j++) {
                if(carr[i] == carr[j]){
                    count++;
                    visited[j] = true;
                }
                
            }
            System.out.println(carr[i]+" : "+count);
        }

        s.close();
    }
}
