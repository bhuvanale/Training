class Gen1 {
    String feature = "Calling";

    public void featureGen1() {
        System.out.println("Gen1 Feature: " + feature);
    }
}

class Gen2 extends Gen1 {
    String feature2 = "SMS";

    public void featureGen2() {
        System.out.println("Gen2 Feature: " + feature2);
    }
}

class Gen3 extends Gen2 {
    String feature3 = "Internet";

    public void featureGen3() {
        System.out.println("Gen3 Feature: " + feature3);
    }
}

public class MobileGen {
    public static void main(String[] args) {
        Gen3 mobile = new Gen3();
        mobile.featureGen1();  // Inherited from Gen1
        mobile.featureGen2();  // Inherited from Gen2
        mobile.featureGen3();  // Defined in Gen3
    }
}
