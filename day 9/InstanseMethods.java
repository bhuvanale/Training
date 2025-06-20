public class InstanseMethods {
    
    double temp;

    public void Todaytemp(double temp){
        this.temp=temp;
        System.out.println("Today's temperature is : "+this.temp);
    }

     public void Nexttemp(double temp){
        this.temp = temp - this.temp;
        System.out.println("Next day's temperature is higher than today by : "+this.temp);
    }
    public static void main(String[] args) {
        InstanseMethods i1 = new InstanseMethods();
        i1.Todaytemp(35.0);
        i1.Nexttemp(39.5);
    }
}
