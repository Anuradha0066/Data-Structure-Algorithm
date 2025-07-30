package Recursion;

public class Permutation {
    static int fn(int n){
        if(n==1){
            return 1;
        }
        return n*fn(n-1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int data=fn(arr.length);
        System.out.println(data);
        
    }
}
