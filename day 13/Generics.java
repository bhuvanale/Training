class Data <T>{
    T var;
    public void setData(T var){
        this.var = var;
    }
    public T getData(){
        return var;
    }
}


public class Generics {
    public static void main(String[] args) {

        Data<Integer> dint = new Data<Integer>();

        dint.setData(100);
        System.out.println("output : "+dint.getData());
        
        Data <String> dstr = new Data<>();

        dstr.setData("Java class");

        System.out.println("output : "+dstr.getData());

        Data<Boolean> dbool = new Data<>();

        dbool.setData(true);
        System.out.println("output : "+dbool.getData());
    }
}
