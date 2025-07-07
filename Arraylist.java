package Array_List;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(2,11); //it adds value by replacing the value at particular index
        arr.set(2,12);  //it adds value by shifting the value at that particular index
    //    System.out.println(arr.contains(3));
    //   System.out.println(arr.get(0));
    
      arr.remove(1);
        int even=0;
        int odd=0;
        for(int var: arr){
             System.out.println(var);
        //     // if(var%2==0){
        //     // System.out.println(var);}
            
        }

    }
}
