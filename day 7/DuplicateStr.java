public class DuplicateStr {
    public static void main(String[] args) {
        String str = "google";
        char carr[]=str.toCharArray();
        boolean visited[] = new boolean[carr.length];
   
        for(int i=0;i<carr.length;i++){
            if(visited[i]) continue;

            int count =0;
            for(int j=i+1;j<carr.length;j++){
            if(carr[i]==carr[j]){
                count++;
                visited[j] =true;
                }
            }
          
            if(count >= 1){
                System.out.println(carr[i]+" ");
            }
        }
    }
}
