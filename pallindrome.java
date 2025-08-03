package Recursion;

public class pallindrome {
    static boolean fun(String str,int s,int e){
        
    if(s==e){
      return true;
    }
   if(str.charAt(s)!=str.charAt(e)){
    return false;
   }

   return fun(str, s+1, e-1);
    }
    public static void main(String[] args) {
        String str="DAD";

       boolean s= fun(str,0,str.length()-1);
       System.out.println(s);
    }
}
