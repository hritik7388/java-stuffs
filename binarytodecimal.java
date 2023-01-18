import java.util.*;
public class binarytodecimal{
    private static double i = 0;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of binary number");
            long num=sc.nextLong();

            int decimal=convertbinarytodecimal(num);
            System.out.println("binary to decimal");
            System.out.println(num+"="+decimal);
        }

        
    }

    private static int convertbinarytodecimal(long num) {
        int deciamlNum=0;
        
        long rem;
        while(num!=0){
            rem=num%10;
            num/=10;
            deciamlNum+=rem*Math.pow(2,i);
            ++i;
        }
        return deciamlNum;
    }
}
