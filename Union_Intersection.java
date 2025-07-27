package Practice_Question;

import java.util.HashSet;

public class Union_Intersection {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr1={3,4,5,6,7};

       HashSet <Integer> Intersection=new HashSet<>();
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr1.length;j++){
            if(arr[i]==arr1[j]){
                Intersection.add(arr[i]);
            }
        }
       }
       for(int num:Intersection){
        System.out.println(num);
       }

       HashSet<Integer> Union=new HashSet<>();
       for(int num:arr){
        Union.add(num);
        
       }
       for(int num:arr1){
        Union.add(num);
       }
        System.out.println("Union");
       for (int num:Union){
       
        System.out.print(num+" ");
       }
    }
}
