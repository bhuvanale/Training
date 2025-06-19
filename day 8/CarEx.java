public class CarEx {
    String model;
    int speed = 0;

    public void start(){
        System.out.println(model+" Car is started with speed of "+this.speed);
    }
     public void accelerate(int speed){
        this.speed += speed;
        System.out.println(model+" Car is with speed of "+this.speed);
    }
     public void brake(int speed){
        this.speed -= speed;
        System.out.println(model+" Car is with speed after break "+this.speed);
    }
    
    public static void main(String[] args) {
        
        CarEx car =new CarEx();
        car.model="Audi R8";
        car.start();
        car.accelerate(120);
        car.accelerate(80);
        car.brake(100);
    }
}
