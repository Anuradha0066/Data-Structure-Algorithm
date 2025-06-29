import java.util.Scanner;

public class Grading_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter marks");
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();

        int Average=(sub1+sub2+sub3)/3;

        if(Average>=90){
            System.out.println("Grade A");
        }
        else if(Average>=80 && Average<90){
            System.out.println("Grade B");
        }
         else if(Average>=70 && Average<80){
            System.out.println("Grade C");
        }
         else if(Average>=60 && Average<70){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
    }
}
