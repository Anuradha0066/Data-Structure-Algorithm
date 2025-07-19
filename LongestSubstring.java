package Leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
       String s="abcab";
       int data=lengthOfLongestSubstring(s) ;
       System.out.println(data);
    }
    //  public static int lengthOfLongestSubstring(String s) {
    //   int len=0;
    //   for(int i=0;i<s.length();i++){
     
    //    HashSet<Character>set=new HashSet<>();
    //    for(int j=i;j<s.length();j++){
    //     char ch=s.charAt(j);
    //     if(set.contains(ch)){
    //         break;
    //     }
    //     else{
    //         set.add(ch);
    //         len=Math.max(len,j-i+1);
    //     }
    //    }
    //   }


    //     return len;
    //  }



    // public static int lengthOfLongestSubstring(String s) {
    // int len=0 ;
    //  HashSet<Character>set=new HashSet<>();
    // for(int i=0;i<s.length();i++){
    //    char ch=s.charAt(i);
      
    //    if(set.contains(ch)){
    //     len=Math.max(len,set.size());
    //       set.clear();
    //       i--;
    //    }
      
    //    else{
    //     set.add(ch);
        
    //    }
    // }
   
    // return len;

    //}

    public static int lengthOfLongestSubstring(String s) {
    int i=0;
    int len=0;
    HashMap<Character,Integer>map=new HashMap<>();
   
   for(int j=0;j<s.length();j++){
        char ch=s.charAt(j);
        if(map.containsKey(ch)){
        i=Math.max(i,map.get(ch)+1);

        }
        map.put(ch,j);
        len=Math.max(len,j-i+1);
      }
   
    
    return len;
    }
}
