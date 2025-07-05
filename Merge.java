package Array_1D;

public class Merge {
    public static void main(String[] args) {
        
    
     int[] arr={1,2,3};
     int[] arr1={3,4,5};
    int[] merge=new int[arr.length+arr1.length];

    for(int i=0;i<arr.length;i++){
        merge[i]=arr[i];
    }
    for(int i=0;i<arr1.length;i++){
        merge[i+arr.length]=arr1[i];
    }
    for(int num:merge){
        System.out.print(num+" ");
    }
}
}