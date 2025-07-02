package Logical_Operators;

import java.util.Scanner;

public class Employee_Eligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter working hours");
        int hours=sc.nextInt();
      System.out.println("Enter employment status");
      String status=sc.next();
        if(hours>40 && status.equals("full-time")){
            System.out.println("eligible for overtime pay");
        }
        else{
            System.out.println("not eligible");
        }
    }
}
