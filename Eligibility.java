package Logical_Operators;

import java.util.Scanner;

public class Eligibility {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter age");
    int age=sc.nextInt();
    if(age>=18 && age>0){
        System.out.println("Eligible");
    }
    else{
        System.out.println("not eligible");
    }
   } 
}
