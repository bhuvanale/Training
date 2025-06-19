public class Laptopex {

    String model,processor,work;
    int ram,rom;

    public Laptopex(String model,int ram,int rom, String processor,String work){
        this.model=model;
        this.ram = ram;
        this.rom = rom;
        this.processor= processor;
        this.work=work;

    }

    public void display(){
        System.out.println(this.model);
        System.out.println(this.ram);
        System.out.println(this.rom);
        System.out.println(this.processor);
        System.out.println(this.work);
    }
    public static void main(String[] args) {
        Laptopex hp = new Laptopex("hp",8,8,"i5 12 gen","gaming");
        hp.display();
       

    }
    
}
