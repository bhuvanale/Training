public class StringBuilderex {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer(40);
        StringBuffer sb2 = new StringBuffer("hello");


        System.out.println("initial capacity:"+sb1.capacity());

         System.out.println("initial capacity:"+sb2.capacity());

        System.out.println("initial capacity : "+sb.capacity());

        sb.append("12345678912345678889");

        //capacity formula = (old capacity+1)*2
        //i.e (16+1)*2 = 17*2 = 34

        System.out.println("new capacity : "+sb.capacity());
    }
}



