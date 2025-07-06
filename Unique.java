package DSA;

public class Unique {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr1={3,4,5,6};

        for(int i=0;i<arr.length;i++){
            boolean data=true;
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    data=false;
                    break;
                }
            }
        if(data==true){
        System.out.println(arr[i]+" ");
        }}

        for(int k=0;k<arr1.length;k++){
            boolean data1=true;
            for(int j1=0;j1<arr.length;j1++){
                if(arr[j1]==arr1[k]){
                    data1=false;
                    break;
                }
            }
        if(data1==true){
        System.out.println(arr1[k]+" ");
        }
    
    }
    }
}
