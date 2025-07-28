package Recursion;

public class Ques {
    public static void sum(int n){
        if(n>0){
            sum(--n);
            System.out.println(n);
            sum(--n);
        }
    }
    public static void main(String[] args) {
        sum(4);
    }
}
