interface Father{
    double fh =5.0;
}

interface Mother{
    double mh =5.6;
}

interface Child extends Father,Mother{
    public void childHeight();
}

class Height implements Child{
     public void childHeight(){
        //we have fh,mh here 
        System.out.println("Average child height : "+(float)((fh + mh)/2));
     }
}
public class HeightInterfaceEx {
    public static void main(String[] args) {

        Height h = new Height();

        h.childHeight();
        
    }
}
