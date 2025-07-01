package Loops;

import java.util.Scanner;

public class FibonacciSeries {     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of terms");
         int n=sc.nextInt();
         printFibonacci(n);
    }
    public static void printFibonacci(int n){
        int a=0; 
        int b=1;
       
        for(int i=0;i<n;i++){
             System.out.println(a+" ");
            int temp=a;
           a=b;
          b=temp+b;
        }
        System.out.println();
    }
}
