public class SentenceRevCharacter {
    public static void main(String[] args) {
        String str = "this is java class";

        String sarr[] = str.split(" ");

        for(int i= 0;i< sarr.length;i++){
            char carr[] = sarr[i].toCharArray();
                for (int j = carr.length-1; j >=0 ; j--) {
                     System.out.print(carr[j]);
                }
                System.out.print(" ");
           
        }
    }
}
