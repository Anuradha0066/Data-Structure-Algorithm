package Loops;

import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int limit=sc.nextInt();
        
            for(int a=0;a<=limit;a++){
                for(int b=a+1;b<=limit;b++){
                    for(int c=b+1;c<=limit;c++){
                   if (a*a + b*b == c*c) {
                    System.out.println(a+" "+b+" "+c);
                   }
                    }
                }
            }
        
    }
}
