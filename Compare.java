package Array_1D;

public class Compare {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int[] arr1={1,2,3};

        boolean isequal=java.util.Arrays.equals(arr, arr1);
        if(isequal){
            System.out.println("equal");        }
            else{
                System.out.println("not equal");
            }
    }
}
