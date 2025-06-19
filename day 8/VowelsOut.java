public class VowelsOut {
    public static void main(String[] args) {
        
        String str = "hello";

        String str1 = str.toLowerCase();

        char carr[] = str1.toCharArray();

        StringBuffer out = new StringBuffer();

        for(int i =0;i<carr.length;i++){

               if(carr[i] == 'a' || carr[i] == 'e' || carr[i] =='i' || carr[i] =='o' || carr[i] =='u'){
                continue;
               }
               else{
                out.append(carr[i]);
               }

        }
        System.out.println(out.toString());

     
    }
}
