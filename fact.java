import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        int pow=1,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("entyer the value for finding fact");
        int num=sc.nextInt();
        for(i=1;i<num;i++){
            pow=pow*i;
            
        }
        System.out.println("fact of number: " + num + " is " +pow);
    }
    
}
