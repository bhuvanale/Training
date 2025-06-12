public class Reverse {
    public static void main(String[] args) {
        int num = 1234,rev=0,digit;
      
        while(num != 0){
            digit = num %10;
            rev = rev *10+digit;
            num /=10;
        }
        System.out.println(rev);
    }
}


class ReverseToWords {
    public static void main(String[] args) {
        int num = 1234,digit;
    
        
        while( num != 0){
            digit = num %10;
            switch(digit){
            case 0:System.out.print("Zero"); break;
            case 1:System.out.print("One"); break;
            case 2:System.out.print("Two"); break;
            case 3:System.out.print("Three"); break;
            case 4:System.out.print("Four"); break;
            case 5:System.out.print("Five"); break;
            case 6:System.out.print("Six"); break;
            case 7:System.out.print("Seven"); break;
            case 8:System.out.print("Eight"); break;
            case 9:System.out.print("Nine"); break;
            default:System.out.println("no number provided");
           
            }
             num /= 10;
        }


    }
}
