package Arr;

public class Max_Min {
    public static void main(String[] args) {
        int[] arr={3,1,4,1,5,9,2};
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max is: "+max);
        System.out.println("Minimum: "+min);
    }
}
