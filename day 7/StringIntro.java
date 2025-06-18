public class StringIntro {

    public static void main(String[] args) {
    
        String s1 = new String("divine");
        String s2 = new String("divine");
        String s3 ="rk";
        String s4 ="rk";
        String s5 = "divine";
        // System.out.println("String literal: "+s);
        // System.out.println("String object : "+s1);
        // System.err.println(s1.concat(s));//we can assecsee but cannot change 
        // String s2 = s1.concat(s);
        // System.err.println(s2);
        // System.err.println(s1);
        System.out.println("addres of s1 == s2: "+(s1==s2));//address comparision
        System.out.println("Address of s3 == s4: "+(s3==s4));
        System.out.println("content of s1==s2: "+s1.equals(s2));
        System.out.println("content of s3 == s4 : "+s3.equals(s4));
        System.out.println("object and string: "+s1.equals(s4));
                System.out.println("object and string: "+s1.equals(s5));

    }
}