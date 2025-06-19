public class Capitalize {

    public static void main(String[] args) {
        
        String str  = "this is java class";

        String[] sarr = str.split(" ");
        StringBuffer sb = new StringBuffer();
        
        for(String word:sarr){
           sb.append(Character.toUpperCase(word.charAt(0)));
           sb.append(word.substring(1)).append(" "); 
        }
        System.err.println("output : "+sb.toString().trim());
    }
}

