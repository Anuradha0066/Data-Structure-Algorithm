package Hash_Map;

import java.util.HashMap;
import java.util.HashSet;

public class TargetSum {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();

        int[] arr={1,2,3,4,5};
        int target=3;
        
        for(int i=0;i<arr.length;i++){
            int value=target-arr[i];
            if(map.containsKey(value)){
                System.out.println(value+"+"+arr[i]+"="+target);
              System.out.println(map.get(value)+" "+i);
            }
           map.put(arr[i], i);
        }
    }
}
