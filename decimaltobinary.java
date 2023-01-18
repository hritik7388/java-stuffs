import java.util.Scanner;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number to convert binary");
        int num=sc.nextInt();

        long binary=convertdecimaltobinary(num);
        System.out.println(num+"="+binary);
    }

    private static long convertdecimaltobinary(int num) {
        long binaryNum=0;
        int rem,i=1,step=1;
        while(num!=0){
            rem=num%2;
            num/=2;
            binaryNum+=rem*i;
            i*=10;
        }


        return binaryNum;
    }
}
