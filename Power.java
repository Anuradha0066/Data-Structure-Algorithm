package Loops;

import java.util.Scanner;

public class Power {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the base");
    int a=sc.nextInt();
    System.out.println("Enter the power");
    int b=sc.nextInt();
    int c=(int) Math.pow(a, b);
    System.out.println(c);
  }  
}
