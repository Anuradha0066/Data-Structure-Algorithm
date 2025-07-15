package Search;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int target=3;
       int data=BinarySearch(arr, target);
       System.out.println(data);
        
        
    }
    public static int BinarySearch(int[]arr,int target){
       int start=0;
        int end=arr.length-1;
        while(start <= end){
          int mid=(start+end)/2;
          if(arr[mid]==target){
           return arr[mid] ;
          }
          else if(target<arr[mid]){
            
             end = mid-1;
          }
          else{
           start =mid+1;
          }
        }
        return -1;
    }
}
