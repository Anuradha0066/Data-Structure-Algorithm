package Hash_Map;

import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        map.put("one",1);
        map.put("two",1);
        System.out.println(map);
        System.out.println(map.get("hello"));
        System.out.println(map.getOrDefault("two",2));
      System.out.println(map.getOrDefault("three",2));

    }
}
