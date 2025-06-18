
public class StringMethods {
    public static void main(String[] args) {
        String str1 = new String("Shree Radha");
        System.out.println("str1: "+str1);
        System.out.println("Length of str1: "+str1.length()); 
        System.out.println("index of a: "+str1.indexOf("a"));
        System.out.println("Merging of Strings "+str1.concat(" Shree Krish"));
        System.out.println("upper case: "+str1.toUpperCase());
        System.out.println("lower case: "+str1.toLowerCase());
        System.out.println("chaaracter at index 4: "+str1.charAt(4));
        System.out.println("euals operation: "+str1.equals("shree"));
        System.out.println("equals case ignore case :"+str1.equalsIgnoreCase("shree radha"));
        System.out.println("last index of a: "+str1.lastIndexOf("a"));
        System.out.println("replace of: "+str1.replace("R", "r"));
        System.out.println("original string: "+str1);
        String[] sarr=str1.split(" ");
        for (int i = 0; i < sarr.length; i++) {
            System.out.println("String at "+i+" : "+sarr[i]);
        }


    }
}

class StringMethodsLiteral {
    public static void main(String[] args) {
        String str1 = "Shree Radha";
        System.out.println("str1: "+str1);
        System.out.println("Length of str1: "+str1.length()); 
        System.out.println("index of a: "+str1.indexOf("a"));
        System.out.println("Merging of Strings "+str1.concat(" Shree Krish"));
        System.out.println("upper case: "+str1.toUpperCase());
        System.out.println("lower case: "+str1.toLowerCase());
        System.out.println("chaaracter at index 4: "+str1.charAt(4));
        System.out.println("euals operation: "+str1.equals("shree"));
        System.out.println("equals case ignore case :"+str1.equalsIgnoreCase("shree radha"));
        System.out.println("last index of a: "+str1.lastIndexOf("a"));
        System.out.println("replace of: "+str1.replace("R", "r"));
        System.out.println("original string: "+str1);


    }
}
