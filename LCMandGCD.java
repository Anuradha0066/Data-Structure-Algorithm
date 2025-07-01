package Loops;

import java.util.Scanner;

public class LCMandGCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
       int a=sc.nextInt();
        System.out.println("Enter 2nd number");
       int b=sc.nextInt();
       
       int gcd= findGCD(a,b);
       System.out.println("GCD "+gcd);
      int lcm= findLCM(a,b);
      System.out.println("LCM "+lcm);
    }
   
    public static int findGCD(int a,int b){
      while (b!=0){
        int temp=b;
        b=a%b;
        a=temp;
      }
    
   return a;
   
    }
     public static int findLCM(int a,int b){
        return (a*b)/findGCD(a, b);
    }
}
