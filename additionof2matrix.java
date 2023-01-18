public class additionof2matrix {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,6,7},{2,9,7}};
        int b[][]={{33,7,9},{23,4,65},{6,9,7}};
        int c[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                 c[i][j]=a[i][j]+b[i][j];    
                 System.out.print(c[i][j]+" ");
                
                }
                System.out.println();

        }
    }
}
    
    