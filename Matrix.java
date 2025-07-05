package Array_2D;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int rows=sc.nextInt();
        System.out.println("Enter no of column");
        int col=sc.nextInt();
        int[][] matrix=new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
               matrix[i][j]=sc.nextInt();

            }
        }
       for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
              System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    System.out.println();
       int[][] transpose=new int[col][rows];
         for(int i=0;i<col;i++){
            for(int j=0;j<rows;j++){
               transpose[i][j]=matrix[j][i];

            }
        }
         for(int i=0;i<col;i++){
            for(int j=0;j<rows;j++){
               System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
     int max=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
            if(matrix[i][j]>max){
                max=matrix[i][j];
            }
            }
        }
        System.out.println(max);
    }

}
