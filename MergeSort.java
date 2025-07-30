package Recursion;

import java.util.ArrayList;

public class MergeSort {
    static void sort(int[] arr,int s,int e){
    if(s<e){
        int mid=(s+e)/2;
        sort(arr, s, mid);
        sort(arr, mid+1, e);
        merge(arr, s, mid, e);
    }
   
  
    }
    static void merge(int[] arr,int s,int mid,int e){
        ArrayList<Integer> temp=new ArrayList<>();
        int i=s;
        int j=mid+1;
        while(i<=mid && j<=e){
         if(arr[i]<=arr[j]){
            temp.add(arr[i]);
            i++;
         }
         else {
            temp.add(arr[j]);
            j++;
         }
        }
         while (i<mid) {
            temp.add(arr[i]);
            i++;
         }

          while (j<mid) {
            temp.add(arr[j]);
            j++;
         }

         for(int k=0;k<temp.size();k++){
            arr[s+k]=temp.get(k);
         }
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,4,7,8};
        sort(arr, 0, arr.length-1);
       
        for(int num:arr){
            System.out.println(num);
        }
    }
}
