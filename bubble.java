
public class bubble{
    private static String[] arr;
    private static bubble b1;

    static void print(int arr[]){
       int n=arr.length;
       int temp;
       for(int i=0;i<n;i++){

        System.out.println(arr[i]+"");

       }


    }
    static void bubblesort(int arr[]){
        int i,j,temp;
        int n=arr.length;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;     // time complexity best o(n);average and worst are same o(n^2);
                }

            }
        }
    }

    public static void main(String[] args) {
        int arr[]={100,35,78,56,23,98,74};
        System.out.println("before sort:");
        bubble.print(arr);
        bubble.bubblesort(arr);
        System.out.println();
        System.out.println("after sorting");
        bubble.print(arr);
            
    

        
    }

}