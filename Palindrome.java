package Arr;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1};
        int[] rev=new int[arr.length]; 
       for(int i=arr.length-1,j=0;i>=0;i--,j++){
        rev[j]=arr[i];
       }
       String revs=Arrays.toString(rev);
     String arrs=Arrays.toString(arr);

    //    if(revs.equals(arrs)){
    //     System.out.println("palindrome");
    //    }
    //    else{
    //     System.out.println("not palindrome");
    //    }
  
   boolean a= isBool(arrs, revs);
   System.out.println(a);
    }
    
    public static boolean isBool(String arrs,String revs){
   if(revs.equals(arrs)){
    return true;
   }
   return false;
    }
}
