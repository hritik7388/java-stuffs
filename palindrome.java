import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int rem,sum=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the any value to check whether the number is palindrome or not:");
        int num=sc.nextInt();
    
        temp=num;
        while(num>0){

            rem=num%10;
        
            sum=(sum*10)+rem;
            num=num/10;
        }

            if(temp==sum)
            System.out.println("its a palindrome");

            else
            System.out.println("not palindrome");
        
    }
}
