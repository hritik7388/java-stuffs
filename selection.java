
import java.util.Scanner;
public class selection{
    static void selection(int arr[]){
        int n=arr.length,small,i,j;
        int temp;
        for(i=0;i<n-1;i++){
            small=i;
            for(j=i+1;j<n;j++)
            if(arr[small]>arr[j])
                small=j;
                temp=arr[small];
                arr[small]=arr[i];
                arr[i]=temp;
            }
           
                }
                static void print(int arr[]){
                    int n=arr.length;
                    int i;//(o(n^2) in all hree cases)
                    for(i=0;i<n;i++)
                        System.out.println(arr[i]+"");
            }
            public static void main(String[] args) {
                int arr[]={91,49,4,29,10,21};
                selection i1=new selection();
                System.out.println("before selection");
                i1 .print(arr);
                
                i1.selection(arr);
               
                System.out.println("after selection");
                i1.print(arr);
                System.out.println();


            
            }
        }
         
    


