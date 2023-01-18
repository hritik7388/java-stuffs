import java.util.Scanner;

public class octal{
    public static void main(String[] args) {
        int rem;
        String octal="";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value ");
        int decimal=sc.nextInt();
        char octalchar[]={'1','2','3','4','5','6','7'};

        while(decimal>0){
            rem=decimal%8;
            octal=octalchar[rem]+octal;
            decimal=decimal/10;
            

        }
        System.out.println(""+octal);


    }
        
     
    
}
