import java.util.Scanner;

public class Discount_Calsi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter price");
        double totalPrice =sc.nextDouble();
        System.out.println("Enter items");
        int items=sc.nextInt();
       
        if(totalPrice>100 && items>=5){
        double discount=totalPrice/10;
        System.out.println("discount: "+discount);
        double new_cost=totalPrice-discount;
        System.out.println("After discount total cost: "+new_cost);
        }
       else if(totalPrice>50 && totalPrice<100){
        double discount=totalPrice/20;
        System.out.println("discount: "+discount);
        double new_cost=totalPrice-discount;
        System.out.println("After discount total cost: "+new_cost);
        }
        else{
            System.out.println("No discount");
        }
    }
}
