import java.util.Scanner;

public class Shipping_Cost_Calculator {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Eneter weight");
    int weight=sc.nextInt();

    System.out.println("Enetr Distance");
    int distance=sc.nextInt();

    if(weight<=10 && distance<=100){
        System.out.println("Cost is $5");
    }
    else if(weight>10 && weight<20 || distance>100 && distance<500){
        System.out.println("Cost is $10");
    }
    else{
        System.out.println("Cost is $20");
    }
   } 
}
