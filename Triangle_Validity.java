package Logical_Operators;

import java.util.Scanner;

public class Triangle_Validity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr sides of triangle");
        int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
     if(a+b>c && b+c>a && c+a>b){
        System.out.println("valid triangle");
     }
     else{
        System.out.println("triangle is not valid");
     }
    }
}
