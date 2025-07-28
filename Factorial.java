package Recursion;

public class Factorial {
    public static int fact(int a){
     int f=1;
      if(a==1){
       return 1;
      }
else{
      f=a*fact(a-1);
      return f;}
        }
    
    public static void main(String[] args) {
      int data=  fact(5);
      System.out.println(data);
    }
}
