package Practice_Question;

import java.util.HashMap;

public class PairsOfSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;
        
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]+arr[j]==target){
        //             System.out.println(arr[i]+" "+arr[j]);
        //         }
        //     }
        // }

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int n=target-arr[i];
            if(map.containsKey(n)){
                int count=map.get(n);
              for(int j=0;j<count;j++){
                System.out.println(n+" "+arr[i]);
              }
            }
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
       
    }
}
