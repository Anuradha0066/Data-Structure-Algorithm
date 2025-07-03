package Arr;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr={10,5,30,20,15};
        int max=0;
        int SecondMax=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
               max=arr[i];
            }
           else if(arr[i]>SecondMax && arr[i]<max){
            SecondMax=arr[i];
           }
        }
        System.out.println("Max: "+max);
        System.out.println("SecondMax: "+SecondMax);
    }
}
