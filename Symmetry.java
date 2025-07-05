package Array_2D;

import java.util.Scanner;

public class Symmetry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int rows=sc.nextInt();
         System.out.println("Enter col");
        int col=sc.nextInt();
        int[][] arr=new int[rows][col];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
               arr[i][j]=sc.nextInt();

            }
        }
       for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
              System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    System.out.println();

if(rows==col){
    boolean equal=true;
    for(int i=0;i<rows;i++){
        for(int j=0;j<col;j++){
            if( arr[i][j]!=arr[j][i]){
                equal=false;
            }
           
        }
    }
    if(equal==true){
        System.out.println("Symmetric");
    }
    else{
        System.out.println("not sy");
    }
    }
 else{
        System.out.println("noooooo");
    }
    }
}
