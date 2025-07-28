package Recursion;

public class Fibonacci {
    static int a=0,b=1;
    public static void fun(int n){
        
        if(n>=1){
            int c=a+b;
             System.out.print(" "+c);
             a=b;
             b=c;
             
             fun(n-1);
        
        }
       
        
    }
    public static void main(String[] args) {
        int n=7;
        System.out.print(a+" "+b);
        fun(n-2);
        
    }
}
