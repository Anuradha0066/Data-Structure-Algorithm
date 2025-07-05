package Array_1D;

public class Unique {
    public static void main(String[] args) {
         int[] arr={1,2,3,4};
        int[] arr1={3,4,5,6};
        for(int i=0;i<arr.length;i++){
        boolean data=true;
            for(int j=0;j<arr1.length;j++){
             if(arr[i]==arr1[j]){
                data=false;
                //break;
             }
            }
            if(data==true){
                System.out.println(arr[i]);
            }

            
        }
    }
}
