import java.util.Scanner;

public class sum{
    public static void main(String[] args) {
        int num,sum;
      
        System.out.println("enter the values");
        Scanner sc=new Scanner(System.in);
       
        num=sc.nextInt();

        for(sum= 0;num!=0;num=num/100){
            sum= sum+num%100;
            
        }
        System.out.println(+sum);

    }
}