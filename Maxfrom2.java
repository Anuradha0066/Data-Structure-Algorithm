package Array_1D;

public class Maxfrom2 {
    public static void main(String[] args) {
         int[] arr={1,2,3,4};
        int[] arr1={3,4,5};
  int max=Integer.MIN_VALUE;
      for(int val:arr){
        if(val>max){
            max=val;
        }}
       for(int val1:arr1){
        if(val1>max){
            max=val1;
        } 
      }
    System.out.println(max);
}
}