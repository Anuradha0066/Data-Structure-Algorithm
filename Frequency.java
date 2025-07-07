package Hash_Map;

import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        HashMap<Character,Integer>map=new HashMap<>();
        String str="helllooo";

        str.toCharArray();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch,1 );
            }
        }

        for(char key:map.keySet()){
          System.out.println(key +"="+map.get(key));
        }
    }
}
