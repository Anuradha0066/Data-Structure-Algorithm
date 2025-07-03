package Arr;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,3,0,4};
       int nonzero=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]!=0){
            arr[nonzero]=arr[i];
            nonzero++;
           }
        }
        for(int i=nonzero;i<arr.length;i++){
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
