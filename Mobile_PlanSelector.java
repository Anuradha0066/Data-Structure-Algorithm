import java.util.Scanner;

public class Mobile_PlanSelector {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter number of minutes");
      int min=sc.nextInt();
      System.out.println("Enter number of messages");
      int msg=sc.nextInt();

      double planACost= calculatePlanACost (min,msg);
      double planBCost= calculatePlanBCost (min,msg);
      double planCCost=60.0;
     
      System.out.println("Plan A: "+planACost);
      System.out.println("Plan B: "+planBCost);
      System.out.println("Plan C: "+planCCost);

      String recommendedPlan= determineRecommendedPlan(planACost,planBCost,planCCost);
      System.out.println("Recommended plan: "+recommendedPlan);  

      
       sc.close();
    }
      public static double calculatePlanACost (int min,int msg){
      double cost=25.0;

      if(min>100){
        cost+=(min-100)*0.10;
      }
      if(msg>100){
        cost+=(msg-100)*0.05;
      }
      return cost;
      }

      public static double calculatePlanBCost(int min,int msg){
      double cost=40.0;
      if(min>200){
        cost+=(min-200)*0.08;
      }
      if(msg>200){
        cost+=(msg-200)*0.03;
      }
      return cost;
      }

      public static String determineRecommendedPlan(double planACost,double planBCost,double planCCost){
        if(planACost<=planBCost && planACost<=planCCost){
            return "plan A";
        }
        else if(planACost>=planBCost && planBCost<=planCCost){
            return "plan B";
        }
        else{
            return "Plan C";
        }
      }
    
    
    }

