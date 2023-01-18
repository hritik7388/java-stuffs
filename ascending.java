import java.util.Scanner;

public class ascending{
    public static void main(String[] args) {
        int[]arr={1,4,6,9,3,6,11,34,10,2,8};
        int temp=0;
        System.out.println("before ascending order");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");

        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
               
            }
        }
        System.out.println();
        System.out.println("after ascending order");
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+",");
    }
   
    }
}

  
    
    