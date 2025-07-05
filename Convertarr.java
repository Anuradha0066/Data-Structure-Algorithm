package DSA;

public class Convertarr {
    public static void main(String[] args) {
        int index=0;
        int [][] arr={{1,2,3},{4,5,6}};
        int[] merge=new int[arr[0].length+arr[1].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               merge[index]=arr[i][j];
               index++; 
            } 
    }
    for(int num:merge)
{
    System.out.print(num+" ");
}
}
}