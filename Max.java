package DSA;

public class Max {
    public static void main(String[] args) {
         int[] arr={1,2,3,4,5};
        int[] arr1={3,4,5,6};

        int max=0;
        int max1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
       for(int j=0;j<arr1.length;j++){
        if(arr1[j]>max1){
            max1=arr1[j];
        }
       }
       if(max1>max){
        System.out.println(max1);
       }
       else{
        System.out.println(max);
       }
    }
}
