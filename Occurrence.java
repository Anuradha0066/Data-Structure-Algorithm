package Practice_Question;

public class Occurrence {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,4,5,2};
        int target=2;
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println(count);


    }
}
