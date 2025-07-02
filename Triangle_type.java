package Logical_Operators;

import java.util.Scanner;

public class Triangle_type {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter sides");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
   if(a==b && b==c ){
    System.out.println("equilateral");
   }
   else if(a==b || b==c|| a==c){
    System.out.println("isosceles");
   }
   else{
    System.out.println("scalene");
   }

   } 
}
