package Search;

public class Minimum_in_RotaSort {
    public static void main(String[] args) {
        int[] nums={5,6,7,8,1,2,3,4};
        
       int data=findMin(nums);
       System.out.println(data);
       
        
    }

    public static int findMin(int[] nums){
        int left=0;
        int right=nums.length-1;
       

    while(left<right){
         int mid=left+(right-left)/2;
        if(nums[mid]>nums[right]){
            left=mid+1;
        }
        else{
            right=mid;
        }
    }

        return nums[right];

    }
    
}
