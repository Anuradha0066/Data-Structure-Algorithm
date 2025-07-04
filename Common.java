package Array_1D;

public class Common {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] arr1={3,4,5};
     // int maxlength=Math.max(arr.length,arr1.length); 
      for(int i=0;i<arr.length;i++){
       for(int j=0;j<arr1.length;j++){
         if(arr[i]==arr1[j]){
            System.out.println(arr[i]);
        }
       }
      }
    }
}
