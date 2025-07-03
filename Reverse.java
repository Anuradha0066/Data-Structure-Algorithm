package Arr;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] rev=new int[arr.length];
        for(int i=arr.length-1, j=0; i>=0;i--,j++){
        rev[j]=arr[i];
        }
        System.out.println(Arrays.toString(rev));
    }
}
