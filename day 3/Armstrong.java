public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        String numStr = String.valueOf(num);   // Convert number to string
        int n = numStr.length();               // Use length() to count digits

        int result = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            result += (int)Math.pow(digit, n); // Raise digit to power n
            temp /= 10;
        }

        if (result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
    }
