public class ArrayIndexOutOfBoundsEx {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};

        try{
            System.out.println("index of 3 :"+arr[3]);
            System.out.println("index of 5: "+arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
