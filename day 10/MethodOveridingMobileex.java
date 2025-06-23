class Android14{
    public void feature(){
            System.out.println("Default Screensavers");
    }
}
class Android15 extends Android14{
    public void feature(){
            System.out.println("Customized Screensavers");
    }
}



public class MethodOveridingMobileex {
    public static void main(String[] args) {
        Android14 a = new Android15();
        a.feature();
        
    }
}
