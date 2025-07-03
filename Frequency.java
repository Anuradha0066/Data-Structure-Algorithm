package Arr;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        int[] arr={5,6,5,3,5,3,1};
        Map<Integer,Integer> FrequencyMap=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(FrequencyMap.containsKey(arr[i])){
                int freq=FrequencyMap.get(arr[i]);
                freq++;
                FrequencyMap.put(arr[i],freq);
            }
            else{
                FrequencyMap.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer>entry:FrequencyMap.entrySet()){
            System.out.println("Number: "+entry.getKey()+" Frequency: "+entry.getValue());
        }
    }
}
