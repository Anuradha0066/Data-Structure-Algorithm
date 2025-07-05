package Array_1D;

public class SumoftwoArr {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int[] arr1={3,4,5};
        int[] sum=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            sum[i]=arr[i]+arr1[i];
        }
        System.out.println("sum: ");
        for(int val:sum){
            System.out.print(val+ " ");
        }
    }
}
