public class maxminof2array {
    public static void findmaxandmin(int[]num){
        int max=num[0];
        int min=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];

            }
            else if(num[i]<min){
                min=num[i];


            }
        }
        System.out.println("max value "+max);
        System.out.println("min value "+min);

    }
    public static void main(String[] args) {
        int num[]={23,54,76,34,67,98};
        int num2[]={24,65,755,34,21,12};
        System.out.println("max and min foe 1st array:");
        findmaxandmin(num);
        System.out.println("max and min of 2nd array:");
        findmaxandmin(num2);
    }
}
