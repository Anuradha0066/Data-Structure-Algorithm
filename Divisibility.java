package Logical_Operators;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter  number");
      int num=sc.nextInt();
      if(num%5==0 && num%7==0){
        System.out.println("Divisible");
      }
      else{
        System.out.println("not divisible");
    }
}
    }
