package Loops;

import java.util.Scanner;

public class Number_Checker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=2;i<num;i++){
            if(num%i != 0){
          System.out.println(num+ " is a prime number");
          break;
        }
            else{
                System.out.println("not a prime");
                break;
            }
        }
        
    }
}
